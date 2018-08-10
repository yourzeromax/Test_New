package com.heybox.test_new.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.heybox.test_new.R;


/*
 *   Description:
 *   Package:com.heybox.test_new.views
 *   Author:yourzeromax
 *   Date:2018/7/31 下午4:33
 */

public class CustomView extends View {
    private static final String TAG = "customView";
    int color;
    String text;

    Paint mPaint;

    int leftX = 200;
    int leftY = 200;
    int rightX = 300;
    int rightY = 300;

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomView);
        color = typedArray.getColor(R.styleable.CustomView_paintColor, Color.BLACK);
        text = typedArray.getString(R.styleable.CustomView_newText);
        typedArray.recycle();
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(color);
        Log.d(TAG, "customView: " + text);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(leftX, leftY, rightX, rightY, mPaint);
    }

    public void addLine(int a1, int a2, int b1, int b2) {
        Path pa = new Path();
       // pa.add
        invalidate();
    }
}
