package com.HR24.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class LearnActivity extends AppCompatActivity implements View.OnClickListener {

 private Button btnNums;
 private Button btnWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar);
        btnNums = (Button) findViewById(R.id.btnNums);
        btnNums.setOnClickListener(this);
        btnWords = (Button) findViewById(R.id.btnWords);
        btnWords.setOnClickListener(this);
    }

    public void onClick(View v){

            switch (v.getId()){
                case R.id.btnNums:
                    Intent intent = new Intent(this, LearnNums.class);
                    startActivity(intent);
                    break;
                case R.id.btnWords:
                    intent = new Intent(this, LearnWords.class);
                    startActivity(intent);
                    break;

            }

        }
    }

