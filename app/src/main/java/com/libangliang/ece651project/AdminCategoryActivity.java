package com.libangliang.ece651project;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    private ImageView fruitAndVege,meatAndFish, dairyAndEgg, bakery;
    private ImageView frozen, drinks, household, beauty;
    private ImageView toiletries, homeware, baby, pet;


    private Button logoutBtn, checkOrdersBtn, editProductsBtn;

    @Override
    public void onBackPressed() {
        //Disable back button
        // Do Here what ever you want do on back press;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        fruitAndVege = findViewById(R.id.fruit_and_vegetable_pic);
        meatAndFish = findViewById(R.id.meat_and_fish_pic);
        dairyAndEgg = findViewById(R.id.diary_and_egg_pic);
        bakery = findViewById(R.id.bakery_pic);

        frozen = findViewById(R.id.frozen_pic);
        drinks = findViewById(R.id.drinks_pic);
        household = findViewById(R.id.household_pic);
        beauty = findViewById(R.id.beauty_pic);

        toiletries = findViewById(R.id.toiletries_and_health_pic);
        homeware = findViewById(R.id.homeware_pic);
        baby = findViewById(R.id.baby_pic);
        pet = findViewById(R.id.pet_pic);

        logoutBtn = findViewById(R.id.admin_logout_btn);
        checkOrdersBtn = findViewById(R.id.admin_check_orders_btn);
        editProductsBtn = findViewById(R.id.admin_edit_products_btn);


        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        editProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this,HomeActivity.class);
                intent.putExtra("Admin","Admin");
                startActivity(intent);
                finish();
            }
        });

    }
}
