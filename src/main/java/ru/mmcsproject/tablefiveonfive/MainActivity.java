package ru.mmcsproject.tablefiveonfive;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private Chronometer mChronometer;
    private Button mButton;
    private TextView mTextView;
    private Button[] buttons = new Button[25];
    private int i = 1;
    long StartTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.button26);
        mTextView = findViewById(R.id.textView);
        mChronometer = findViewById(R.id.chronometer);
    }

    public void onCLick(View view) {
        i = 1;
        buttons[0] = findViewById(R.id.button);
        buttons[1] = findViewById(R.id.button2);
        buttons[2] = findViewById(R.id.button3);
        buttons[3] = findViewById(R.id.button4);
        buttons[4] = findViewById(R.id.button5);
        buttons[5] = findViewById(R.id.button6);
        buttons[6] = findViewById(R.id.button7);
        buttons[7] = findViewById(R.id.button8);
        buttons[8] = findViewById(R.id.button9);
        buttons[9] = findViewById(R.id.button10);
        buttons[10] = findViewById(R.id.button11);
        buttons[11] = findViewById(R.id.button12);
        buttons[12] = findViewById(R.id.button13);
        buttons[13] = findViewById(R.id.button14);
        buttons[14] = findViewById(R.id.button15);
        buttons[15] = findViewById(R.id.button16);
        buttons[16] = findViewById(R.id.button17);
        buttons[17] = findViewById(R.id.button18);
        buttons[18] = findViewById(R.id.button19);
        buttons[19] = findViewById(R.id.button20);
        buttons[20] = findViewById(R.id.button21);
        buttons[21] = findViewById(R.id.button22);
        buttons[22] = findViewById(R.id.button23);
        buttons[23] = findViewById(R.id.button24);
        buttons[24] = findViewById(R.id.button25);

        for (int i = 0; i < 25; i++) {
            buttons[i].setVisibility(View.VISIBLE);
        }
        mTextView.setVisibility(View.VISIBLE);
        mChronometer.setVisibility(View.VISIBLE);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < 26; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for(int i = 0; i<25; i++) {
            buttons[i].setText(list.get(i).toString());
        }

        mTextView.setText("Найдите 1");
        mChronometer.setBase(SystemClock.elapsedRealtime());
        mChronometer.start();

        StartTime = System.currentTimeMillis();
    }

    public void onClickRandom(View view) {
        String text = ((Button) view).getText().toString();

        if (text.equals(Integer.toString(i))) {
            mTextView.setText("Найдите " + Integer.toString(i+1));
            i++;
        }

        if (i==26) {
            mChronometer.stop();
            long elepsedTimeMills = System.currentTimeMillis() - StartTime;
            final long sec = elepsedTimeMills / 1000;
            final int min = (int)(sec % 3600)/60;
            final int seconds = (int)sec % 60;
            mTextView.setText(String.format("Игра окончена! \n Ваше время: %02d:%02d", min, seconds));
            mChronometer.setVisibility(View.INVISIBLE);
            i++;
        }

    }


}
