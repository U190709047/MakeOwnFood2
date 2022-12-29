package com.example.makeownfood;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnArrayAdaptor;
    Button btnCustomAdaptor;
    Button btnFavourites;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnArrayAdaptor = findViewById(R.id.btnarrayadaptor);
        btnCustomAdaptor = findViewById(R.id.btncustomadaptor);


        btnCustomAdaptor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomAdapterActivity.class);
                startActivity(intent);
            }
        });
        btnArrayAdaptor.setOnClickListener(new View.OnClickListener() {
            @Override

            public  void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ArrayAdaptorActivity.class);
                startActivity(intent);
            }

        });
    }
}