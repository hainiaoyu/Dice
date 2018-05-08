package com.example.yimingli.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);

        ImageView image_left = (ImageView) findViewById(R.id.image_dice_left);

        ImageView image_right = (ImageView) findViewById(R.id.image_dice_right);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // log.d means to set debug log
                Log.d("Dice", "Hello");
            }
        });
    }
}
