package com.mflyyou.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("`user`")
public class User implements Serializable {
    @TableId(type = IdType.INPUT)
    private Long id;
    private String name;
    private SexEnum sex;
    private String email;
}