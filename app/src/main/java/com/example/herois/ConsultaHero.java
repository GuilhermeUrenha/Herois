package com.example.herois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;

public class ConsultaHero extends AppCompatActivity {

    private EditText etNome = this.findViewById(R.id.etNome);
    private EditText etCod = this.findViewById(R.id.etCod);
    private EditText etEspec = this.findViewById(R.id.etEspec);
    private EditText etHab = this.findViewById(R.id.etHab);
    private EditText etVulneb = this.findViewById(R.id.etVulneb);
    private EditText etNivel = this.findViewById(R.id.etNivel);
    private EditText etEquip = this.findViewById(R.id.etEquip);
    private EditText etDesc = this.findViewById(R.id.etDesc);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_hero);
    }
}