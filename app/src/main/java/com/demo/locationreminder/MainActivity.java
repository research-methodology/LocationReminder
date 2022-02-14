package com.demo.locationreminder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.StackView;

public class MainActivity extends AppCompatActivity {
StackView stackView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);


    }
    private void inflateLayouts(){
        LayoutInflater layoutInflater=LayoutInflater.from(MainActivity.this);
        View backgroundView=layoutInflater.inflate(R.layout.background_layout,stackView);
        View topView=layoutInflater.inflate(R.layout.top_layout,stackView);
    }
}
































