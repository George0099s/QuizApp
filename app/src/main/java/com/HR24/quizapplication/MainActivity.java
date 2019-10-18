package com.HR24.quizapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.HR24.quizapplication.tests.TestActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public static int rightAnswer;



    Button testActivity;
    Button startLearnActivity;
    Button aboutApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setSupportActionBar((Toolbar) findViewById(R.id.tb));
//
//        ActionBar actionBar = getSupportActionBar();
////        actionBar.setDisplayHomeAsUpEnabled(true);
//        actionBar.setDisplayShowCustomEnabled(true);
//        actionBar.setDisplayShowTitleEnabled(false);
//
//
//        LayoutInflater inflator = (LayoutInflater) this .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View v = inflator.inflate(R.layout.toolbar, null);
//
//        actionBar.setCustomView(v);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar);

        testActivity = (Button) findViewById(R.id.test_your_level);
        testActivity.setOnClickListener(this);
        startLearnActivity = (Button) findViewById(R.id.start_learn);
        startLearnActivity.setOnClickListener(this);
        aboutApp = (Button) findViewById(R.id.aboutApp);
        aboutApp.setOnClickListener(this);



    }


    private Boolean exit = false;
    @Override
    public void onBackPressed() {
        if (exit) {
            finish();
        } else {
            Toast.makeText(this, "Press Back again to Exit.",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
    @Override
    protected void onStart(){
        super.onStart();
        Variables.rightAnswer = 0;
    }
    public void onClick(View v){
        switch (v.getId()){
            case R.id.test_your_level:
                Intent intent = new Intent(this, TestActivity.class);
                startActivity(intent);
                break;
            case R.id.start_learn:
                intent = new Intent(this, LearnActivity.class);
                startActivity(intent);
                break;
            case R.id.aboutApp:
                intent = new Intent(this, aboutApp.class);
                startActivity(intent);
                break;

        }

    }





}
