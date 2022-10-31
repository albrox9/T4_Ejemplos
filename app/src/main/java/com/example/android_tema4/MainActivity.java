package com.example.android_tema4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    private int n; //declaro el contador fuera para poder usarlo.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.n=0; //la inicializamos dentro del onCreate;
        Button b = (Button) findViewById(R.id.idBoton);
        /*Inicializo el boton al que tengo
        En la clase R, xml id, y el id que le he puesto al botón*/

        b.setOnClickListener(v -> {this.accionBoton(v);});
        //Lo expresamos con una función lambda.

    }


    private void accionBoton (View v){

        Button boton = (Button) v;


        this.n++; //lo incremento a 1, cada vez que se ejecute.
        String mensaje = getResources().getQuantityString(
                R.plurals.numPulsaciones,
                this.n,//selector de caso (sigular, plural).
                this.n //numero de veces.
        );

        boton.setText(mensaje);


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