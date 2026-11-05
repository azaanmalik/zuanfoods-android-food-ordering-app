package com.practiceandeoid.zuanfoods;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;


public class DashboardFragment extends Fragment {
 TabLayout tabLayout;
 ViewPager viewPager;
    @NonNull
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false);
    }
    @NonNull
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabLayout = view.findViewById(R.id.food_tab);

        tabLayout.addTab(tabLayout.newTab().setText("Foods"));

        tabLayout.addTab(tabLayout.newTab().setText("Drinks"));

        tabLayout.addTab(tabLayout.newTab().setText("Snacks"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final FoodItemAdapter adapter = new FoodItemAdapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager = view.findViewById(R.id.food_viewpager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        viewPager.setAdapter(adapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
@NonNull
            @Override

            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
            }
@NonNull
            @Override

            public void onTabUnselected(TabLayout.Tab tab) {

            }
@NonNull
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}