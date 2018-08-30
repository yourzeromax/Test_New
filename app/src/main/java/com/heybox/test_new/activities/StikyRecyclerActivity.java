package com.heybox.test_new.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.heybox.test_new.R;
import com.heybox.test_new.adapter.MyAdapter;
import com.heybox.test_new.adapter.MyViewHolder;
import com.heybox.test_new.recyclerView.GroupInfo;
import com.heybox.test_new.recyclerView.StikyDecoration;

import java.util.ArrayList;
import java.util.List;

public class StikyRecyclerActivity extends AppCompatActivity {
    private static final String TAG = "StikyRecyclerActivity";
    RecyclerView recyclerView;
    List<String> items = new ArrayList<>();
    MyAdapter<String> myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stiky_recycler);
        recyclerView = findViewById(R.id.rv_items);

        for (int i = 0; i < 56; i++) {
            items.add(i + " String");
        }

        myAdapter = new MyAdapter<String>(this, R.layout.item_sample, items) {
            @Override
            public void onBindViewHolder(final MyViewHolder holder, String s) {
                holder.setText(R.id.tv_item, s);
                holder.getView(R.id.tv_item).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d(TAG, "onClick: " + recyclerView.getChildLayoutPosition(holder.itemView));
                    }
                });
            }
        };
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new StikyDecoration(new StikyDecoration.DecorationCallback() {
            @Override
            public GroupInfo getGroupInfo(int position) {
                int groupId = position/5;
                int groupIndex = position%5;
                int groupLength = 5;
                return new GroupInfo(groupId,groupIndex,groupLength);
            }
        }));
    }

}
