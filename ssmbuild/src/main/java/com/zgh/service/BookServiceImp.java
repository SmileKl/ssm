package com.zgh.service;

import com.zgh.dao.BookMapper;
import com.zgh.pojo.Books;

import java.util.List;

public class BookServiceImp implements BookService {

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBook(int bookID) {
        return bookMapper.deleteBook(bookID);
    }

    public int updateBook(Books book) {
        return bookMapper.updateBook(book);
    }

    public Books queryBookById(int bookID) {
        return bookMapper.queryBookById(bookID);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
