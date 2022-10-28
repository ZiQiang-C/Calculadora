package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView visual;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btM,btR,btC,btS,btT,btD;
    public int calculando;
    public int paranumros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visual=findViewById(R.id.tvResultado);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);
        bt3=findViewById(R.id.bt3);
        bt4=findViewById(R.id.bt4);
        bt5=findViewById(R.id.bt5);
        bt6=findViewById(R.id.bt6);
        bt7=findViewById(R.id.bt7);
        bt8=findViewById(R.id.bt8);
        bt9=findViewById(R.id.bt9);
        bt0=findViewById(R.id.bt0);
        btM=findViewById(R.id.btmultiplicación);
        btR=findViewById(R.id.btresta);
        btC=findViewById(R.id.btC);
        btS=findViewById(R.id.btsuma);
        btT=findViewById(R.id.btTanto);
        btD=findViewById(R.id.btdivision);


        btR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculando =Integer.valueOf(visual.getText().toString());

                visual.setText(calculando);
            }
        });

        btS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    public void suma(){

    }

}