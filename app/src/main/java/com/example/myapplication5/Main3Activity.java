package com.example.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonFree1;
    private Button buttonFree2;
    private TextView tv_izm_main3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttonFree1 = (Button) findViewById(R.id.buttonFree1);
        buttonFree2 = (Button) findViewById(R.id.buttonFree2);
        tv_izm_main3 = (TextView) findViewById(R.id.tv_izm_main3);
        buttonFree1.setOnClickListener(this);

        View.OnClickListener onClickListner = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_izm_main3.setText("Кнопка была нажата");
            }
        };
        // Отображается кнопка (Кнопка была нажата)
        buttonFree2.setOnClickListener(onClickListner);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_free, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonFree1:
                Intent intent = new Intent(this, Main4Activity.class);
                startActivity(intent);

                break;
            default:
                break;
        }

    }
}
