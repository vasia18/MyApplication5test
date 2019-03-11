package com.example.myapplication5;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.time.Instant;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    Button buttonFive1;
    Button buttonFive2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        buttonFive1 = (Button) findViewById(R.id.buttonFive1);
        buttonFive1.setOnClickListener(this);

        buttonFive2 = (Button) findViewById(R.id.buttonFive2);
        buttonFive2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonFive1:
                Intent intent_1 = new Intent(this, Main6Activity.class);
                startActivity(intent_1);
                //Мы написали первое действие вызова кнопки (buttonFive1)
                break;

            case R.id.buttonFive2:
                Intent intent_2 = new Intent(this, Main2Activity.class);
                startActivity(intent_2);
                //Написали второе действие вызова кнопки (buttonFive2)
                break;
            default:
                break;

        }


    }
}