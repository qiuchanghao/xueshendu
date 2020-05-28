package com.example.xueshenduan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xueshenduan.R;
import com.example.xueshenduan.shiyi;

public class Shi extends MainActivity{
    Button bt;
    Button bt0;
    int Alpha=255;
    public EditText password1;
    public EditText password;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);//保存当前页面状态信息
        setContentView(R.layout.login_activity);//显示下一跳页面
        bt=(Button)findViewById(R.id.login_button11);
        bt.setOnClickListener(new Button.OnClickListener(){
                                  public void onClick(View v){
                                      password1 = (EditText) findViewById(R.id.password1);
                                      password = (EditText) findViewById(R.id.password);
                                      String mypassword1 = password1.getText().toString();
                                      String mypassword = password.getText().toString();// 获取文本框输入信息
                                      Intent intent = new Intent();

                                      intent.setClass(Shi.this, shiyi.class);//指定接下来要启动的class
                                      Bundle bundle = new Bundle();
                                      bundle.putString("password1", mypassword1);
                                      bundle.putString("password", mypassword);
                                      intent.putExtras(bundle);// 封装数据准备传递
                                      startActivity(intent);
                                  }
                              }
        );

    }

}