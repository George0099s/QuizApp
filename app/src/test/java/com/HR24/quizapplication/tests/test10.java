package com.HR24.quizapplication.tests;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.HR24.quizapplication.MainActivity;
import com.HR24.quizapplication.R;
import com.HR24.quizapplication.Variables;

public class test10 extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test10);
        getSupportActionBar().hide();

        btn1 = (Button) findViewById(R.id.goodmorning);
        btn1 .setOnClickListener(this);

        btn2 = (Button) findViewById(R.id.down);
        btn2.setOnClickListener(this);

        btn3 = (Button) findViewById(R.id.old);
        btn3.setOnClickListener(this);

        btn4 = (Button) findViewById(R.id.ten);
        btn4.setOnClickListener(this);

        btnNext = (Button) findViewById(R.id.next_btn);
        btnNext.setOnClickListener(this);


    }


    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder = new AlertDialog.Builder(test10.this);
        builder.setTitle("Заверишить тест?");
        builder.setIcon(R.drawable.ic_launcher_foreground);
        builder.setCancelable(false);
        builder.setNegativeButton("Да",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));


                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.goodmorning:
                Variables.rightAnswer += 1;
                btn1.setBackgroundResource(R.drawable.bg_button);
                Intent intent = new Intent(this, test11.class);
                startActivity(intent);
                break;
            case R.id.down:
                btn2.setBackgroundResource(R.drawable.bg_button_red);
                intent = new Intent(this, test11.class);
                startActivity(intent);
                break;
            case R.id.old:

                btn3.setBackgroundResource(R.drawable.bg_button_red);
                intent = new Intent(this, test11.class);
                startActivity(intent);
                break;
            case R.id.ten:
                btn4.setBackgroundResource(R.drawable.bg_button_red);
                intent = new Intent(this, test11.class);
                startActivity(intent);
                break;
            case R.id.next_btn:
                intent = new Intent(this, test11.class);
                startActivity(intent);
                break;
        }
    }
}
