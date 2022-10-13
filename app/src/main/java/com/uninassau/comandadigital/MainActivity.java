package com.uninassau.comandadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkCalabresa, checkPortuguesa, checkFcatupiry, checkCatupiry, checkCheddar,
            checkCcheese, check2litros, check1litro, check500ml;

    private TextInputEditText inputPedido, inputCliente, inputPizza, inputBorda, inputRefrigerante,
            inputTotal;

    private TextView textTeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkCalabresa = findViewById(R.id.checkCalabresa);
        checkPortuguesa = findViewById(R.id.checkPortuguesa);
        checkFcatupiry = findViewById(R.id.checkFcatupiry);
        checkCatupiry = findViewById(R.id.checkCatupiry);
        checkCheddar = findViewById(R.id.checkCheddar);
        checkCcheese = findViewById(R.id.checkCcheese);
        check2litros = findViewById(R.id.check2litros);
        check1litro = findViewById(R.id.check1litro);
        check500ml = findViewById(R.id.check500ml);

        inputPedido = findViewById(R.id.inputPedido);
        inputCliente = findViewById(R.id.inputCliente);
        inputPizza = findViewById(R.id.inputPizza);
        inputBorda = findViewById(R.id.inputBorda);
        inputRefrigerante = findViewById(R.id.inputRefrigerante);
        inputTotal = findViewById(R.id.inputTotal);

        textTeste = findViewById(R.id.textTeste);

    }

    public void checkBox() {

        String texto1 = "0.00";
        String texto2 = "0.00";
        String texto3 = "0.00";

        if (checkCalabresa.isChecked()) {
//            checkPortuguesa.setChecked(false);
//            checkFcatupiry.setChecked(false);
            texto1 = "35.00";
        }
        if (checkPortuguesa.isChecked()) {
//            checkCalabresa.setChecked(false);
//            checkFcatupiry.setChecked(false);
            texto1 = "45.00";
        }
        if (checkFcatupiry.isChecked()) {
//            checkCalabresa.setChecked(false);
//            checkPortuguesa.setChecked(false);
            texto1 = "55.00";
        }
        inputPizza.setText(texto1);

        if (checkCatupiry.isChecked()) {
            texto2 = "17.00";
        }
        if (checkCheddar.isChecked()) {
            texto2 = "19.00";
        }
        if (checkCcheese.isChecked()) {
            texto2 = "21,00";
        }
        inputBorda.setText(texto2);

        if (check2litros.isChecked()) {
            texto3 = "9.00";
        }
        if (check1litro.isChecked()) {
            texto3 = "7,00";
        }
        if (check500ml.isChecked()) {
            texto3 = "5,00";
        }
//        inputRefrigerante.setText(texto3);
//        double valor1 = valorPizza.getText() != null && !valorPizza.getText().isEmpty() ? Double.parseDouble(valorPizza.getText()) : 0;
//        double valor2 = borda.getText() != null && !borda.getText().isEmpty() ? Double.parseDouble(borda.getText()) : 0;
//        double valor3 = refrigerante.getText() != null && !refrigerante.getText().isEmpty() ? Double.parseDouble(refrigerante.getText()) : 0;
//
//        double soma = (valor1 + valor2 + valor3);
    }

    public void confirmar(View view) {

        checkBox();

    }

}