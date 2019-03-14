package com.example.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonTwo1;
    private Button buttonTwo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonTwo1 = (Button) findViewById(R.id.buttonTwo1);
        buttonTwo2 = (Button) findViewById(R.id.buttonTwo2);
        buttonTwo1.setOnClickListener(this);
        buttonTwo2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTwo1:
                Intent intent_Two1 = new Intent(this, Main3Activity.class);
                startActivity(intent_Two1);
                // Мы написали вторую кнопку buttonTwo1, и переход но нажатию на Main3Activity.
                break;


            case R.id.buttonTwo2:
                Intent intent_Two2 = new Intent(this, Main4Activity.class);
                startActivity(intent_Two2);
                // Мы написали вторую кнопку buttonTwo2, и переход но нажатию на Main4Activity
                break;
            default:
                break;


        }

    }
}
