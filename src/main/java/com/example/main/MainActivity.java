package com.example.main;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bv = (Button)findViewById(R.id.games);
        Typeface face = Typeface.createFromAsset(this.getAssets(), "fonts/13059.otf");
        bv.setTypeface(face);
        Button bv2 = (Button)findViewById(R.id.records);
        bv2.setTypeface(face);
        Button bv3 = (Button)findViewById(R.id.achievments);
        bv3.setTypeface(face);
        Button bv4 = (Button)findViewById(R.id.rules);
        bv4.setTypeface(face);
        bv2.setEnabled(false);
        bv3.setEnabled(false);
        bv4.setEnabled(false);
    }

    public void GamesOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, GamesMenu.class);
        startActivity(intent);
    }
}

