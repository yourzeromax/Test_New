package com.heybox.test_new;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TableLayout;

import com.heybox.test_new.adapter.MyAdapter;
import com.heybox.test_new.adapter.MyViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView v;
    ImageView iv;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        v = (RecyclerView) findViewById(R.id.rv_lists);
//        v.setLayoutManager(new LinearLayoutManager(this));
//        List<String> data = new ArrayList<>();
//        v.setAdapter(new MyAdapter<String>(this, R.layout.activity_dialog, data) {
//                         @Override
//                         public void onBindViewHolder(MyViewHolder holder, String s) {
//                             holder.setText(R.id.all, s);
//                         }
//                     }
//        );

//        Animation a = AnimationUtils.loadAnimation(this, R.anim.anim_scale);
//        a.setFillAfter(true);
//        a.setDuration(200);
//        v.startAnimation(a);
//
//        testAnimation();
//        testAnimator();
//        testHandler();
//        testBitmap();
    }

    public void testBitmap(){
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(),R.drawable.ic_launcher_background,options);
    }

    public void testAnimation(){
        List<String> arrayList = new ArrayList<>();
        iv.setImageResource(R.drawable.drable_list);
        AnimationDrawable ad = (AnimationDrawable) iv.getDrawable();
        ad.setOneShot(false);
        ad.start();

        Animation a = AnimationUtils.loadAnimation(this,R.anim.anim_scale);
        v.setAnimation(a);
        a.start();

//        RotateAnimation ra = new RotateAnimation();
//        v.setAnimation(ra);
//        ra.start();
    }

    public void testAnimator(){
String str = "stash 2";

        ValueAnimator va = ValueAnimator.ofInt(0,100);
        va.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        va.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                Log.d(TAG, "onAnimationUpdate: "+animation.getAnimatedValue());
            }
        });

        AnimatorSet a = new AnimatorSet();
       // a.play()
    }

    public void testHandler(){
        if(Looper.myLooper()==null){
            Looper.prepare();

        }
    }
}
