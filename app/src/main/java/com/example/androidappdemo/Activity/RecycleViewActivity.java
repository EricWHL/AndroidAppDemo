package com.example.androidappdemo.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidappdemo.Adapter.ListItem;
import com.example.androidappdemo.Adapter.RAdapter;
import com.example.androidappdemo.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends Activity {
    final String TAG = "RecycleViewActivity";

    private RecyclerView mView;
    private List<ListItem> mList = new ArrayList<ListItem>();
    private RAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        initView();
        addData();

        LinearLayoutManager manager = new LinearLayoutManager(this);

        mView.setLayoutManager(manager);
        mAdapter = new RAdapter(mList);
        mView.setAdapter(mAdapter);
    }

    public void onClick(View v) {
        Log.d(TAG,"onClick");
        switch(v.getId()) {
            case R.id.vertical_list:
                Log.d(TAG,"vertical_list button clicked");
                break;
            case R.id.Detail_list:
                Log.d(TAG,"Detail_list button clicked");

                break;
            case R.id.List:
                Log.d(TAG,"List button clicked");
                break;
            default:
                break;
        }
    }

    private void addData() {
        for (int i = 0 ; i<50 ; i++){
            ListItem item = new ListItem(R.mipmap.ic_launcher, i + ":Hello World!");
            //添加到数组
            mList.add(item);
            item = null;
        }
    }

    private void initView () {
        mView =(RecyclerView) findViewById(R.id.RecycList);
    }
}
