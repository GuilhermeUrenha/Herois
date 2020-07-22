package com.example.herois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Herois(View view){
        Intent intent = new Intent(this, Herois.class);
        this.startActivity(intent);
    }
    public void Viloes(View view){
        Intent intent = new Intent(this, Viloes.class);
        this.startActivity(intent);
    }
}