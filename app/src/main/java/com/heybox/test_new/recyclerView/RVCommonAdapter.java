package com.heybox.test_new.recyclerView;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public abstract class RVCommonAdapter<T> extends RecyclerView.Adapter<CommonViewHolder> {

    List<T> mData;
    int mLayoutId;
    Context mContext;
    LayoutInflater mInflater;

    public RVCommonAdapter(Context mContext, int mLayoutId, List<T> mData) {
        super();
        this.mContext = mContext;
        this.mLayoutId = mLayoutId;
        this.mData = mData;
        mInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public CommonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(mLayoutId, parent, false);
        CommonViewHolder viewHolder = CommonViewHolder.create(view, mLayoutId);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CommonViewHolder holder, int position) {
        onBindViewHolder(holder, mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    abstract void onBindViewHolder(RecyclerView.ViewHolder viewHolder, T data);

}
