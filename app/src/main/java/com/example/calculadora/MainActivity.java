package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView visual;

     float numero1=0.0f;
     float numer02=0.0f;
     String operacion="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visual=findViewById(R.id.tvResultado);

    }
    public  void  Escribir0(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor== 0.0f){
            visual.setText("0");
        }else{
            visual.setText(visual.getText()+"0");
        }
    }
    public  void  Escribir1(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("1");
        }else{
            visual.setText(visual.getText()+"1");
        }
    }
    public  void  Escribir2(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("2");
        }else{
            visual.setText(visual.getText()+"2");
        }
    }
    public  void  Escribir3(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("3");
        }else{
            visual.setText(visual.getText()+"3");
        }
    }
    public  void  Escribir4(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("4");
        }else{
            visual.setText(visual.getText()+"4");
        }
    }
    public  void  Escribir5(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("5");
        }else{
            visual.setText(visual.getText()+"5");
        }
    }
    public  void  Escribir6(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("6");
        }else{
            visual.setText(visual.getText()+"6");
        }
    }
    public  void  Escribir7(View view){
       float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("7");
        }else{
            visual.setText(visual.getText()+"7");
        }
    }
    public  void  Escribir8(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("8");
        }else{
            visual.setText(visual.getText()+"8");
        }
    }
    public  void  Escribir9(View view){
        float valor =Float.parseFloat(visual.getText().toString());
        if(valor == 0.0f){
            visual.setText("9");
        }else{
            visual.setText(visual.getText()+"9");
        }
    }

    public void LimpiaTodo(View view) {
        visual.setText("0");
        numero1=0.0f;
        numer02=0.0f;
        operacion="";
    }
    public  void OperacionD(View view){
        numero1 =Float.parseFloat(visual.getText().toString());
        operacion="/";
        visual.setText("0");

    }
    public  void OperacionM(View view){
        numero1 =Float.parseFloat(visual.getText().toString());
        operacion="*";
        visual.setText("0");

    }
    public  void OperacionR(View view){
        numero1 =Float.parseFloat(visual.getText().toString());
        operacion="-";
        visual.setText("0");

    }
    public  void OperacionS(View view){
        numero1 =Float.parseFloat(visual.getText().toString());
        operacion="+";
        visual.setText("0");

    }
    public  void Resultado(View view){
        numer02 =Float.parseFloat(visual.getText().toString());

        if(operacion =="/") {

            if (numer02 == 0.0f) {
                visual.setText("0");
                Toast.makeText(this, "OPERACION NO VALIDA", Toast.LENGTH_LONG).show();
            } else {
                float result = numero1 / numer02;
                visual.setText(result + "");

            }
        }else{if(operacion =="*") {

            float result = numero1 * numer02;
            visual.setText(result + "");
            }else{
            if(operacion=="+"){
               float  result=numero1+numer02;
                visual.setText(result+"");
            }else {
                if(operacion=="-"){
                 float    result=numero1-numer02;
                    visual.setText(result+"");
                }
            }
        }


        }
    numero1=0.0f;
        numer02=0.0f;
        operacion="";
    }
}