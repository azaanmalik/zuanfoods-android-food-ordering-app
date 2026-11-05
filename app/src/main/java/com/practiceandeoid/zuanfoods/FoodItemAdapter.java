package com.practiceandeoid.zuanfoods;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FoodItemAdapter extends FragmentStatePagerAdapter {
     int tabCount;
     public  FoodItemAdapter(@NonNull FragmentManager fm, int tabCounts){
         super(fm);
         this.tabCount=tabCounts;
     }
     @NonNull

    public Fragment getItem(int position){
         switch (position)
         {
             case 0 :
                 return new FoodsFragment();
             case 1 :
                 return new FoodsFragment();
             case 2:
                 return new FoodsFragment();
             default:
                 return  null;

         }
     }


    @Override
    public int getCount() {
        return tabCount;
    }
}
