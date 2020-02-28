package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int suma;
    private int resta;
    private int operacion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = 0;
        resta = 0;

        final Button botonCero = (Button) findViewById(R.id.botonCero);
        final Button botonUno = (Button) findViewById(R.id.botonUno);
        final Button botonDos = (Button) findViewById(R.id.botonDos);
        final Button botonTres = (Button) findViewById(R.id.botonTres);
        final Button botonCuatro = (Button) findViewById(R.id.botonCuatro);
        final Button botonCinco = (Button) findViewById(R.id.botonCinco);
        final Button botonSeis= (Button) findViewById(R.id.botonSeis);
        final Button botonSiete = (Button) findViewById(R.id.botonSiete);
        final Button botonOcho = (Button) findViewById(R.id.botonOcho);
        final Button botonNueve = (Button) findViewById(R.id.botonNueve);

        final Button botonMas = (Button) findViewById(R.id.botonMas);
        final Button botonIgual = (Button) findViewById(R.id.botonIgual);
        final Button botonMenos = (Button) findViewById(R.id.botonResta);

        final TextView resultado = (TextView) findViewById(R.id.resultado);

        botonCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonCero.getText().toString();
                resultado.setText(res);
            }
        });

        botonUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonUno.getText().toString();
                resultado.setText(res);
            }
        });

        botonDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonDos.getText().toString();
                resultado.setText(res);
            }
        });

        botonTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonTres.getText().toString();
                resultado.setText(res);
            }
        });

        botonCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonCuatro.getText().toString();
                resultado.setText(res);
            }
        });

        botonCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonCinco.getText().toString();
                resultado.setText(res);
            }
        });

        botonSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonSeis.getText().toString();
                resultado.setText(res);
            }
        });

        botonSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonSiete.getText().toString();
                resultado.setText(res);
            }
        });

        botonOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonOcho.getText().toString();
                resultado.setText(res);
            }
        });

        botonNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = botonNueve.getText().toString();
                resultado.setText(res);
            }
        });

        botonMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = resultado.getText().toString();
                suma = Integer.parseInt(res) + suma;
                operacion = 1;

            }
        });

        botonMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res = resultado.getText().toString();
                resta = Integer.parseInt(res) - resta;
                operacion = 2;
            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ress = resultado.getText().toString();
                String res = "";


                switch(operacion){
                    case 1:
                        res = Integer.toString((suma + Integer.parseInt(ress)));
                        suma = 0;
                        break;
                    case 2:
                        res = Integer.toString((resta - Integer.parseInt(ress)));
                        resta = 0;
                        break;
                    
                        default:
                            break;
                }

                resultado.setText(res);
            }
        });

    }
}
