package com.heybox.test_new.fragment;

import android.animation.Animator;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.heybox.test_new.R;


/*
 *   Description:
 *   Package:com.heybox.test_new.fragment
 *   Author:yourzeromax
 *   Date:2018/7/9 上午9:44
 */

public class TestFragment extends Fragment {
    private static final String TAG = "TestFragment";

    private static final String INFO_MESSAGE = "message";

    public static TestFragment instance(String message) {
        TestFragment test = new TestFragment();
        Bundle b = new Bundle();
        b.putString(TAG, message);
        test.setArguments(b);
        return test;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //  super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment, container, false);
        view.post(new Runnable() {
            @Override
            public void run() {

            }
        });

        Message msg = Message.obtain();
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        return super.onCreateAnimator(transit, enter, nextAnim);
    }
}
