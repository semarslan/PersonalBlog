package com.semarslan.blog.services;

import com.semarslan.blog.com.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category createOrUpdate(Category category);

    void delete(String name);

    Category findByCategoryName(String categoryName);
}
