package com.example.myapplication5;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    Button buttonFive1;
    Button buttonFive2;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        buttonFive1 = (Button) findViewById(R.id.buttonFive1);
        buttonFive1.setOnClickListener(this);

        buttonFive2 = (Button)

    }

    @Override
    public void onClick(View v) {

    }
}