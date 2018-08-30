package com.heybox.test_new.activities;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.heybox.test_new.R;
import com.heybox.test_new.fragment.MyDialogFragment;

public class DialogActivity extends AppCompatActivity  implements View.OnClickListener{
Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        btnClick =(Button) findViewById(R.id.btn_click);
        btnClick.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        MyDialogFragment fragment = new MyDialogFragment();
        fragment.show(getSupportFragmentManager(),"123");
    }
}
