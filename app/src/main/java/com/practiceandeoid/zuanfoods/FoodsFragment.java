package com.practiceandeoid.zuanfoods;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FoodsFragment extends Fragment {

    public FoodsFragment() {
    }

    RecyclerView recyleview;
    FoodAdapter foodAdapter;
    List<FoodItemModel>list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_foods, container, false);
       list =new ArrayList<>();
       list.add(new FoodItemModel(R.drawable.foodimg1,"Food name 1","RS :Food price"));
        list.add(new FoodItemModel(R.drawable.foodimg2,"Food name 2","RS :Food price"));
        list.add(new FoodItemModel(R.drawable.foodimg1,"Food name 3","RS :Food price"));
        list.add(new FoodItemModel(R.drawable.foodimg2,"Food name 4","RS :Food price"));
        list.add(new FoodItemModel(R.drawable.foodimg1,"Food name 5","RS :Food price"));
        list.add(new FoodItemModel(R.drawable.foodimg2,"Food name 6","RS :Food price"));
        list.add(new FoodItemModel(R.drawable.foodimg1,"Food name 7","RS :Food price"));

        Log.d("RecyclerView", "Items in FoodsFragment count: " + list.size());

recyleview =view.findViewById(R.id.food_recycler);
foodAdapter=new FoodAdapter(list,requireActivity());
LinearLayoutManager manager =new LinearLayoutManager(getActivity().getApplicationContext(),recyleview.HORIZONTAL,false);
recyleview.setLayoutManager(manager);
        recyleview.setAdapter(foodAdapter);
        return  view;
    }
}