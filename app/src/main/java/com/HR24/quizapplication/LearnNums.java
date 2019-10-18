package com.HR24.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Locale;

public class LearnNums extends AppCompatActivity implements View.OnClickListener {
private Button btnExit;
private Button btnNext;
private Button btnBack;
private TextView num;
private TextView word;
private HashMap hashMap;
private int row;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_nums);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar);





        row = 0;
        num = (TextView) findViewById(R.id.TVword);
        word = (TextView) findViewById(R.id.TVvalue);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(this);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(this);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);
        select();


        }

        @Override
        public void onBackPressed(){
        if(row > 0)
        {
            btnNext.setEnabled(true);
            row -= 1;
            select();
        }
            else
                super.onBackPressed();
        }
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnNext:
                if (Locale.getDefault().getLanguage().equals("ru")) {
                    if (row < Variables.numsRU.size()) {
                        btnBack.setEnabled(true);
                        row += 1;
                        select();
                    }
                }
                else if (Locale.getDefault().getLanguage().equals("en"))
                {
                    if (row < Variables.numsEN.size()) {
                        btnBack.setEnabled(true);
                        row += 1;
                        select();
                    }
                }
                break;
            case R.id.btnExit:
                Intent intent = new Intent(this, LearnActivity.class);
                startActivity(intent);
                break;
            case R.id.btnBack:
                if(row > 0)
                {
                    btnNext.setEnabled(true);
                    row -= 1;
                    select();
                }
                else
                {
                    btnNext.setEnabled(true);
                    btnBack.setEnabled(false);
                }
                break;
        }
    }

    public void select() {
            if(Locale.getDefault().getLanguage().equals("ru")) {
                if (row == Variables.numsRU.size()) {

                    btnNext.setEnabled(false);
                    Toast.makeText(getApplicationContext(),
                            getResources().getString(R.string.toast), Toast.LENGTH_LONG).show();

                } else if (Variables.numsRU.size() > row) {
                    String key = String.valueOf(Variables.numsRU.keySet().toArray()[row]);
                    String value = Variables.numsRU.get(Integer.parseInt(key));

                    num.setText(key);
                    word.setText(value);
                }
            }
                     else if (Locale.getDefault().getLanguage().equals("en"))
                     {

                        if (row == Variables.numsEN.size()) {

                            btnNext.setEnabled(false);
                            Toast.makeText(getApplicationContext(),
                                    getResources().getString(R.string.toast), Toast.LENGTH_LONG).show();

                        }
                        else if (Variables.numsEN.size() > row) {
                            String key = String.valueOf(Variables.numsEN.keySet().toArray()[row]);
                            String value = Variables.numsEN.get(Integer.parseInt(key));

                            num.setText(key);
                            word.setText(value);
                        }
                     }

    }
}

