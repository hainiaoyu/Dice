package com.example.yimingli.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView image_left = (ImageView) findViewById(R.id.image_dice_left);

        final ImageView image_right = (ImageView) findViewById(R.id.image_dice_right);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Testing log.d means to set debug log
                Log.d("Dice", "Hello");

                // Generate a random number
                Random randomGenerator = new Random();
                int number1 = randomGenerator.nextInt(6);
                int number2 = randomGenerator.nextInt(6);

                image_left.setImageResource(diceArray[number1]);
                image_right.setImageResource(diceArray[number2]);
            }
        });
    }
}
