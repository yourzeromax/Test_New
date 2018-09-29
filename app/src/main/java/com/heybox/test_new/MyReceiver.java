package com.heybox.test_new;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.heybox.test_new.activities.BroadActivity1;
import com.heybox.test_new.activities.BroadActivity2;

public class MyReceiver extends BroadcastReceiver {
    public static final String TOAST = "toast";
    private static final String TAG = "MyReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        // throw new UnsupportedOperationException("Not yet implemented");
        //   Log.d(TAG, "onReceive: "+intent.getExtras().getString(TOAST));

        if ("receiver".equals(intent.getAction())) {
            Intent intent1 = new Intent(context, BroadActivity2.class);
            intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        }
        if ("broad2".equals(intent.getAction())) {
            Intent in2 = new Intent(context, BroadActivity1.class);
            in2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(in2);
        }

    }
}
