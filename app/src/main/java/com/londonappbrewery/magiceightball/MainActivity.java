package com.londonappbrewery.magiceightball;

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

        Button button;
        button = (Button) findViewById(R.id.askbutton);
        final ImageView Ball= (ImageView) findViewById(R.id.ball);
        final int[] ballarray = { R.drawable.ball1,
                                  R.drawable.ball2,
                                  R.drawable.ball3,
                                  R.drawable.ball4,
                                  R.drawable.ball5,
                                };
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Log.d("Magic Eight Ball","clicked");
                 Random randomnumbergen = new Random();
                 int number = randomnumbergen.nextInt(5);
                 Ball.setImageResource(ballarray[number]);
             }
         });


    }
}
