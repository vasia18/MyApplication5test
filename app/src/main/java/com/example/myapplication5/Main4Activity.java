package com.example.myapplication5;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    Button buttonFore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        buttonFore = (Button) findViewById(R.id.buttonFore);
        buttonFore.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonFore:
                Intent intent = new Intent(this, Main5Activity.class);
                startActivity(intent);

                break;
            default:
                break;

        }

    }
}
