package com.zgh.controller;

import com.zgh.pojo.Books;
import com.zgh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
//        for (Books book : books) {
//            System.out.println(book);
//        }
        return "allBook";
    }

    @RequestMapping("/toAddBook")
    public String toAddPaper() {
        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addPaper(Books books){
//        System.out.println(books);
        bookService.addBook(books);
//        return "allBook";
        return "redirect:/book/allBook";
    }

    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(Model model,int bookID) {
        Books books = bookService.queryBookById(bookID);
        model.addAttribute("uBook",books);
        return "updateBook";
    }

    @RequestMapping("/updateBook")
    public String pdatePaper(Books books) {
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int bookID) {
        bookService.deleteBook(bookID);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/queryByName")
    public String queryByName(String queryBookName,Model model) {
        System.out.println("bookName :"+queryBookName);
        Books books = bookService.queryBookByName(queryBookName);
        System.out.println(books);
        List<Books> list = new ArrayList<Books>();
        list.add(books);
        model.addAttribute("list",list);
//        return "redirect:/book/allBook";
        return "allBook";
    }



}
