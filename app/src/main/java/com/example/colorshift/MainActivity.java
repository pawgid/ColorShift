package com.example.colorshift;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private DBManager dbManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

    }

    public void colorShift() {

        button1.setBackgroundColor(Color.parseColor("#008fd2"));
        
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button1:
                colorShift();
                break;

            case R.id.button2:
                colorShift();
                break;

            default:
                break;
        }
    }
}
