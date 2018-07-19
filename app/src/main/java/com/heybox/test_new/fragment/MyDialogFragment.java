package com.heybox.test_new.fragment;

import android.app.Dialog;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.heybox.test_new.R;

import java.util.HashMap;
import java.util.Map;


/*
 *   Description:
 *   Package:com.heybox.test_new.fragment
 *   Author:yourzeromax
 *   Date:2018/7/9 上午10:53
 */

public class MyDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view = inflater.inflate(R.layout.dialog_my,container,false);
        return view;
    }


}
