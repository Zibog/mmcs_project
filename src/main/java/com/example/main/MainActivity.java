package com.example.main;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bv = (Button)findViewById(R.id.button);
        Typeface face = Typeface.createFromAsset(this.getAssets(), "fonts/13059.otf");
        bv.setTypeface(face);
        Button bv2 = (Button)findViewById(R.id.button2);
        bv2.setTypeface(face);
        Button bv3 = (Button)findViewById(R.id.button3);
        bv3.setTypeface(face);
        Button bv4 = (Button)findViewById(R.id.button4);
        bv4.setTypeface(face);
    }
}

