package com.nestedmultiplerecyclerviewdemo.model;

public class CategoryItem {

    int imageUrl;
    String itemId;

    public CategoryItem(int imageUrl, String itemId) {
        this.imageUrl = imageUrl;
        this.itemId = itemId;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
}
