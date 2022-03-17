package com.example.mythreeactivities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1t2, button1t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1t2 = findViewById(R.id.button_one_to_two);
        button1t3 = findViewById(R.id.boutton_one_to_third);

        button1t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneToTwo = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(oneToTwo);
            }//end of onClick() of button1t2
        }); //end of setOnClickListener() for button1t2
        button1t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oneToThree = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(oneToThree);
            }//end of onClick() of button1t3
        }); //end of setOnClickListener() for button1t3
    }//end of onCreate()
}//end class