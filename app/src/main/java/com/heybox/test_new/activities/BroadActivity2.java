package com.heybox.test_new.activities;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.heybox.test_new.MyReceiver;
import com.heybox.test_new.R;

public class BroadActivity2 extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broad2);
        btn = findViewById(R.id.btn_click);
        IntentFilter filter = new IntentFilter();
        filter.addAction("broad2");
        registerReceiver(new MyReceiver(),filter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("broad2");
            //    intent.putExtra(MyReceiver.TOAST,"broad2");
                sendBroadcast(intent);
            }
        });

    }
}
