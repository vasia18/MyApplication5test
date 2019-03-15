package com.example.myapplication5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button buttonTwo11;
    private Button buttonTwo22;
    private TextView plList;
    private TextView tvIzmText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonTwo11 = (Button) findViewById(R.id.buttonTwo1);
        buttonTwo22 = (Button) findViewById(R.id.buttonTwo2);
        plList = (TextView) findViewById(R.id.tv_text);
        tvIzmText = (TextView) findViewById(R.id.tv_text_izm);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvIzmText.setText("Кнопка была нажата!!!");
            }
        };



        String[] names = {"Rjirf", "vsirf", "ghbdtn", "gjkecbnkjcm", "tot", "rjt_xnj", "Gjcktlyzz", "Rjirf", "vsirf", "ghbdtn", "gjkecbnkjcm", "tot", "rjt_xnj", "Gjcktlyzz"};

        plList.setText("");
        for (String name : names) {
            plList.append(name + "\n");
        }

        buttonTwo11.setOnClickListener(this);
        // Отображается кнопка бяла нажата!!!
        buttonTwo22.setOnClickListener(onClickListener);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonTwo1:
                Intent intent_Two1 = new Intent(this, Main3Activity.class);
                startActivity(intent_Two1);
                // Мы написали вторую кнопку buttonTwo1, и переход но нажатию на Main3Activity.
                break;
//
//            case R.id.buttonTwo2:
//                Intent intent_Two2 = new Intent(this, Main4Activity.class);
//                startActivity(intent_Two2);
//                // Мы написали вторую кнопку buttonTwo2, по нажатию она будет менять текст tv_text который располоден ниже
//                break;
            default:
                break;


        }

    }
}
