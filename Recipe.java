package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView recipeIngredients = findViewById(R.id.recipeIngredients);
        TextView recipeMethods = findViewById(R.id.recipeMethods);

        String ingredients = "";
        String methods = "";

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            ingredients = getIntent().getStringExtra("ingredients");
            methods = getIntent().getStringExtra("methods");

            recipeIngredients.setText(ingredients);
            recipeMethods.setText(methods);
        }



    }

}
