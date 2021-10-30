package com.example.sejournav01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList <String> Countries=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        LayoutInflater factory = getLayoutInflater();
        View view2=factory.inflate(R.layout.formulaire,null);
        Button button2 = view2.findViewById(R.id.button2);
        System.out.println("aaaaaaaaaaaa " +button2 + " aaaaaaaaa " + R.id.button2);
        Spinner spinner=view2.findViewById(R.id.spinner3);
        Countries.add("France");
        try {
            ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, R.layout.formulaire, Countries);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
        }catch (Exception e)
        {
            throw e;
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("aaaaaaaaaaaa " +button2 + " aaaaaaaaa " + view2.findViewById(R.id.button2));

                //afficher formulaire 1
                Toast.makeText(MainActivity.this, "yo",Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //afficher formulaire 2
            }
        });
    }
}