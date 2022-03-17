package com.example.mythreeactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button button2t1, button2t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button2t1 = findViewById(R.id.button_two_to_one);
        button2t3 = findViewById(R.id.button_two_to_three);

        button2t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneToThree = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(oneToThree);
            }// end of onClick() button2t1
        }); //end of setOnClickListener() button2t1
        button2t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneToThree = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(oneToThree);
            }// end of onClick() button2t3
        }); //end of setOnClickListener() button2t3
    }//end of onCreate()
}//end class