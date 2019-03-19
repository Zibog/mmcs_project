package com.example.colormosaic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void LeftTopOnClick(View view) {
        
        view.setBackgroundColor(getResources().getColor(R.color.colorLightPink));
    }

    public void RightTopOnClick(View view) {
        view.setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
    }

    public void LeftBottomOnClick(View view) {
        view.setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
    }

    public void RightBottomOnClick(View view) {
        view.setBackgroundColor(getResources().getColor(R.color.colorLightRed));
    }
}
