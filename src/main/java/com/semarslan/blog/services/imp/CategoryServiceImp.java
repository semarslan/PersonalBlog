package com.semarslan.blog.services.imp;

import com.semarslan.blog.com.Category;
import com.semarslan.blog.exceptions.CategoryNameException;
import com.semarslan.blog.repositories.CategoryRepository;
import com.semarslan.blog.services.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImp implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createOrUpdate(Category category) {

        try {
            category.setName(category.getName().toUpperCase());
            return categoryRepository.save(category);
        }catch (Exception e) {
            throw new CategoryNameException(category.getName().toUpperCase() + " already exists");
        }

    }

    @Override
    public void delete(String name) {
        Category inDb = categoryRepository.findByName(name);
        categoryRepository.delete(inDb);
    }

    @Override
    public Category findByCategoryName(String categoryName) {
        Category category = categoryRepository.findByName(categoryName);

        if (category == null) {
            throw new CategoryNameException(category.getName().toUpperCase() + " already exists");
        }

        return category;
    }
}
