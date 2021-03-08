package com.example.calcularporcentaje;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        tv1=findViewById(R.id.tv1);
    }

    public void calcular(View v){
        Double v1=0.0;
        Double v2=0.0;
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();

        if (s1.isEmpty() || s1.isEmpty()){
            tv1.setText("Ingrese numeros para calcular");
        }else {
            v1 = Double.parseDouble(s1);
            v2 = Double.parseDouble(s2);

            if (v1 == 0 || v2 == 0) {
                tv1.setText("Ingrese numeros para calcular");
            } else {
                Double productoUno = v1 * v2;
                Double divporcien = productoUno / 100;
                Double resultado = v1 - divporcien;
                tv1.setText("El precio con el descuento es: " + resultado);
            }
        }
    }
}