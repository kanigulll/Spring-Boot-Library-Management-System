package com.kani.demo.controller;

import com.kani.demo.model.Book;
import com.kani.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

   
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listBooks", bookRepository.findAll());
        return "index"; 
    }

   
    @GetMapping("/showNewBookForm")
    public String showNewBookForm(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "new_book"; 
    }

  
    @PostMapping("/saveBook")
    public String saveBook(@ModelAttribute("book") Book book) {
        bookRepository.save(book);
        return "redirect:/";
    }
    
    
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable(value = "id") Long id) {
        bookRepository.deleteById(id);
        return "redirect:/";
    }
}