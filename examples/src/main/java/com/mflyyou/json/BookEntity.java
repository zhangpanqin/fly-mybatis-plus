package com.mflyyou.json;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.Fastjson2TypeHandler;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

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
