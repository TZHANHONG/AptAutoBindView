package com.example.aptsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.apt.BindView;
import com.example.apt_sdk.DataApi;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView textView;

    @BindView(R.id.tv_1)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataApi.bindView(this);
        tv.setText("a");
    }
}
