package com.example.makeownfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.makeownfood.RecipeActivity1;

public class ArrayAdaptorActivity extends ListActivity{

    private ListView mListview;
    private ArrayAdapter<String > adapter;
    private String[] foods = {"Meat","Chiken Meat","Pasta","Rice","Potato","Bean","Sugar","Milk"};
    private String [] foodrecipe = {"Burger","Pizza","Rice","Doner","Kebab","Tantuni","Lahmacun","Sarma","Pancake"
            ,"Toast","Sandwich","Pasta","Chicken Wing","Pita Bread","Meatball","Manti","Soup","Fried Potatoes"
            ,"Horicot Bean","Baklava","Cake","Waffle","Ice Cream","Supangle","Pudding","Croissant"};
    private int [] foodpicture = {R.mipmap.rawmeat,R.mipmap.crawmeat,R.mipmap.rpasta,R.mipmap.rrice,R.mipmap.rpatato,R.mipmap.rbean,R.mipmap.rsugar,R.mipmap.milk};
    private Intent detailsIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adaptor);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adaptor,foods));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                detailsIntent = new Intent(ArrayAdaptorActivity.this, RecipeActivity1.class);
                detailsIntent.putExtra("FoodName",foods[position]);
                detailsIntent.putExtra("FoodRecipe", foodrecipe[position]);
                detailsIntent.putExtra("FoodPicture",foodpicture[position]);
                startActivity(detailsIntent);

            }
        });
    }

}