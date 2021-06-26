package com.example.calcounter;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import model.Food;

public class FoodItemDetailsActivity extends AppCompatActivity {

    private TextView foodName, calories, dateTaken;
    private Button shareButton;
    private int foodId;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_item_details);

        foodName = (TextView) findViewById(R.id.detsFoodName);
        calories = (TextView) findViewById(R.id.detsCaloriesValue);
        dateTaken = (TextView) findViewById(R.id.detsDateText);
        shareButton = (Button) findViewById(R.id.detsShareButton);

        Food food = (Food) getIntent().getSerializableExtra("userObj");

        foodName.setText(food.getFoodName());
        calories.setText(String.valueOf(food.getCalories()));
        dateTaken.setText(food.getRecordDate());

        foodId = food.getFoodId();


        calories.setTextColor(Color.RED);

    }

    //running
}
