package com.example.android.usdtoinr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        public void convertCurrency(View view){
            EditText editText = (EditText) findViewById(R.id.editText);
            if(editText.getText().toString().isEmpty()){
                Toast.makeText(this, "Please enter a number!", Toast.LENGTH_LONG).show();
            }else {
                String amountInUSD = editText.getText().toString();
                Double amountInUSDDouble = Double.parseDouble(amountInUSD);
                Double amountInINRDouble = amountInUSDDouble * 72.48;
                String amountinINrString = String.format("%.2f", amountInINRDouble);
                String valueMessage = createValue(amountInUSD, amountinINrString);
                displayMessage(valueMessage);
                Toast.makeText(this, "$" + amountInUSD + " is ₹" + amountinINrString, Toast.LENGTH_LONG).show();
            }
        }
        private String createValue(String  amountinUSD, String amountinINRString){
            String valueMessage = "$" + amountinUSD + " is ₹" + amountinINRString;
            return valueMessage;
        }
        private void displayMessage(String message){
            TextView valueTextView = (TextView) findViewById(R.id.showingValue);
            valueTextView.setText(message);
        }
    public void convertCurrencyCAD(View view){
        EditText editText = (EditText) findViewById(R.id.editTextCAD);
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_LONG).show();
        }else {
            String amountInCAD = editText.getText().toString();
            Double amountInCADDouble = Double.parseDouble(amountInCAD);
            Double amountInINR2Double = amountInCADDouble * 59.84;
            String amountinINR2String = String.format("%.2f", amountInINR2Double);
            String valueMessage2 = createValue2(amountInCAD, amountinINR2String);
            displayMessage2(valueMessage2);
            Toast.makeText(this, "$" + amountInCAD + " is ₹" + amountinINR2String, Toast.LENGTH_LONG).show();
        }
    }
    private String createValue2(String  amountinCAD, String amountinINR2String){
        String valueMessage2 = "$" + amountinCAD + " is ₹" + amountinINR2String;
        return valueMessage2;
    }
    private void displayMessage2(String message){
        TextView valueTextView = (TextView) findViewById(R.id.showingValueCAD);
        valueTextView.setText(message);
    }
    public void convertCurrencyAED(View view){
        EditText editText = (EditText) findViewById(R.id.editTextAED);
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_LONG).show();
        }else {
            String amountInAED = editText.getText().toString();
            Double amountInAEDDouble = Double.parseDouble(amountInAED);
            Double amountInINR3Double = amountInAEDDouble * 19.74;
            String amountinINR3String = String.format("%.2f", amountInINR3Double);
            String valueMessage3 = createValue3(amountInAED, amountinINR3String);
            displayMessage3(valueMessage3);
            Toast.makeText(this, "AED" + amountInAED + " is ₹" + amountinINR3String, Toast.LENGTH_LONG).show();
        }
    }
    private String createValue3(String  amountinAED, String amountinINR3String){
        String valueMessage3 = "AED" + amountinAED + " is ₹" + amountinINR3String;
        return valueMessage3;
    }
    private void displayMessage3(String message){
        TextView valueTextView = (TextView) findViewById(R.id.showingValueAED);
        valueTextView.setText(message);
    }
    public void convertCurrencyAUD(View view){
        EditText editText = (EditText) findViewById(R.id.editTextAUD);
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_LONG).show();
        }else {
            String amountInAUD = editText.getText().toString();
            Double amountInAUDDouble = Double.parseDouble(amountInAUD);
            Double amountInINR4Double = amountInAUDDouble * 55.85;
            String amountinINR4String = String.format("%.2f", amountInINR4Double);
            String valueMessage4 = createValue4(amountInAUD, amountinINR4String);
            displayMessage4(valueMessage4);
            Toast.makeText(this, "$" + amountInAUD + " is ₹" + amountinINR4String, Toast.LENGTH_LONG).show();
        }
    }
    private String createValue4(String  amountinAUD, String amountinINR4String){
        String valueMessage4 = "$" + amountinAUD + " is ₹" + amountinINR4String;
        return valueMessage4;
    }
    private void displayMessage4(String message){
        TextView valueTextView = (TextView) findViewById(R.id.showingValueAUD);
        valueTextView.setText(message);
    }
    public void convertCurrencyEuro(View view){
        EditText editText = (EditText) findViewById(R.id.editTextEuro);
        if(editText.getText().toString().isEmpty()){
            Toast.makeText(this, "Please enter a number!", Toast.LENGTH_LONG).show();
        }else {
            String amountInEuro = editText.getText().toString();
            Double amountInEuroDouble = Double.parseDouble(amountInEuro);
            Double amountInINR5Double = amountInEuroDouble * 88.19;
            String amountinINR5String = String.format("%.2f", amountInINR5Double);
            String valueMessage5 = createValue5(amountInEuro, amountinINR5String);
            displayMessage5(valueMessage5);
            Toast.makeText(this, "Euro" + amountInEuro + " is ₹" + amountinINR5String, Toast.LENGTH_LONG).show();
        }
    }
    private String createValue5(String  amountinEuro, String amountinINR5String){
        String valueMessage5 = "Euro" + amountinEuro + " is ₹" + amountinINR5String;
        return valueMessage5;
    }
    private void displayMessage5(String message){
        TextView valueTextView = (TextView) findViewById(R.id.showingValueEuro);
        valueTextView.setText(message);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}