package com.example.android_tema4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.n=0;
        Button b = (Button) findViewById(R.id.idBoton); //Inicializo el boton al ue tengo
        //En la clase R, xml id, y el id que le he puesto al botón

        b.setOnClickListener(v -> {accionBoton(v);});
        //Lo expresamos con una función lambda.

    }


    private void accionBoton (View v){

        Button boton = (Button) v;
        this.n++;
        boton.setText("Pulsado " + n + " veces");

        //String etiqueta = boton.getText().toString();
        //guardo el contenido del boton en ese momento.

        //CICLAR ENTRE UNO Y DOS.
        /*if (etiqueta == "UNO") {

            boton.setText("DOS");//Con el set, cambio el texto del botón
            //Como está en el onCLick, me cambia el texto al pulsar.

        } else {

            boton.setText("UNO");
        }*/
    }
}