package com.mflyyou.handler;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.TypeReference;
import com.baomidou.mybatisplus.extension.handlers.AbstractJsonTypeHandler;

import java.lang.reflect.Field;
import java.util.List;

public abstract class ListJsonDetailFastjson2TypeHandler<T> extends AbstractJsonTypeHandler<List<T>> {


    public ListJsonDetailFastjson2TypeHandler(Class<?> type) {
        super(type);
    }

    public ListJsonDetailFastjson2TypeHandler(Class<?> type, Field field) {
        super(type, field);
    }

    protected abstract TypeReference<List<T>> specificType();

    @Override
    public List<T> parse(String json) {
        return JSON.parseObject(json, this.specificType());
    }

    @Override
    public String toJson(List<T> obj) {
        return JSON.toJSONString(obj, JSONWriter.Feature.WriteMapNullValue,
                JSONWriter.Feature.WriteNullListAsEmpty, JSONWriter.Feature.WriteNullStringAsEmpty);
    }

}