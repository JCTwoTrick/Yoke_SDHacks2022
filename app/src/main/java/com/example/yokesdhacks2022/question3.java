package com.example.yokesdhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class question3 extends AppCompatActivity {

    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        getSupportActionBar().setTitle("About You");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ArrayList sex = new ArrayList();

        final Button male = findViewById(R.id.male);
        male.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(sex.contains("Male")) {
                    sex.remove("Male");
                    male.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (sex.size() == 0) {
                    sex.add("Male");
                    male.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button female = findViewById(R.id.female);
        female.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(sex.contains("Female")) {
                    sex.remove("Female");
                    female.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (sex.size() == 0) {
                    sex.add("Female");
                    female.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button transgender = findViewById(R.id.transgender);
        transgender.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(sex.contains("Transgender")) {
                    sex.remove("Transgender");
                    transgender.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (sex.size() == 0) {
                    sex.add("Transgender");
                    transgender.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button non_binary = findViewById(R.id.non_binary);
        non_binary.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(sex.contains("Non-Binary")) {
                    sex.remove("Non-Binary");
                    non_binary.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (sex.size() == 0) {
                    sex.add("Non-Binary");
                    non_binary.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        EditText age_input = findViewById(R.id.AgeInput);

        final Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                age = Integer.valueOf(age_input.getText().toString());
                if(sex.size() != 0 && age >= 13 && age < 100) {
                    //SEND TO NEXT PAGE
                    startActivity(new Intent(question3.this, question4.class));
                }
            }
        });
    }
}