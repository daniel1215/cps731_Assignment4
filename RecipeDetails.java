package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;


public class RecipeDetails {
    private String recipeIngredients;
    private String recipeMethods;

    public RecipeDetails(String recipeIngredients, String recipeMethods) {
        this.recipeIngredients = recipeIngredients;
        this.recipeMethods = recipeMethods;
     }

    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    public String getRecipeMethods() {
        return recipeMethods;
    }
}


