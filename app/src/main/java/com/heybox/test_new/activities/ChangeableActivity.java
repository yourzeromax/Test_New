package com.heybox.test_new.activities;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.heybox.test_new.R;

public class ChangeableActivity extends AppCompatActivity {
RelativeLayout rlBtn;
    private static final String TAG = "ChangeableActivity";
Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeable);
        rlBtn = findViewById(R.id.rl_btn);
       LinearLayout linearLayout = findViewById(R.id.ll_parent);
     int num =  linearLayout.getChildCount();
        Log.d(TAG, "onCreate: "+num);
    }

    public void onClick(View view){
        ValueAnimator animator = ValueAnimator.ofInt(40,200);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int)animation.getAnimatedValue();
                LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) rlBtn.getLayoutParams();
                params.height = value;
                rlBtn.setLayoutParams(params);
            }
        });
        animator.start();
    }
}
