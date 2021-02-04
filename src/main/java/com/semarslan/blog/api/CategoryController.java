package com.semarslan.blog.api;

import com.semarslan.blog.com.Category;
import com.semarslan.blog.services.CategoryService;
import com.semarslan.blog.services.MapValidationErrorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final MapValidationErrorService mapValidationErrorService;

    @GetMapping
    public ResponseEntity<List<?>> getAll() {

        List<Category> categories = categoryService.getAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveOrUpdate(@Valid @RequestBody Category category, BindingResult result) {
        ResponseEntity<?> errorMap = mapValidationErrorService.MapValidationService(result);
        if (errorMap != null) return errorMap;

        return new ResponseEntity<Category>(categoryService.createOrUpdate(category), HttpStatus.OK);
    }

    @GetMapping("/{categoryName}")
    public ResponseEntity<?> getCategoryByName(@PathVariable String categoryName) {
        Category category = categoryService.findByCategoryName(categoryName);
        return new ResponseEntity<Category>(category, HttpStatus.OK);
    }

    @DeleteMapping("/{categoryName}")
    public ResponseEntity<?> deleteCategory(@PathVariable String categoryName) {
        categoryService.delete(categoryName);

        return new ResponseEntity<String>(categoryName + " deleted", HttpStatus.OK);
    }
}
