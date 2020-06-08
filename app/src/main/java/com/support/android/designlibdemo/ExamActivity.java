package com.support.android.designlibdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);
        Button btn_yes = (Button) findViewById(R.id.btn_yes);
        Button btn_no = (Button) findViewById(R.id.btn_no);
        btn_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ExamActivity.this, ActivityRight.class);
                startActivity(intent);
                Toast.makeText(ExamActivity.this, "回答正确", Toast.LENGTH_LONG).show();
                finish();
            }
        });
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExamActivity.this, ActivityWrong.class);
                startActivity(intent);
                Toast.makeText(ExamActivity.this, "回答错误", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}
