package com.heybox.test_new;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class BroadActivity1 extends AppCompatActivity {
Button btn;
    private static final String TAG = "BroadActivity1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad1);
        Log.d(TAG, "onCreate: ");
        btn = (Button)findViewById(R.id.btn_click);

//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction("receiver");
//        registerReceiver(new MyReceiver(),intentFilter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(BroadActivity1.this,BroadActivity2.class);
                startActivity(intent);
            }
        });
        Intent intent = new Intent();
        intent.setAction("receiver");
        intent.putExtra(MyReceiver.TOAST,"broad1");
        sendBroadcast(intent);
    }

}
