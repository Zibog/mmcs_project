package com.example.main;

import android.content.res.AssetManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.drawable.ColorDrawable;
import android.media.SoundPool;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mosaic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mosaic);
        findViewById(R.id.imageLeftTopButton).setEnabled(false);
        findViewById(R.id.imageRightTopButton).setEnabled(false);
        findViewById(R.id.imageLeftBottomButton).setEnabled(false);
        findViewById(R.id.imageRightBottomButton).setEnabled(false);
        findViewById(R.id.MediumStartbutton).setEnabled(false);
        findViewById(R.id.HardStartbutton).setEnabled(false);

    }



    public void LeftTopOnClick(View view) {
        ImageButton button1 = findViewById(R.id.imageLeftTopButton);
        ImageButton button2 = findViewById(R.id.imageRightBottomButton);
        ColorDrawable buttoncolor = (ColorDrawable) button1.getBackground();
        if (buttoncolor.getColor() == getResources().getColor(R.color.colorHeavyPink)) {
            view.setBackgroundColor(getResources().getColor(R.color.colorLightPink));
        } else{
            view.setBackgroundColor(getResources().getColor(R.color.colorHeavyPink));
        }
        button2.setBackgroundColor(getResources().getColor(R.color.colorHeavyRed));
    }

    public void RightTopOnClick(View view) {
        ImageButton button2 = findViewById(R.id.imageRightTopButton);
        ColorDrawable buttoncolor = (ColorDrawable) button2.getBackground();
        if (buttoncolor.getColor() == getResources().getColor(R.color.colorHeavyGreen)) {
            view.setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
        } else{
            view.setBackgroundColor(getResources().getColor(R.color.colorHeavyGreen));
        }
    }

    public void LeftBottomOnClick(View view) {
        ImageButton button3 = findViewById(R.id.imageLeftBottomButton);
        ColorDrawable buttoncolor = (ColorDrawable) button3.getBackground();
        if (buttoncolor.getColor() == getResources().getColor(R.color.colorHeavyBlue)) {
            view.setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
        } else{
            view.setBackgroundColor(getResources().getColor(R.color.colorHeavyBlue));
        }
    }

    public void RightBottomOnClick(View view) {
        ImageButton button4 = findViewById(R.id.imageRightBottomButton);
        ColorDrawable buttoncolor = (ColorDrawable) button4.getBackground();
        if (buttoncolor.getColor() == getResources().getColor(R.color.colorHeavyRed)) {
            view.setBackgroundColor(getResources().getColor(R.color.colorLightRed));
        } else{
            view.setBackgroundColor(getResources().getColor(R.color.colorHeavyRed));
        }
    }

    public void ShowLT(){
        ImageButton ib = findViewById(R.id.imageLeftTopButton);
        ib.setBackgroundColor(getResources().getColor(R.color.colorHeavyPink));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                findViewById(R.id.imageLeftTopButton).setBackgroundColor(getResources().getColor(R.color.colorLightPink));
            }
        }, 500);
    }

    public void ShowRT(){
        ImageButton ib = findViewById(R.id.imageRightTopButton);
        ib.setBackgroundColor(getResources().getColor(R.color.colorHeavyGreen));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                findViewById(R.id.imageRightTopButton).setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
            }
        }, 500);
    }

    public void ShowLB(){
        ImageButton ib = findViewById(R.id.imageLeftBottomButton);
        ib.setBackgroundColor(getResources().getColor(R.color.colorHeavyBlue));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                findViewById(R.id.imageLeftBottomButton).setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
            }
        }, 500);
    }

    public void ShowRB(){
        ImageButton ib = findViewById(R.id.imageRightBottomButton);
        ib.setBackgroundColor(getResources().getColor(R.color.colorHeavyRed));
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                findViewById(R.id.imageRightBottomButton).setBackgroundColor(getResources().getColor(R.color.colorLightRed));
            }
        }, 500);
    }

    public void ShowEasyVar(){
        Handler handler1 = new Handler();
        ShowLT();
        handler1.postDelayed(new Runnable() {
            public void run() {
                ShowRB();
                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    public void run() {
                        ShowRT();
                        Handler handler3 = new Handler();
                        handler3.postDelayed(new Runnable() {
                            public void run() {
                                ShowLT();
                                Handler handler4 = new Handler();
                                handler4.postDelayed(new Runnable() {
                                    public void run() {
                                        ShowLB();
                                    }
                                }, 1000);
                            }
                        }, 1000);
                    }
                }, 1000);
            }
        }, 1000);
    }

    View.OnClickListener wrongB = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            findViewById(R.id.imageLeftTopButton).setEnabled(false);
            findViewById(R.id.imageRightTopButton).setEnabled(false);
            findViewById(R.id.imageLeftBottomButton).setEnabled(false);
            findViewById(R.id.imageRightBottomButton).setEnabled(false);
            ErrorSignal();
            Handler handler1 = new Handler();
            handler1.postDelayed(new Runnable() {
                public void run() {
                    findViewById(R.id.EasyStartbutton).performClick();
                }
            }, 1000);

        }
    };
    View.OnClickListener rightB1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ShowLT();
            CheckStep2();
        }
    };
    View.OnClickListener rightB2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ShowRB();
            CheckStep3();
        }
    };
    View.OnClickListener rightB3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ShowRT();
            CheckStep4();
        }
    };
    View.OnClickListener rightB4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ShowLT();
            CheckStep5();
        }
    };
    View.OnClickListener rightB5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            ShowLB();
            Handler handler1 = new Handler();
            handler1.postDelayed(new Runnable() {
                public void run() {
                    Success();
                }
            }, 500);

        }
    };
    public void ErrorSignal(){
        findViewById(R.id.imageLeftTopButton).setBackgroundColor(getResources().getColor(R.color.colorBlack));
        findViewById(R.id.imageRightTopButton).setBackgroundColor(getResources().getColor(R.color.colorBlack));
        findViewById(R.id.imageLeftBottomButton).setBackgroundColor(getResources().getColor(R.color.colorBlack));
        findViewById(R.id.imageRightBottomButton).setBackgroundColor(getResources().getColor(R.color.colorBlack));
        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            public void run() {
                findViewById(R.id.imageLeftTopButton).setBackgroundColor(getResources().getColor(R.color.colorLightPink));
                findViewById(R.id.imageRightTopButton).setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
                findViewById(R.id.imageLeftBottomButton).setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
                findViewById(R.id.imageRightBottomButton).setBackgroundColor(getResources().getColor(R.color.colorLightRed));
            }
        }, 2000);
    }

    public void CheckStep1() {
        findViewById(R.id.imageLeftTopButton).setEnabled(true);
        findViewById(R.id.imageRightTopButton).setEnabled(true);
        findViewById(R.id.imageLeftBottomButton).setEnabled(true);
        findViewById(R.id.imageRightBottomButton).setEnabled(true);
        findViewById(R.id.imageLeftTopButton).setOnClickListener(rightB1);
        findViewById(R.id.imageRightTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageLeftBottomButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightBottomButton).setOnClickListener(wrongB);
    }
    public void CheckStep2() {
        findViewById(R.id.imageLeftTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageLeftBottomButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightBottomButton).setOnClickListener(rightB2);
    }
    public void CheckStep3() {
        findViewById(R.id.imageLeftTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightTopButton).setOnClickListener(rightB3);
        findViewById(R.id.imageLeftBottomButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightBottomButton).setOnClickListener(wrongB);
    }
    public void CheckStep4() {
        findViewById(R.id.imageLeftTopButton).setOnClickListener(rightB4);
        findViewById(R.id.imageRightTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageLeftBottomButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightBottomButton).setOnClickListener(wrongB);
    }
    public void CheckStep5() {
        findViewById(R.id.imageLeftTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageRightTopButton).setOnClickListener(wrongB);
        findViewById(R.id.imageLeftBottomButton).setOnClickListener(rightB5);
        findViewById(R.id.imageRightBottomButton).setOnClickListener(wrongB);
    }
    public void Success(){
        findViewById(R.id.imageLeftTopButton).setEnabled(false);
        findViewById(R.id.imageRightTopButton).setEnabled(false);
        findViewById(R.id.imageLeftBottomButton).setEnabled(false);
        findViewById(R.id.imageRightBottomButton).setEnabled(false);
        findViewById(R.id.imageLeftTopButton).setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
        findViewById(R.id.imageRightTopButton).setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
        findViewById(R.id.imageLeftBottomButton).setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
        findViewById(R.id.imageRightBottomButton).setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
    }

    public void EasyStartOnClick(View view) {
        ImageButton buttonLT = findViewById(R.id.imageLeftTopButton);
        ImageButton buttonRT = findViewById(R.id.imageRightTopButton);
        ImageButton buttonLB = findViewById(R.id.imageLeftBottomButton);
        ImageButton buttonRB = findViewById(R.id.imageRightBottomButton);
        Button startbutton = findViewById((R.id.EasyStartbutton));
        buttonLT.setBackgroundColor(getResources().getColor(R.color.colorLightPink));
        buttonRT.setBackgroundColor(getResources().getColor(R.color.colorLightGreen));
        buttonLB.setBackgroundColor(getResources().getColor(R.color.colorLightBlue));
        buttonRB.setBackgroundColor(getResources().getColor(R.color.colorLightRed));
        startbutton.setVisibility(View.GONE);
        findViewById(R.id.MediumStartbutton).setVisibility(View.GONE);
        findViewById(R.id.HardStartbutton).setVisibility(View.GONE);
        Handler handler1 = new Handler();
        handler1.postDelayed(new Runnable() {
            public void run() {
                ShowEasyVar();
                Handler handler2 = new Handler();
                handler2.postDelayed(new Runnable() {
                    public void run() {
                        CheckStep1();
                    }
                }, 5000);
            }
        }, 1500);
    }

    public void MediumStartOnClick(View view) {
    }
}
