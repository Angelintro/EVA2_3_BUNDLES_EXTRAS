package com.example.walmart.eva2_3_bundles_extras;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity implements Button.OnClickListener {
    Button btnAtras;
    Intent inLeer;
    EditText editText1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        editText1 = findViewById(R.id.editText2);
        inLeer = getIntent();
        editText1.setText(inLeer.getStringExtra("HOLA!!"));
        btnAtras = findViewById(R.id.btnAtras);
        btnAtras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
