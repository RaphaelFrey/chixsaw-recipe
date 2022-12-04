package com.chixsaw.chixsawrecipe.services;

import com.chixsaw.chixsawrecipe.commands.RecipeCommand;
import com.chixsaw.chixsawrecipe.domain.Recipe;

import java.util.Set;

/**
 * Created by Raphael Frey on 04.12.2022
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
    RecipeCommand saveRecipeCommand(RecipeCommand recipeCommand);
}
