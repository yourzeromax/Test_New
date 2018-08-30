package com.heybox.test_new.recyclerView;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

public class CommonViewHolder extends RecyclerView.ViewHolder {

    SparseArray<View> views;
    private View mItemView;
    private int mLayoutId;

    public static CommonViewHolder create(View mItemView, int mLayoutId) {
        CommonViewHolder viewHolder = new CommonViewHolder(mItemView, mLayoutId);
        return viewHolder;
    }

    private CommonViewHolder(View itemView, int mLayoutId) {
        super(itemView);
        this.mItemView = itemView;
        this.mLayoutId = mLayoutId;
        views = new SparseArray<>();
    }

    public <T extends View> T getView(int mViewId) {
        View view = views.get(mViewId);
        if (view == null) {
            view = itemView.findViewById(mViewId);
            views.put(mViewId, view);
        }
        return (T) view;
    }

    public int getLayoutId() {
        return mLayoutId;
    }

    public View getmItemView() {
        return mItemView;
    }

    public void setTextView(int mViewId, String s) {
        TextView textView = getView(mViewId);
        textView.setText(s);
    }


}
