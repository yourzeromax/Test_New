package com.heybox.test_new.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/*
 *   Description:
 *   Package:com.heybox.test_new.adapter
 *   Author:yourzeromax
 *   Date:2018/7/12 下午8:57
 */

public class MyViewHolder<T> extends RecyclerView.ViewHolder {
    SparseArray<View> mViews;
    Context context;
    int ResId;
    View contentView;

    public MyViewHolder(View itemView, int ResId) {
        super(itemView);
        this.ResId = ResId;
        this.contentView = itemView;
    }

    public <T extends View> T getView(int ResId) {
        View v = mViews.get(ResId);
        if (v == null) {
            v = contentView.findViewById(ResId);
            mViews.put(ResId, v);
        }
        return (T) v;
    }

    public void setText(int ResId, String s) {
        TextView t = (TextView) getView(ResId);
        t.setText(s);
    }

    public static MyViewHolder getViewHolder(Context context, int ResId, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(ResId, parent);
        MyViewHolder holder = new MyViewHolder(view, ResId);
        return holder;
    }
}
