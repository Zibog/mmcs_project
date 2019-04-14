package com.example.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GamesMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_menu);
        findViewById(R.id.button).setEnabled(false);
        findViewById(R.id.button3).setEnabled(false);
        findViewById(R.id.button4).setEnabled(false);
    }

    public void MosaicOnClick(View view) {
        Intent intent = new Intent(GamesMenu.this, Mosaic.class);
        startActivity(intent);
    }
}
