package com.heybox.test_new.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.Scroller;

import com.heybox.test_new.R;
import com.heybox.test_new.views.MyView;

public class ViewActivity extends AppCompatActivity  {
MyView myView ;
Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        myView = findViewById(R.id.mv_test);
        btnClick = findViewById(R.id.btn_click);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myView.startScrollBy(-1000,-1000,1000);
            }
        });

    }



}
