package com.example.makeownfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity2 extends AppCompatActivity {

    private TextView dishName , dishRecipe;
    private ImageView dishPicture;
    private Intent get_intent;
    private String cRecipe,cName;
    private int cPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe2);
        dishName = (TextView)findViewById(R.id.recipe_activity_textViewDishName);
        dishRecipe = (TextView)findViewById(R.id.recipe_activity_textViewDishDetail);
        dishPicture =(ImageView) findViewById(R.id.recipe_activity_imageViewDishPicture);

        get_intent = getIntent();
        cName = get_intent.getStringExtra("DishName");
        cRecipe = get_intent.getStringExtra("DishRecipe");
        cPicture = get_intent.getIntExtra("DishPicture",-1);

        if (!TextUtils.isEmpty(cName) && !TextUtils.isEmpty(cRecipe) && cPicture != -1){
            dishName.setText(cName);
            dishRecipe.setText(cRecipe);
            dishPicture.setBackgroundResource(cPicture);
        }

    }
}