package com.HR24.quizapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CountRightAnswers extends AppCompatActivity {
    private TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_right_answers);
//        getSupportActionBar().set
        count = (TextView) findViewById(R.id.count_right_answers);
        count.setText(getResources().getString(R.string.countRightAnswers)+ " " + Variables.rightAnswer);

    }
    @Override
    public void onDestroy() {
        Variables.rightAnswer = 0;
        super.onDestroy();
//        Log.i("MyTag","destroyed");
    }
}
