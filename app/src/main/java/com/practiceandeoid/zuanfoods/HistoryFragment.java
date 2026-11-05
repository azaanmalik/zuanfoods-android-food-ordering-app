package com.practiceandeoid.zuanfoods;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HistoryFragment extends Fragment {

Button btnorder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_history, container, false);
        btnorder=view.findViewById(R.id.BacktoHome);
        btnorder.setOnClickListener(view1 -> {
            // Navigate to FoodDetailActivity
            Intent intent = new Intent(getContext(), DashboardFragment.class);
            startActivity(intent);
        });

        return view;
    }
}