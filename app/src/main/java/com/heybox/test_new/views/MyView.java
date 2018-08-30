package com.heybox.test_new.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Scroller;

import com.heybox.test_new.R;

public class MyView extends View {
    private static final String TAG = "MyView";
    String s;
Paint mPaint;
Scroller scroller;
    public MyView(Context context) {
        this(context, null);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.MyView, defStyleAttr, 0);
        s = typedArray.getString(R.styleable.MyView_Text);
        mPaint = new Paint();
        mPaint.setTextSize(40);
        mPaint.setStrokeWidth(2);
        mPaint.setColor(Color.GRAY);
        scroller = new Scroller(context);
        typedArray.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(s,20,20,mPaint);
        canvas.drawColor(Color.RED);
        Log.d(TAG, "onDraw: " + s);
    }

    public void startScrollBy(int dx,int dy,int duration){
        scroller.startScroll(getScrollX(),getScrollY(),dx,dy,duration);
        invalidate();
    }

    @Override
    public void computeScroll() {
        if(scroller.computeScrollOffset()){
            scrollTo(scroller.getCurrX(),scroller.getCurrY());
            postInvalidate();
        }
    }
}
