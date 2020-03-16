package com.wuyubin.mapper;

import com.wuyubin.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 吴宇斌
 * @since 2020-02-21
 */
public interface BookMapper extends BaseMapper<Book> {

    @Select("select * from t_book")
    List<Book> findAll();
}
