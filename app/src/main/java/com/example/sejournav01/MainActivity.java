package com.example.sejournav01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList <String> Countries=new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        final LayoutInflater factory = getLayoutInflater();
        final View view2=factory.inflate(R.layout.formulaire,null);
        Button button2 = .findViewById(R.id.button2);
        Spinner spinner=ViewFormulaire2.findViewById(R.id.spinner3);
        Countries.add("France");
        try {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.formulaire, Countries);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
        }catch (Exception e)
        {
            throw e;
        }
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.formulaire2);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.formulaire);
            }
        });

    }
}