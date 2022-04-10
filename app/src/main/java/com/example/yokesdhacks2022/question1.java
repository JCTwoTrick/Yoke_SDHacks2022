package com.example.yokesdhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;

public class question1 extends AppCompatActivity {

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ArrayList goals = new ArrayList();

        final Button maintain_weight = findViewById(R.id.maintain_weight);
        maintain_weight.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
               if(goals.contains("Maintain Weight")) {
                   goals.remove("Maintain Weight");
                   maintain_weight.setBackgroundColor(Color.parseColor("#FF80CBC4"));
               }
               else if(goals.size() == 0){
                   goals.add("Maintain Weight");
                   maintain_weight.setBackgroundColor(Color.parseColor("#FF80B3CB"));
               }
            }
        });

        final Button bulk = findViewById(R.id.bulk);
        bulk.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(goals.contains("Bulk")) {
                    goals.remove("Bulk");
                    bulk.setBackgroundColor(Color.parseColor("#FF80CBC4"));
                }
                else if(goals.size() == 0){
                    goals.add("Bulk");
                    bulk.setBackgroundColor(Color.parseColor("#FF80B3CB"));
                }
            }
        });

        final Button gain_weight = findViewById(R.id.gain_weight);
        gain_weight.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(goals.contains("Gain Weight")) {
                    goals.remove("Gain Weight");
                    gain_weight.setBackgroundColor(Color.parseColor("#FF80CBC4"));
                }
                else if(goals.size() == 0){
                    goals.add("Gain Weight");
                    gain_weight.setBackgroundColor(Color.parseColor("#FF80B3CB"));
                }
            }
        });

        final Button lean = findViewById(R.id.lean);
        lean.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(goals.contains("Lean")) {
                    goals.remove("Lean");
                    lean.setBackgroundColor(Color.parseColor("#FF80CBC4"));
                }
                else if(goals.size() == 0){
                    goals.add("Lean");
                    lean.setBackgroundColor(Color.parseColor("#FF80B3CB"));
                }
            }
        });

        final Button lose_weight = findViewById(R.id.lose_weight);
        lose_weight.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(goals.contains("Lose Weight")) {
                    goals.remove("Lose Weight");
                    lose_weight.setBackgroundColor(Color.parseColor("#FF80CBC4"));
                }
                else if(goals.size() == 0){
                    goals.add("Lose Weight");
                    lose_weight.setBackgroundColor(Color.parseColor("#FF80B3CB"));
                }
            }
        });

        final Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(goals.size() != 0) {
                    //SEND TO NEXT PAGE
                }
            }
        });
    }
}