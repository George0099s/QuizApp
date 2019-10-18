package com.HR24.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class LearnWords extends AppCompatActivity implements View.OnClickListener {
    private Button btnExit;
    private Button btnNext;
    private TextView num;
    private TextView word;
    private Button btnBack;
    private int row;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_words);
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
                if( Locale.getDefault().getLanguage().equals("ru"))
                {
                        if (row < Variables.keysRU.length)
                        {
                            btnBack.setEnabled(true);
                            row += 1;
                            select();
                        } else {
                            row = Variables.keysRU.length;
                            Toast.makeText(getApplicationContext(),
                                    getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();

                        }
                }
                else if ( Locale.getDefault().getLanguage().equals("en"))
                {
                    if (row < Variables.keysEN.length)
                    {
                        btnBack.setEnabled(true);
                        row += 1;
                        select();
                    } else {
                        row = Variables.keysEN.length;
                        Toast.makeText(getApplicationContext(),
                                getResources().getString(R.string.toast), Toast.LENGTH_SHORT).show();

                    }
                }
                break;
            case R.id.btnExit:
                Intent intent = new Intent(this, LearnActivity.class);
                startActivity(intent);
                break;

                case R.id.btnBack:
                    if (row > 0) {
                        btnNext.setEnabled(true);
                        row -= 1;
                        select();
                    } else {
                        btnBack.setEnabled(false);
                        btnNext.setEnabled(true);
                    }


                break;

        }
            }


    public void select()
    {
        if ( Locale.getDefault().getLanguage().equals("ru"))
        {
            if (row == Variables.keysRU.length)
            {

                btnNext.setEnabled(false);
                Toast.makeText(getApplicationContext(),
                        getResources().getString(R.string.toast), Toast.LENGTH_LONG).show();

            }
            else if (Variables.keysRU.length > row)
            {
                num.setText(Variables.keysRU[row]);
                word.setText(Variables.valuesRU[row]);
            }

        }
        else if ( Locale.getDefault().getLanguage().equals("en"))
        {
            if (row == Variables.keysEN.length)
            {

                btnNext.setEnabled(false);
                Toast.makeText(getApplicationContext(),
                        getResources().getString(R.string.toast), Toast.LENGTH_LONG).show();

            }
            else if (Variables.keysEN.length > row)
            {
                num.setText(Variables.keysEN[row]);
                word.setText(Variables.valuesEN[row]);
            }
        }


    }




    }
