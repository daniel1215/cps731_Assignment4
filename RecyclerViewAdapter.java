package com.example.seongjoon_chung_cps731_500503264_assignment4_redo;

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

    private RecyclerViewClickListener listener;

    public RecyclerViewAdapter(List<String> recipeTitles, List<String> recipeDescription, RecyclerViewClickListener listener) {
        this.recipeTitles = recipeTitles;
        this.recipeDescription = recipeDescription;
        this.listener = listener;
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

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView recipeTitle;
        TextView recipeDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recipeTitle = itemView.findViewById(R.id.recipeTitle);
            recipeDescription = itemView.findViewById(R.id.recipeDescription);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            listener.onClick(view, getAdapterPosition());
        }
    }

    public interface RecyclerViewClickListener {
        void onClick(View view, int position);
    }
}
