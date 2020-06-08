package com.support.android.designlibdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.support.android.designlibdemo.service.UserService;

public class Login2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        findViews();
    }
    private EditText username;
    private EditText password;
    private Button login;
    private TextView register;

    private void findViews() {
        username=(EditText) findViewById(R.id.input_email);
        password=(EditText) findViewById(R.id.input_password);
        login=(Button) findViewById(R.id.btn_login);
        register=(TextView) findViewById(R.id.link_signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=username.getText().toString();
                System.out.println(name);
                String pass=password.getText().toString();
                System.out.println(pass);
                System.out.println("****************************************");
                Log.i("TAG",name+"_"+pass);
                UserService uService=new UserService(Login2Activity.this);
                boolean flag=uService.login(name, pass);
                System.out.println("==============================================");
                if(flag){
                    System.out.println("--------------获取成功-----------------------");
                    Log.i("TAG","登录成功");
                    Toast.makeText(Login2Activity.this, "登录成功", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Login2Activity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Log.i("TAG","登录失败");
                    Toast.makeText(Login2Activity.this, "登录失败", Toast.LENGTH_LONG).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(Login2Activity.this,Sigup2Activity.class);
                startActivity(intent);
            }
        });
    }
}

