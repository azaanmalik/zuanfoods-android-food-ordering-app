package com.practiceandeoid.zuanfoods;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FoodDetailActivity extends AppCompatActivity {
    ImageView food_back;

    TextView food_name, food_price;

    ImageView food_image;

    TextView ordernow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_food_detail);
        food_back = findViewById(R.id.food_back);
        food_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              getOnBackPressedDispatcher().onBackPressed();
            }

        });

        Intent intent = getIntent();

        food_name = findViewById(R.id.food_name1);

        food_price = findViewById(R.id.food_price1);

        food_image = findViewById(R.id.food_image);
        food_name.setText(intent.getStringExtra("food_name"));

        food_price.setText(intent.getStringExtra("food_price"));

        food_image.setImageResource(intent.getIntExtra("food_image", R.drawable.foodimg1));
        ordernow= findViewById(R.id.order_now);

        ordernow.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View view) {

                String recipient = "orders@example.com"; // Replace with your own order inbox
                String foodName = intent.getStringExtra("food_name");
                String foodPrice = intent.getStringExtra("food_price");
                Intent orderFood = new Intent(Intent.ACTION_SENDTO);
                orderFood.setData(Uri.parse("mailto:"));
                orderFood.putExtra(Intent.EXTRA_EMAIL, new String[]{recipient});
                orderFood.putExtra(Intent.EXTRA_SUBJECT, "ZuanFoods order enquiry: " + (foodName == null ? "Food item" : foodName));
                orderFood.putExtra(Intent.EXTRA_TEXT, "Food: " + (foodName == null ? "" : foodName)
                        + "\nPrice: " + (foodPrice == null ? "" : foodPrice)
                        + "\nPlease confirm availability and ordering details.");
                if (orderFood.resolveActivity(getPackageManager()) != null) {
                    startActivity(orderFood);
                } else {
                    android.widget.Toast.makeText(FoodDetailActivity.this,
                            "No email app installed", android.widget.Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}