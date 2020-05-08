package com.zgh.dao;

import com.zgh.pojo.Books;

import java.util.List;

public interface BookMapper {

    //增加一个book
    int addBook(Books book);

    //根据id删除一个book
    int deleteBook(int bookID);

    //更新book
    int updateBook(Books book);

    //根据id查询返回一个book
    Books queryBookById(int bookID);

    //查询全部book，返回List集合
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);

}
