package com.wuyubin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wuyubin.entity.Book;
import com.wuyubin.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class BookTest {
    @Autowired
    private IBookService iBookService;

    @Test
    public void saveBook(){
        Book book=new Book();
        book.setName("李四");
        book.setAuthor("张三");
        iBookService.save(book);
    }
    @Test
    public void delBook(){
        iBookService.removeById(13);
    }
    @Test void select_where(){
        QueryWrapper<Book> wrapper=new QueryWrapper<>();
        wrapper.like("author","鸟");
        List<Book> list=iBookService.list(wrapper);

        list.forEach(System.out::println);

    }
    @Test
    public void test_page() throws JsonProcessingException {
        Page<Book> page=new Page<>(1,3);

        QueryWrapper<Book> wrapper=new QueryWrapper<>();

        wrapper.like("author","鸟");

        Page<Book> pageInfo=iBookService.page(page,wrapper);

        ObjectMapper objectMapper=new ObjectMapper();

        String json=objectMapper.writeValueAsString(pageInfo);

        System.out.println(json);

    }

}
