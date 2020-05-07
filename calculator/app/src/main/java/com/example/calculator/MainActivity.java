package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt1).setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.bt1) {
            Intent intent = new Intent(this, CalculatorActivity.class);
            startActivity(intent);
        }
        }
}
