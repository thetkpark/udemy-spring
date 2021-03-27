package com.sethanantp.recipeapp.repositories;

import com.sethanantp.recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
