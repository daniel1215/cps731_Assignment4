package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private List<String> recipeTitles;
    private List<String> recipeDescription;

    private RecipeDetails[] recipeDetails;

    public RecyclerViewAdapter(List<String> recipeTitles, List<String> recipeDescription, RecipeDetails[] recipeDetails) {
        this.recipeTitles = recipeTitles;
        this.recipeDescription = recipeDescription;
        this.recipeDetails = recipeDetails;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.recipeTitle.setText(recipeTitles.get(position));
        holder.recipeDescription.setText(recipeDescription.get(position));

    }

    @Override
    public int getItemCount() {
        return recipeTitles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView recipeTitle;
        TextView recipeDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = itemView.findViewById(R.id.recipeTitle);
            recipeDescription = itemView.findViewById(R.id.recipeDescription);

        }
    }
}
