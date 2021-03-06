package com.sethanantp.recipeapp.services;

import com.sethanantp.recipeapp.commands.RecipeCommand;
import com.sethanantp.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
