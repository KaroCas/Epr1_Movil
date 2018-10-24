package com.example.carito.myepr1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Informacion extends AppCompatActivity {

    private Button btn_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        btn_info = (Button) findViewById(R.id.btn_info);

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast1 =
                        Toast.makeText(getApplicationContext(),
                                " CREADO POR \n Carolina Castro \n carito.castro.a@gmail.com", Toast.LENGTH_LONG);


                toast1.show();
            }
        });

    }
}
