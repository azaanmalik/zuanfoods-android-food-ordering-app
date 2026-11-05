package com.practiceandeoid.zuanfoods;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
public class MainDashboard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Set default fragment to HomeFragment
        loadFragment(new DashboardFragment());

        bottomNavigationView.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if (item.getItemId() == R.id.nav_home) {
                fragment = new DashboardFragment();
            }
            else if (item.getItemId() == R.id.nav_favorite) {
                fragment = new FavouriteFragment();
            }
            else if (item.getItemId() == R.id.nav_history) {
                fragment = new HistoryFragment();
            }
            return loadFragment(fragment);  // Load selected fragment
        });
    }


    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
              getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();
            return true;
        }
        return false;
    }

}