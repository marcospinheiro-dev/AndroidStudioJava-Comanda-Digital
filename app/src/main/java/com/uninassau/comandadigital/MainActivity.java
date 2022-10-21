package com.uninassau.comandadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity<total> extends AppCompatActivity {


    private RadioGroup radioGroupPizza, radioGroupBorda, radioGroupRefrigerante;

    private RadioButton radioButtonCalabresa, radioButtonPortuguesa, radioButtonFCatupiry,
            radioButtonCatupiry, radioButtonCheddar, radioButtonC_Cheese, radioButton2L,
            radioButton1L, radioButton500ml;

    private TextInputEditText inputPedido;
    private TextInputEditText inputCliente;
    private TextInputEditText inputPizza;
    private TextInputEditText inputBorda;
    private TextInputEditText inputRefrigerante;
    private TextInputEditText inputTotal;

    private TextView textResumo;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioButtonCalabresa = findViewById(R.id.radioButtonCalabresa);
        radioButtonPortuguesa = findViewById(R.id.radioButtonPortuguesa);
        radioButtonFCatupiry = findViewById(R.id.radioButtonFCatupiry);
        radioButtonCatupiry = findViewById(R.id.radioButtonCatupiry);
        radioButtonCheddar = findViewById(R.id.radioButtonCheddar);
        radioButtonC_Cheese = findViewById(R.id.radioButtonC_Cheese);
        radioButton2L = findViewById(R.id.radioButton2L);
        radioButton1L = findViewById(R.id.radioButton1L);
        radioButton500ml = findViewById(R.id.radioButton500ml);

        radioGroupPizza = findViewById(R.id.radioGroupPizza);
        radioGroupBorda = findViewById(R.id.radioGroupBorda);
        radioGroupRefrigerante = findViewById(R.id.radioGroupRefrigerante);

        inputPedido = findViewById(R.id.inputPedido);
        inputCliente = findViewById(R.id.inputCliente);
        inputPizza = findViewById(R.id.inputPizza);
        inputBorda = findViewById(R.id.inputBorda);
        inputRefrigerante = findViewById(R.id.inputRefrigerante);
        inputTotal = findViewById(R.id.inputTotal);

        textResumo = findViewById(R.id.textResumo);

        inputPedido.isEnabled();

        radioGroupPizza.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (radioButtonCalabresa.isChecked()) {
                    inputPizza.setText("35.00");
                }
                if (radioButtonPortuguesa.isChecked()) {
                    inputPizza.setText("45.00");
                }
                if (radioButtonFCatupiry.isChecked()) {
                    inputPizza.setText("55.00");
                }
            }
        });

        radioGroupBorda.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (radioButtonCatupiry.isChecked()) {
                    inputBorda.setText("17.00");
                }
                if (radioButtonCheddar.isChecked()) {
                    inputBorda.setText("19.00");
                }
                if (radioButtonC_Cheese.isChecked()) {
                    inputBorda.setText("21.00");
                }
            }
        });

        radioGroupRefrigerante.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (radioButton2L.isChecked()) {
                    inputRefrigerante.setText("9.00");
                }
                if (radioButton1L.isChecked()) {
                    inputRefrigerante.setText("7.00");
                }
                if (radioButton500ml.isChecked()) {
                    inputRefrigerante.setText("5.00");

                }
            }
        });

        double valor1 = Double.parseDouble(inputPizza.getText().toString());
        double valor2 = Double.parseDouble(inputBorda.getText().toString());
        double valor3 = Double.parseDouble(inputRefrigerante.getText().toString());

        double total = (valor1 + valor2 + valor3);

        inputTotal.setText(String.format("%.2f", total));

    }

    public void confirmar(View view) {

        textResumo.setText("\nOlá, " + inputCliente.getText() + ", seu pedido é o nº " + inputPedido.getText()
                + "\n\nTotal a pagar: R$ " + inputTotal.getText());

        zerar();

    }

    public void limpar(View view) {
        zerar();
    }

    public void novoPedido(View view) {


    }

    public void zerar() {
        inputPizza.setText("0.00");
        inputBorda.setText("0.00");
        inputRefrigerante.setText("0.00");
        inputTotal.setText("0.00");
        radioButtonCalabresa.setChecked(false);
        radioButtonPortuguesa.setChecked(false);
        radioButtonFCatupiry.setChecked(false);
        radioButtonCatupiry.setChecked(false);
        radioButtonCheddar.setChecked(false);
        radioButtonC_Cheese.setChecked(false);
        radioButton2L.setChecked(false);
        radioButton1L.setChecked(false);
        radioButton500ml.setChecked(false);

    }
}