package org.example.test_spring.resources;

import org.example.test_spring.entities.Category;
import org.example.test_spring.services.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryServices services;


    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> Categorys = services.findAll();
        return ResponseEntity.ok().body(Categorys);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id) {
        Category Category = services.findById(id);
        return ResponseEntity.ok().body(Category);
    }

}
