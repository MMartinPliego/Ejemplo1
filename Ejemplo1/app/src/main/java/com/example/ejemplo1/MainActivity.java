package com.example.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText caja1;
    private EditText caja2;
    private EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.caja1 = (EditText) findViewById(R.id.editText);
        this.caja2 = (EditText) findViewById(R.id.editText2);
        this.resultado = (EditText) findViewById(R.id.editText3);
    }

    public void sumarNumeros(View view) {
        int num1 = Integer.parseInt(this.caja1.getText().toString());
        int num2 = Integer.parseInt(this.caja2.getText().toString());
        int suma = num1 + num2;
        this.resultado.setText(Integer.toString(suma));
    }




}
