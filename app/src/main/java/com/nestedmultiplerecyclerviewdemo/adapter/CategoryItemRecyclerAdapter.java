package com.nestedmultiplerecyclerviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nestedmultiplerecyclerviewdemo.R;
import com.nestedmultiplerecyclerviewdemo.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class CategoryItemRecyclerAdapter extends RecyclerView.Adapter<CategoryItemRecyclerAdapter.CategoryItemViewHolder> {
    Context context;
    List<CategoryItem> categoryItemList = new ArrayList<>();

    public CategoryItemRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.category_row_items, parent, false);

        CategoryItemViewHolder categoryItemViewHolder = new CategoryItemViewHolder(view);
        return categoryItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, int position) {
        holder.itemImageView.setImageResource(categoryItemList.get(position).getImageUrl());
        holder.textView.setText(categoryItemList.get(position).getItemId());
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }


    public class CategoryItemViewHolder extends RecyclerView.ViewHolder{
        ImageView itemImageView;
        TextView textView;

        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImageView = itemView.findViewById(R.id.item_imageView);
            textView = itemView.findViewById(R.id.titleOfTextView);
        }
    }
}
