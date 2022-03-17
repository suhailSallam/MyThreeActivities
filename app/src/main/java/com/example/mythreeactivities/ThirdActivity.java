package com.example.mythreeactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    Button button3t1, button3t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        button3t1 = findViewById(R.id.button_three_to_one);
        button3t2 = findViewById(R.id.button_three_to_two);

        button3t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneToThree = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(oneToThree);
                finish();
            }// end of onClick() button3t1
        }); //end of setOnClickListener() button3t1
        button3t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneToThree = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(oneToThree);
            }// end of onClick() button3t2
        }); //end of setOnClickListener() button3t2
    }//end of onCreate()
}//end class