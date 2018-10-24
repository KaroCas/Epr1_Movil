package com.example.carito.myepr1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abririnfo(View v){
        startActivity(new Intent(MainActivity.this,Informacion.class ));

    }
    public void abrircalcularnotas(View v){
        startActivity(new Intent(MainActivity.this,CalcularNotas.class ));

    }



}
