package com.heybox.test_new;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.heybox.test_new.utils.ViewUtils;

public class TestActivityClip extends AppCompatActivity {
Button btn;
TextView bitmapWidth,bitmapHeight,screenWidth,screenHeight,desnity,navigationBarHeight,statusbarHeight;
TextView decorViewWidth,decorViewHeight;
Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_clip);
        btn = findViewById(R.id.btn);
        activity = this;
        bitmapHeight = findViewById(R.id.bitmap_height);
        bitmapWidth = findViewById(R.id.bitmap_width);
        screenHeight = findViewById(R.id.screen_height);
        screenWidth = findViewById(R.id.screen_width);
        desnity = findViewById(R.id.desnity);
        navigationBarHeight = findViewById(R.id.navigationbar_height);
        statusbarHeight = findViewById(R.id.statusbar_height);
        decorViewHeight = findViewById(R.id.decor_height);
        decorViewWidth = findViewById(R.id.decor_width);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,        //1794
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Bitmap bitmap =  ViewUtils.activityShot(activity);
                bitmapHeight.setText(ViewUtils.getBitmapHeight(bitmap)+"");
                bitmapWidth.setText(ViewUtils.getBitmapWidth(bitmap)+"");
                screenHeight.setText(ViewUtils.getScreenHeight(activity)+"");
                screenWidth.setText(ViewUtils.getScreenWidth(activity)+"");
                desnity.setText(ViewUtils.getDesnity(activity)+"");
                navigationBarHeight.setText(ViewUtils.getNavigationBarHeight(activity)+"");
                statusbarHeight.setText(ViewUtils.getStatusBarHeight(activity)+"");
                decorViewWidth.setText(ViewUtils.getViewWidth(activity)+"");
                decorViewHeight.setText(ViewUtils.getViewHeight(activity)+"");
            }
        });
    }

}
