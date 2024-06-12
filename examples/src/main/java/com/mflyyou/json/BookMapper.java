package com.mflyyou.json;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper extends BaseMapper<BookEntity> {

    List<BookDomain> selectAll();

    List<BookDomain1> selectAll1();
    List<BookDomain2> selectAll2();

    List<BookDomain3> selectAll3();
}
