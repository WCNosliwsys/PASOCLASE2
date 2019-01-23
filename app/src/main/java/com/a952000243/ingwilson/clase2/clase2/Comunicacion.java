package com.a952000243.ingwilson.clase2.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Comunicacion  extends AppCompatActivity {
    TextView txtmensaje;
    String nombre;
    int edad;
    int evaluacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion);
        Bundle extras = getIntent().getExtras();
        nombre= extras.getString("nombre");
        edad = extras.getInt("edad");
        txtmensaje=findViewById(R.id.txtmensaje);
        if (edad > 25)
            evaluacion = 3000;
        else
            evaluacion = 2000;
        txtmensaje.setText("Buen día "+ nombre + " por su edad de " + edad +
                " podemos ofrecerle " + evaluacion + "soles");
    }
}
