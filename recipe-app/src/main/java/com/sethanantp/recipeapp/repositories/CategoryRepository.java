package com.sethanantp.recipeapp.repositories;

import com.sethanantp.recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
