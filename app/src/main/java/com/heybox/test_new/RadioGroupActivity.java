package com.heybox.test_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class RadioGroupActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{
RadioGroup rg_list;
RadioButton rb_1,rb_2;
    private static final String TAG = "RadioGroupActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);
        rg_list = (RadioGroup)findViewById(R.id.rg_list);
        rb_1=(RadioButton)findViewById(R.id.rb_1);
        rb_2=(RadioButton)findViewById(R.id.rb_2);
      //  rg_list.setOnCheckedChangeListener(this);
        rb_1.setOnCheckedChangeListener(this);
        rb_2.setOnCheckedChangeListener(this);
        rg_list.check(R.id.rb_1);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()){
            case R.id.rb_1:
        Log.d(TAG, "onCheckedChanged: "+"rb1"+"  "+isChecked);
        break;
            case  R.id.rb_2:
                Log.d(TAG, "onCheckedChanged: "+"rb2"+"  "+isChecked);
                break;
        }
    }
}