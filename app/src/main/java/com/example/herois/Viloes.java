package com.example.herois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;

public class Viloes extends AppCompatActivity {

    private EditText etNome = this.findViewById(R.id.etNome);
    private EditText etCod = this.findViewById(R.id.etCod);
    private EditText etEspec = this.findViewById(R.id.etEspec);
    private EditText etHab = this.findViewById(R.id.etHab);
    private EditText etVulneb = this.findViewById(R.id.etVulneb);
    private EditText etNivel = this.findViewById(R.id.etNivel);
    private EditText etEquip = this.findViewById(R.id.etEquip);
    private EditText etDesc = this.findViewById(R.id.etDesc);
    private EditText etRivais = this.findViewById(R.id.etRivais);
    private EditText etEscond = this.findViewById(R.id.etEscond);
    private EditText etDatas = this.findViewById(R.id.etDatas);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viloes);
    }

    public void Cadastrar(View view) {
        Intent intent = new Intent(this, ConsultaVillain.class);
        Bundle obj = new Bundle();
        String
                Nome = etNome.getText().toString(),
                Codinome = etCod.getText().toString(),
                Especie = etEspec.getText().toString(),
                Habil = etHab.getText().toString(),
                Vulner = etVulneb.getText().toString(),
                Nivel = etNivel.getText().toString(),
                Equip = etEquip.getText().toString(),
                Desc = etDesc.getText().toString(),
                Rivais = etRivais.getText().toString(),
                Escond = etEscond.getText().toString(),
                Datas = etDatas.getText().toString()
        ;
        obj.putString("Nome", Nome);
        obj.putString("Codinome", Codinome);
        obj.putString("Especie", Especie);
        obj.putString("Habil", Habil);
        obj.putString("Vulner", Vulner);
        obj.putString("Nivel", Nivel);
        obj.putString("Equip", Equip);
        obj.putString("Desc", Desc);
        obj.putString("Rivais", Rivais);
        obj.putString("Escond", Escond);
        obj.putString("Datas", Datas);

        intent.putExtra("extra", obj);
        this.startActivity(intent);
    }
}