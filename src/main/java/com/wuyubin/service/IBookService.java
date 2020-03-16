package com.wuyubin.service;

import com.wuyubin.entity.Book;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 吴宇斌
 * @since 2020-02-21
 */
public interface IBookService extends IService<Book> {

    List<Book> findAll();
}
