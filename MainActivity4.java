package com.example.basicpervasive;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner spinnerFrom, spinnerTo;
    private EditText editTextAmount;
    private Button buttonConvert;
    private TextView textViewResult;

    private String[] currencies = {"USD", "EUR", "GBP", "JPY", "CAD"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        spinnerFrom = findViewById(R.id.spinnerFrom);
        spinnerTo = findViewById(R.id.spinnerTo);
        editTextAmount = findViewById(R.id.editTextAmount);
        buttonConvert = findViewById(R.id.buttonConvert);
        textViewResult = findViewById(R.id.textViewResult);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, currencies);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerFrom.setAdapter(adapter);
        spinnerTo.setAdapter(adapter);

        spinnerFrom.setOnItemSelectedListener(this);
        spinnerTo.setOnItemSelectedListener(this);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCurrency();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Handle item selection if needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Handle empty selection if needed
    }

    private void convertCurrency() {
        double amount = Double.parseDouble(editTextAmount.getText().toString());
        double rate = 0.0;

        String currencyFrom = spinnerFrom.getSelectedItem().toString();
        String currencyTo = spinnerTo.getSelectedItem().toString();

        // Set conversion rates here based on currencyFrom and currencyTo
        // For example:
        if (currencyFrom.equals("USD") && currencyTo.equals("EUR")) {
            rate = 0.85;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("GBP")) {
            rate = 0.72;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("JPY")) {
            rate = 110.32;
        } else if (currencyFrom.equals("USD") && currencyTo.equals("CAD")) {
            rate = 1.21;
        }
        // Add more conversion rates for other currency combinations as needed

        double convertedAmount = amount * rate;

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(convertedAmount);

        textViewResult.setText(result + " " + currencyTo);
    }
}
