package org.example.test_spring.services;

import org.example.test_spring.entities.Category;

import org.example.test_spring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {

        Optional<Category> category = repository.findById(id);
        return category.get();

    }
}
