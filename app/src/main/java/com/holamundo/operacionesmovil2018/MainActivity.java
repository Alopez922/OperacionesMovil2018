package com.holamundo.operacionesmovil2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
     private Edittext n1, n2;
     private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        n1= findViewById(R.id.txtNumeroUno);
        n2= findViewById(R.id.txtNumeroDos);
        res= findViewById(R.id.lblresultado);



        double num1, num2;
        num1= double.parseDouble(n1.getText().tosTring());
        num2= double.parseDouble(n2.getText().tosTring());
    }

    public void calcular(View v){

        double num1, num2;
        num1= double.parseDouble(n1.getText().tosTring());
        num2= double.parseDouble(n2.getText().tosTring());

        resultado= Metodos.sumar(num1,num2);
        res.setText(""+ resultado);
    }
}
