package com.mflyyou.demo;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

import java.util.Objects;

@Getter
public enum SexEnum implements IEnum<Integer> {
    NAN(1, "男"),
    NV(2, "女");

    private final Integer code;

    @JsonValue
    private final String comment;

    SexEnum(Integer code, String comment) {
        this.code = code;
        this.comment = comment;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static SexEnum forValue(Integer value) {
        for (SexEnum sexEnum : SexEnum.values()) {
            if (Objects.equals(sexEnum.code, value)) {
                return sexEnum;
            }
        }
        return null;
    }

    @Override
    public Integer getValue() {
        return code;
    }
}
