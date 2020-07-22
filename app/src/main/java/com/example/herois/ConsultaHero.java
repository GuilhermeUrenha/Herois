package com.example.herois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class ConsultaHero extends AppCompatActivity {

    Intent intent = this.getIntent();
    Bundle bundle = intent.getBundleExtra("Extra");

    TableLayout tl = (TableLayout)findViewById(R.id.table);
    TableRow tablerow1 = new TableRow(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_hero);
    }
}