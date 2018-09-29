package com.heybox.test_new.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import com.heybox.test_new.R;
import com.heybox.test_new.views.MyView;

public class ViewActivity extends AppCompatActivity  {
MyView myView ;
Button btnClick;
FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        frameLayout   = findViewById(R.id.fl_contrainer);
      View view = LayoutInflater.from(this).inflate(R.layout.ll_contraner,frameLayout,false);
      frameLayout.addView(view);
//test
    }

}
