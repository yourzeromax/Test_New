package com.heybox.test_new.recyclerView;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class StikyDecoration extends RecyclerView.ItemDecoration {

    int headerHeight = 80;
    int dilverHeight = 1;
    Paint dilverPaint, titlePaint, headerPaint;

    DecorationCallback callback;

    public StikyDecoration(DecorationCallback callback) {
        super();
        dilverPaint = new Paint();
        titlePaint = new Paint();
        headerPaint = new Paint();
        titlePaint.setColor(Color.BLACK);
        dilverPaint.setColor(Color.WHITE);
        headerPaint.setColor(Color.YELLOW);
        dilverPaint.setStrokeWidth(1);
        titlePaint.setTextSize(40);
        this.callback = callback;
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
        for (int i = 0; i < parent.getChildCount(); i++) {
            View view = parent.getChildAt(i);
            int position = parent.getChildAdapterPosition(view);
            GroupInfo info = callback.getGroupInfo(position);
            if (i == 0) {               //界面第一个
                int top = parent.getPaddingTop();
                if (info.isLastInGroup()) {
                    int subTop = view.getBottom()-headerHeight;
                    if (subTop < top) {
                        top = subTop;
                    }
                }
                int bottom = top+ headerHeight;
                drawHeader(c, parent.getPaddingLeft(), top, parent.getWidth(), bottom, info.groupId);
            } else {
                if (info.isFirstInGroup()) {
                    int bottom = view.getTop();
                    int top = view.getTop() - headerHeight;
                    drawHeader(c, parent.getPaddingLeft(), top, parent.getWidth(), bottom, info.groupId);
                } else {
                    drawDilver(c, parent.getPaddingLeft(), view.getTop() - dilverHeight, parent.getWidth(), view.getTop());
                }
            }
        }
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        int position = parent.getChildAdapterPosition(view);
        if (callback != null) {
            GroupInfo info = callback.getGroupInfo(position);
            outRect.top = info.isFirstInGroup() ? headerHeight : dilverHeight;
        }
    }

    private void drawHeader(Canvas c,int left,int top,int right,int bottom,int groupId){
        c.drawRect(left,top,right,bottom,headerPaint);
        c.drawText(groupId+"",left+20,bottom-40,titlePaint);
    }

    private void drawDilver(Canvas c,int left,int top,int right,int bottom){
        c.drawRect(left,top,right,bottom,dilverPaint);
    }

    public interface DecorationCallback {

        /**
         * @param position 在adapter中的位置
         * @return 每个位置的GroupInfo描述
         */
        GroupInfo getGroupInfo(int position);
    }
}
