# mybatis

## Open api

[Open api](http://localhost:8080/swagger-ui.html)

## json 处理

1. 如果是自定义 sql 必须使用 resultMap，然后指定 字段的 typeHandler。

```java

@Data
public class BookDomain {
    private Long id;
    private String name;
    private List<JsonDetail> dataJson;

    @Data
    public static class JsonDetail implements Serializable {
        private String url;
        private String fileName;
    }
}

```

```xml

<resultMap id="BookDomainId" type="com.mflyyou.json.BookDomain">
    <result column="data_json" jdbcType="VARCHAR" javaType="List" property="dataJson"
            typeHandler="com.baomidou.mybatisplus.extension.handlers.Fastjson2TypeHandler"/>
</resultMap>

<select id="selectAll" resultMap="BookDomainId">
select * from book
</select>
```

2. 如果是Entity单表操作，不需要处理，只需在entity字段加注解就行
   autoResultMap 必须加。

```java

@Data
@TableName(value = "`book`", autoResultMap = true)
public class BookEntity {
    @TableId(type = IdType.INPUT)
    private Long id;
    private String name;
    @TableField(typeHandler = Fastjson2TypeHandler.class)
    private List<JsonDetail> dataJson;

    @Data
    public static class JsonDetail implements Serializable {
        private String url;
        private String fileName;
    }
}
```

3. 不是 entity 没办法使用, 且不在 xml 制定 handle，在 class 制定，比如

```java

@Data
@TableName(autoResultMap = true)
public class BookDomain1 {
    private Long id;
    private String name;

    @TableField(typeHandler = Fastjson2TypeHandler.class)
    private List<JsonDetail> dataJson;

    @Data
    public static class JsonDetail implements Serializable {
        private String url;
        private String fileName;
    }
}
```

```xml

<select id="selectAll1" resultType="com.mflyyou.json.BookDomain1">
    select * from book
</select>
```
