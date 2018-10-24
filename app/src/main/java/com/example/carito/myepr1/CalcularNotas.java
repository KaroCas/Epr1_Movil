package com.example.carito.myepr1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalcularNotas extends AppCompatActivity {

    private EditText epr1;
    private EditText epe1;
    private EditText epr2;
    private EditText epe2;
    private EditText eva1;
    private EditText eva2;
    private EditText eva3;
    private EditText eva4;
    private EditText exam;
    private Button btn_calcular;
    private Button btn_calcularExamen;
    private EditText et_resulPromedio;
    private EditText et_resulPromEva;
    private EditText et_resulPromExamen;
    private Double promedio;
    private Double promeva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_notas);

        epr1 = (EditText) findViewById(R.id.epr1);
        epe1 = (EditText) findViewById(R.id.epe1);
        epr2 = (EditText) findViewById(R.id.epr2);
        epe2 = (EditText) findViewById(R.id.epe2);
        eva1 = (EditText) findViewById(R.id.eva1);
        eva2 = (EditText) findViewById(R.id.eva2);
        eva3 = (EditText) findViewById(R.id.eva3);
        eva4 = (EditText) findViewById(R.id.eva4);
        exam = (EditText) findViewById(R.id.exam);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        btn_calcularExamen = (Button) findViewById(R.id.btn_calcularExamen);
        et_resulPromedio = (EditText) findViewById(R.id.et_resulPromedio);
        et_resulPromEva = (EditText) findViewById(R.id.et_resulPromedioEva);
        et_resulPromExamen = (EditText) findViewById(R.id.et_resulPromedioExamen);

        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                double er1 = Double.parseDouble(epr1.getText().toString().trim());
                double ee1 = Double.parseDouble(epe1.getText().toString().trim());
                double er2 = Double.parseDouble(epr2.getText().toString().trim());
                double ee2 = Double.parseDouble(epe2.getText().toString().trim());
                double ev1 = Double.parseDouble(eva1.getText().toString().trim());
                double ev2 = Double.parseDouble(eva2.getText().toString().trim());
                double ev3 = Double.parseDouble(eva3.getText().toString().trim());
                double ev4 = Double.parseDouble(eva4.getText().toString().trim());


                promeva = (ev1+ev2+ev3+ev4)/4;

                promedio = (er1*0.10)+(ee1*0.15)+(er2*0.20)+(ee2*0.25)+(promeva*0.3) ;

                et_resulPromedio.setText(Double.toString(promedio));
                et_resulPromEva.setText(Double.toString(promeva));


                if (promedio<55) {
                    if (promedio<40||er1<40||ee1<40||er2<40||ee2<40||promeva<40) {

                        Toast toast1 =
                                Toast.makeText(getApplicationContext(),
                                        "TIENE QUE DAR EXAMEN", Toast.LENGTH_LONG);

                        toast1.show();
                    }
                }else{
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "USTED ESTA APROBADO", Toast.LENGTH_LONG);

                    toast1.show();
                }

                if (promedio<55) {
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "TIENE QUE DAR EXAMEN", Toast.LENGTH_LONG);

                    toast1.show();
                }else{
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "USTED ESTA APROBADO \n NO DA EXAMEN", Toast.LENGTH_LONG);

                    toast1.show();
                }



            }
        });

        btn_calcularExamen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                double exm = Double.parseDouble(exam.getText().toString().trim());

                double promedioexm = (exm* 0.3)+(promedio*0.7);

                et_resulPromExamen.setText(Double.toString(promedioexm));

                if (promedioexm<40) {
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "USTED HA REPROBADO", Toast.LENGTH_LONG);

                    toast1.show();
                }else{
                    Toast toast1 =
                            Toast.makeText(getApplicationContext(),
                                    "FELICITACIONES \n USTED ESTA APROBADO", Toast.LENGTH_LONG);

                    toast1.show();
                }


            }
        });

    }
}
