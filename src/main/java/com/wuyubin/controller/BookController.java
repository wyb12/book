package com.wuyubin.controller;


import com.wuyubin.entity.Book;
import com.wuyubin.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 吴宇斌
 * @since 2020-02-21
 */
@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService iBookService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Book> getList(){
        return iBookService.findAll();
    }

}

