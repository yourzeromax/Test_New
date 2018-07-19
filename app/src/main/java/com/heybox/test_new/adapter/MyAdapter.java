package com.heybox.test_new.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;


/*
 *   Description:
 *   Package:com.heybox.test_new.adapter
 *   Author:yourzeromax
 *   Date:2018/7/12 下午8:56
 */

public abstract class MyAdapter<T> extends RecyclerView.Adapter<MyViewHolder> {
    List<T> mData;
    Context context;
    int ResId;

    public MyAdapter(Context context, int ResId, List<T> mData) {
        super();
        this.context = context;
        this.ResId = ResId;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MyViewHolder viewHolder = MyViewHolder.getViewHolder(context,ResId,parent);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        onBindViewHolder(holder, mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public abstract void onBindViewHolder(MyViewHolder holder, T s);
}
