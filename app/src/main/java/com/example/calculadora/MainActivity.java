package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**https://www.youtube.com/watch?v=i9dTeJlIP60
 * Video de Pruebas unitarias*/
public class MainActivity extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
        resultado = findViewById(R.id.resultado);
    }

    public void suma(View view) {
        String resultadoSuma;
        Operacion operacion = new Operacion();
        resultadoSuma = operacion.suma(numero1.getText().toString(), numero2.getText().toString());
        resultado.setText(resultadoSuma);
    }

    public void resta(View view) {
        String resultadoSuma;
        Operacion operacion = new Operacion();
        resultadoSuma = operacion.resta(numero1.getText().toString(), numero2.getText().toString());
        resultado.setText(resultadoSuma);
    }
}