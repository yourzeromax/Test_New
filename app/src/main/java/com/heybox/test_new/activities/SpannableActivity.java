package com.heybox.test_new.activities;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.TypedValue;
import android.widget.TextView;

import com.heybox.test_new.R;

public class SpannableActivity extends AppCompatActivity {
TextView tvSpannable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spannable);
        tvSpannable = findViewById(R.id.tv_spannable);

tvSpannable.setTextSize(TypedValue.COMPLEX_UNIT_PX);

        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.RED);
        //BackgroundColorSpan span = new BackgroundColorSpan(Color.GRAY);

        SpannableString spannableString = new SpannableString("shaw是一头猪");
        spannableString.setSpan(foregroundColorSpan,0,4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        //spannableString.setSpan();
        tvSpannable.setText(spannableString);
        try{
            Class cls = Class.forName("CommonViewHolder.class");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
