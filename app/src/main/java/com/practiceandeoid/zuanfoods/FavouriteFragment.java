package com.practiceandeoid.zuanfoods;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;

public class FavouriteFragment extends Fragment {
Button btnfood;
View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favourite, container, false);
        btnfood=view.findViewById(R.id.Backtofood);
        btnfood.setOnClickListener(view1 -> {
            // Navigate to FoodDetailActivity
            Intent intent = new Intent(getContext(), FoodDetailActivity.class);
            startActivity(intent);
        });

        return view;
    }
}