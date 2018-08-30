package com.heybox.test_new.activities;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.heybox.test_new.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BulrActivity extends AppCompatActivity {
TextView textView,tv1,tv2;
    private static final String TAG = "BulrActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bulr);
        textView = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        float f = metrics.density;
        textView.setText(String.valueOf(f));
        tv1.setText(String.valueOf(metrics.densityDpi));
        tv2.setText(String.valueOf(metrics.widthPixels));
       AssetManager am =  getResources().getAssets();
       try{
          File file= Environment.getExternalStorageDirectory();
          tv2.setText(file.getName());
           InputStream in =  am.open("data.txt");
           byte[] b  = new byte[in.available()];
           in.read(b);
           String msg = new String(b);
           Log.d(TAG, "onCreate: "+msg);
       }catch (IOException e){
           e.printStackTrace();
       }finally {

       }

    }
}
