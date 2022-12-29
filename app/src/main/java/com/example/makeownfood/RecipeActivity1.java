package com.example.makeownfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity1 extends AppCompatActivity {

    private TextView foodName , foodRecipe;
    private ImageView foodPicture;
    private Intent get_intent;
    private String aRecipe,aName;
    private int aPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe1);
        foodName = (TextView)findViewById(R.id.recipe_activity_textViewFoodName);
        foodRecipe = (TextView)findViewById(R.id.recipe_activity_textViewFoodDetail);
        foodPicture =(ImageView) findViewById(R.id.recipe_activity_imageViewFoodPicture);

        get_intent = getIntent();
        aName = get_intent.getStringExtra("FoodName");
        aRecipe = get_intent.getStringExtra("FoodRecipe");
        aPicture = get_intent.getIntExtra("FoodPicture",-1);

        if (!TextUtils.isEmpty(aName) && !TextUtils.isEmpty(aRecipe) && aPicture != -1){
            foodName.setText(aName);
            foodRecipe.setText(aRecipe);
            foodPicture.setBackgroundResource(aPicture);
        }

    }
}