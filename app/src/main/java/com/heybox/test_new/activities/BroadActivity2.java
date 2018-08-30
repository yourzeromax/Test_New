package com.heybox.test_new.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heybox.test_new.MyReceiver;
import com.heybox.test_new.R;

public class BroadActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad2);
        Intent intent = new Intent();
        intent.setAction("receiver");
        intent.putExtra(MyReceiver.TOAST,"broad2");
        sendBroadcast(intent);
    }
}
