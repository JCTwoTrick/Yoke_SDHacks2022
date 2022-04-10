package com.example.yokesdhacks2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class question4 extends AppCompatActivity {

    int feet, inches, weight, weight_goal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        getSupportActionBar().setTitle("About You Continued");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        EditText feet_input = findViewById(R.id.FeetInput);
        EditText inches_input = findViewById(R.id.InchesInput);
        EditText weight_input = findViewById(R.id.WeightInput);
        EditText weight_goal_input = findViewById(R.id.WeightGoalInput);

        final Button next1 = findViewById(R.id.next1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                feet = Integer.valueOf(feet_input.getText().toString());
                inches = Integer.valueOf(inches_input.getText().toString());
                weight = Integer.valueOf(weight_input.getText().toString());
                weight_goal = Integer.valueOf(weight_goal_input.getText().toString());
                if(feet > 0 && weight > 0 && weight_goal > 0) {
                    //SEND TO NEXT PAGE
                    startActivity(new Intent(question4.this, home.class));
                }
            }
        });
    }
}