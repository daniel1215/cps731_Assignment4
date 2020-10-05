package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;

public class RecipeDetails {
    private String recipeIngredients;
    private String recipeMethods;
    private Integer recipeImage;

    public RecipeDetails(String recipeIngredients, String recipeMethods, Integer recipeImage) {
        this.recipeIngredients = recipeIngredients;
        this.recipeMethods = recipeMethods;
        this.recipeImage = recipeImage;
    }

    public String getRecipeIngredients() {
        return recipeIngredients;
    }

    public void setRecipeIngredients(String recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }

    public String getRecipeMethods() {
        return recipeMethods;
    }

    public void setRecipeMethods(String recipeMethods) {
        this.recipeMethods = recipeMethods;
    }

    public Integer getRecipeImage() {
        return recipeImage;
    }

    public void setRecipeImage(Integer recipeImage) {
        this.recipeImage = recipeImage;
    }
}


