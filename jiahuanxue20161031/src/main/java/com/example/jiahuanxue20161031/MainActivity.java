package com.example.jiahuanxue20161031;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.viewdemo.ViewDemo;

public class MainActivity extends AppCompatActivity {
    private ViewDemo viewDemo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewDemo = (ViewDemo) findViewById(R.id.viewDemo);
        viewDemo.beginRubbler(20,
                0.5f , "谢谢参与");
    }
}
