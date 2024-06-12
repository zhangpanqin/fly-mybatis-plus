package com.mflyyou.handler;

import com.alibaba.fastjson2.TypeReference;
import com.mflyyou.json.BookDomain1;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.lang.reflect.Field;
import java.util.List;

@MappedTypes({List.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class BookDomain1JsonDetailListJsonDetailFastjson2TypeHandler2 extends ListJsonDetailFastjson2TypeHandler<BookDomain1.JsonDetail> {

    private static final TypeReference<List<com.mflyyou.json.BookDomain1.JsonDetail>> specificType = new TypeReference<List<BookDomain1.JsonDetail>>() {
    };

    public BookDomain1JsonDetailListJsonDetailFastjson2TypeHandler2() {
        super(List.class);
    }

    public BookDomain1JsonDetailListJsonDetailFastjson2TypeHandler2(Class<?> type) {
        super(type);
    }

    public BookDomain1JsonDetailListJsonDetailFastjson2TypeHandler2(Class<?> type, Field field) {
        super(type, field);
    }

    @Override
    public TypeReference<List<com.mflyyou.json.BookDomain1.JsonDetail>> specificType() {
        return specificType;
    }
}