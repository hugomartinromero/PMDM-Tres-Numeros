package com.fireboy.tresnumeros;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Button btnMenor, btnMayor, btnAsc, btnDesc, btnBorrar;
    EditText[] txtNumeros = new EditText[3];
    TextView[] lblResultados = new TextView[3];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMenor = findViewById(R.id.btnMenor);
        btnMayor = findViewById(R.id.btnMayor);
        btnAsc = findViewById(R.id.btnAsc);
        btnDesc = findViewById(R.id.btnDesc);
        btnBorrar = findViewById(R.id.btnBorrar);
        txtNumeros[0] = findViewById(R.id.txtNumero1);
        txtNumeros[1] = findViewById(R.id.txtNumero2);
        txtNumeros[2] = findViewById(R.id.txtNumero3);
        lblResultados[0] = findViewById(R.id.lblResultado1);
        lblResultados[1] = findViewById(R.id.lblResultado2);
        lblResultados[2] = findViewById(R.id.lblResultado3);

        btnMenor.setOnClickListener(v -> menor());
        btnMayor.setOnClickListener(v -> mayor());
        btnAsc.setOnClickListener(v -> asc());
        btnDesc.setOnClickListener(v -> desc());
        btnBorrar.setOnClickListener(v -> borrar());
    }

    private void menor() {
        int[] numeros = new int[3];
        int menor;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(txtNumeros[i].getText().toString());
        }

        Arrays.sort(numeros);

        lblResultados[0].setText("");
        lblResultados[1].setText(String.valueOf(numeros[0]));
        lblResultados[2].setText("");
    }

    private void mayor() {
        int[] numeros = new int[3];
        int mayor;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(txtNumeros[i].getText().toString());
        }

        Arrays.sort(numeros);

        lblResultados[0].setText("");
        lblResultados[1].setText(String.valueOf(numeros.length - 1));
        lblResultados[2].setText("");
    }

    private void asc() {
        int[] numeros = new int[3];
        int mayor;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(txtNumeros[i].getText().toString());
        }

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            lblResultados[i].setText(String.valueOf(numeros[i]));
        }
    }

    private void desc() {
        int[] numeros = new int[3];
        int mayor;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(txtNumeros[i].getText().toString());
        }

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - i - 1];
            numeros[numeros.length - i - 1] = temp;
        }

        for (int i = 0; i < numeros.length; i++) {
            lblResultados[i].setText(String.valueOf(numeros[i]));
        }
    }

    private void borrar() {
        for (EditText txt : txtNumeros) {
            txt.setText("");
        }
        for (TextView txt : lblResultados) {
            txt.setText("");
        }
    }
}