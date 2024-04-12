package com.example.ogani.service;

import java.util.List;

import com.example.ogani.entity.Category;
import com.example.ogani.model.request.CreateCategoryRequest;

public interface CategoryService {
    List<Category> findAll();

    List<Category> getListEnabled();

    Category createCategory(CreateCategoryRequest request);

    Category updateCategory(long id, CreateCategoryRequest request);

    //Kich hoat trang thai
    void enableCategory(long id);

    //Xoa danh muc
    void deleteCategory(long id);
}
