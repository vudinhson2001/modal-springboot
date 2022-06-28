package com.example.qlkhspringboot.controller;

import com.example.qlkhspringboot.model.Category;
import com.example.qlkhspringboot.model.Product;
import com.example.qlkhspringboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
@RequestMapping("/categorys")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping()
    public ResponseEntity<Iterable<Category>> findAll() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }
}
