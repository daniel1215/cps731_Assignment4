package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;

    private List<String> recipeTitles;
    private List<String> recipeDescription;

    private RecipeDetails[] recipeDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeTitles = new ArrayList<>();
        recipeDescription = new ArrayList<>();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(recipeTitles, recipeDescription, recipeDetails);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);

        addTitles();
        addDescription();

    }

    private void addTitles() {
        recipeTitles.add("Shrimp Scampi");
        recipeTitles.add("Easy Cucumber, Peach, and Basil Salad");
        recipeTitles.add("Chicken Piccata");
        recipeTitles.add("Microwave Poached Eggs");
        recipeTitles.add("Honey Mustard Baked Salmon");
        recipeTitles.add("Quick and Easy Pan-Fried Flank Steak");
        recipeTitles.add("Pasta with Tuna and Capers in White Wine Sauce");
    }

    private void addDescription() {
        recipeDescription.add("Quick and easy shrimp scampi. Shrimp sautéed in easy scampi sauce with garlic, butter, olive oil, and white wine, tossed with red pepper flakes and parsley.");
        recipeDescription.add("Cool, crunchy cucumbers combined with sweet, juicy peaches and dressed in a peppery basil vinaigrette is a great way to make the most of summer and all its gorgeous flavors. This refreshing salad is easy to make and goes great with grilled meat.");
        recipeDescription.add("Easy Chicken Piccata! Takes 20 minutes to make. Chicken breast cutlets, dredged in flour, browned, served with sauce of butter, lemon juice, capers, and stock or wine.");
        recipeDescription.add("EASIEST way ever to poach eggs—all you need is a mug and a microwave! Ready in about a minute. Use this poached egg method to top a quick lunch salad, toast for an easy breakfast or roasted vegetables for dinner.");
        recipeDescription.add("Dinner is 6 ingredients and 20 minutes away with this Honey Mustard Salmon. Honey mustard is an easy way to dress up salmon, and baking it in the oven means your hands are free to throw together a salad or other side dish.");
        recipeDescription.add("A quick and easy way of cooking lean flank steak on the stovetop.");
        recipeDescription.add("Pasta served with a sauce made with oil-packed canned tuna, onions, capers, white wine, and parsley.");

    }
}
