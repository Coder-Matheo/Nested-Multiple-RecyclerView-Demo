package com.nestedmultiplerecyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.nestedmultiplerecyclerviewdemo.adapter.CategoryItemRecyclerAdapter;
import com.nestedmultiplerecyclerviewdemo.adapter.MainRecyclerAdapter;
import com.nestedmultiplerecyclerviewdemo.model.AllCategory;
import com.nestedmultiplerecyclerviewdemo.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem( R.drawable.fran1,"Hall"));
        categoryItemList.add(new CategoryItem( R.drawable.fran2,"Hall1"));
        categoryItemList.add(new CategoryItem( R.drawable.fran3,"Hall2"));
        categoryItemList.add(new CategoryItem( R.drawable.fran4,"Hall3"));
        categoryItemList.add(new CategoryItem( R.drawable.fran1,"Hall4"));
        categoryItemList.add(new CategoryItem( R.drawable.fran2,"Hall5"));
        categoryItemList.add(new CategoryItem( R.drawable.fran3,"Hall6"));
        categoryItemList.add(new CategoryItem( R.drawable.fran4,"Hall7"));


        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem( R.drawable.fran1,"Number 1"));
        categoryItemList2.add(new CategoryItem( R.drawable.fran2,"Number 2" ));
        categoryItemList2.add(new CategoryItem( R.drawable.fran3,"Number 3"));
        categoryItemList2.add(new CategoryItem( R.drawable.fran4,"Number 4"));

        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem( R.drawable.fran1,"Number 1"));
        categoryItemList3.add(new CategoryItem( R.drawable.fran2,"Number 2"));
        categoryItemList3.add(new CategoryItem( R.drawable.fran3,"Number 3"));
        categoryItemList3.add(new CategoryItem( R.drawable.fran4,"Number 4"));





        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Hollywood", categoryItemList));
        allCategoryList.add(new AllCategory("Best of Oscar", categoryItemList2));
        allCategoryList.add(new AllCategory("Movies dubbed in hindi", categoryItemList3));
        allCategoryList.add(new AllCategory("Movies dubbed in hindi", categoryItemList3));
        allCategoryList.add(new AllCategory("Movies dubbed in hindi", categoryItemList3));

        setMainCategoryRecycler(allCategoryList);
    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){
        mainCategoryRecycler = findViewById(R.id.main_recyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);

        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);
    }


    public void setCatItemRecycler(RecyclerView recyclerView, List<CategoryItem> categoryItemList){
        CategoryItemRecyclerAdapter itemRecyclerAdapter = new CategoryItemRecyclerAdapter(context, categoryItemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(itemRecyclerAdapter);

    }
}