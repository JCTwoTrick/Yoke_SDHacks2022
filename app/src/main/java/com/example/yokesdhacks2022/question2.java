package com.example.yokesdhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        getSupportActionBar().setTitle("Activity Level");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        ArrayList activity = new ArrayList();

        final Button not_very_active = findViewById(R.id.not_very_active);
        not_very_active.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(activity.contains("Not Very Active")) {
                    activity.remove("Not Very Active");
                    not_very_active.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (activity.size() == 0) {
                    activity.add("Not Very Active");
                    not_very_active.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button lightly_active = findViewById(R.id.lightly_active);
        lightly_active.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(activity.contains("Lightly Active")) {
                    activity.remove("Lightly Active");
                    lightly_active.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (activity.size() == 0) {
                    activity.add("Lightly Active");
                    lightly_active.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button active = findViewById(R.id.active);
        active.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(activity.contains("Active")) {
                    activity.remove("Active");
                    active.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (activity.size() == 0) {
                    activity.add("Active");
                    active.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button very_active = findViewById(R.id.very_active);
        very_active.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(activity.contains("Very Active")) {
                    activity.remove("Very Active");
                    very_active.setBackgroundColor(Color.parseColor("#7ACC8F"));
                }
                else if (activity.size() == 0) {
                    activity.add("Very Active");
                    very_active.setBackgroundColor(Color.parseColor("#3E8650"));
                }
            }
        });

        final Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                if(activity.size() != 0) {
                    //SEND TO NEXT PAGE
                    startActivity(new Intent(question2.this, question3.class));
                }
            }
        });
    }
}