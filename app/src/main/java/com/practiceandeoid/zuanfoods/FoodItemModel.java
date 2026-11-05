package com.practiceandeoid.zuanfoods;

public class FoodItemModel {
    int food_image;
    String Food_name,Food_price;

    public FoodItemModel() {
    }

    public FoodItemModel(int food_image, String food_name, String food_price) {
        this.food_image = food_image;
        Food_name = food_name;
        Food_price = food_price;
    }

    public int getFood_image() {
        return food_image;
    }

    public void setFood_image(int food_image) {
        this.food_image = food_image;
    }

    public String getFood_name() {
        return Food_name;
    }

    public void setFood_name(String food_name) {
        Food_name = food_name;
    }

    public String getFood_price() {
        return Food_price;
    }

    public void setFood_price(String food_price) {
        Food_price = food_price;
    }
}
