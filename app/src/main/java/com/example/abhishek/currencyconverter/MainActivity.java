package com.example.abhishek.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final double USD_TO_RS   = 69.10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void convert(View v){

        EditText usdEditText = findViewById(R.id.usdText);
        EditText rsEditText = findViewById(R.id.rsText);

        Double usdAmount = Double.parseDouble(usdEditText.getText().toString());
        Double rsAmount = usdAmount * USD_TO_RS;

        rsEditText.setText(rsAmount.toString());


    }

}
