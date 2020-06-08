package com.support.android.designlibdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.support.android.designlibdemo.service.UserService;

public class Sigup2Activity extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private EditText age;
    private RadioGroup sex;
    private Button register;
    private TextView login;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sigup2);
        findViews();
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name=username.getText().toString().trim();
                String pass=password.getText().toString().trim();
                String agestr=age.getText().toString().trim();
                String sexstr=((RadioButton)Sigup2Activity.this.findViewById(sex.getCheckedRadioButtonId())).getText().toString();
                Log.i("TAG",name+"_"+pass+"_"+agestr+"_"+sexstr);
                UserService uService=new UserService(Sigup2Activity.this);
                User user=new User();
                user.setUsername(name);
                user.setPassword(pass);
                user.setAge(Integer.parseInt(agestr));
                user.setSex(sexstr);
                uService.register(user);
                Toast.makeText(Sigup2Activity.this, "注册成功", Toast.LENGTH_LONG).show();
            }
        });
    }
    private void findViews() {
        login=(TextView) findViewById(R.id.link_login) ;
        username=(EditText) findViewById(R.id.input_name);
        password=(EditText) findViewById(R.id.input_password);
        age=(EditText) findViewById(R.id.input_age);
        sex=(RadioGroup) findViewById(R.id.sexRegister);
        register=(Button) findViewById(R.id.btn_signup);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Sigup2Activity.this,Login2Activity.class);
                startActivity(intent);
            }
        });
    }

}