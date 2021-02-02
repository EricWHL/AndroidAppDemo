package com.example.androidappdemo.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.androidappdemo.Adapter.ListItem;
import com.example.androidappdemo.Adapter.RAdapter;
import com.example.androidappdemo.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends Activity {
    final String TAG = "RecycleViewActivity";

    private final int LAYOUT_VERTICAL_LIST    = 0;
    private final int LAYOUT_HORIZONTAL_LIST  = 1;
    private final int LAYOUT_VERTICAL_GRID    = 2;
    private final int LAYOUT_HORIZONTAL_GRID  = 3;

    LinearLayoutManager mLinerLayoutMgr;
    StaggeredGridLayoutManager mGridLayoutMgr;

    private RecyclerView mView;
    private List<ListItem> mList = new ArrayList<ListItem>();
    private RAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        initView();
        addData();

        mLinerLayoutMgr = new LinearLayoutManager(this);
        mGridLayoutMgr = new StaggeredGridLayoutManager(4,StaggeredGridLayoutManager.VERTICAL);
        switchLayout(LAYOUT_VERTICAL_LIST);

        mAdapter = new RAdapter(mList);
        mView.setAdapter(mAdapter);
    }

    public void onClick(View v) {
        Log.d(TAG,"onClick");
        switch(v.getId()) {
            case R.id.vertical_list:
                switchLayout(LAYOUT_VERTICAL_LIST);
                Log.d(TAG,"vertical_list button clicked");
                break;
            case R.id.horizontal_list:
                switchLayout(LAYOUT_HORIZONTAL_LIST);
                Log.d(TAG,"Detail_list button clicked");

                break;
            case R.id.vertical_grid:
                switchLayout(LAYOUT_VERTICAL_GRID);
                Log.d(TAG,"vertical_grid button clicked");
                break;
            case R.id.horizontal_grid:
                switchLayout(LAYOUT_HORIZONTAL_GRID);
                Log.d(TAG,"horizontal_grid button clicked");
                break;
            default:
                break;
        }
    }

    private void switchLayout(int type) {
        Log.d(TAG,"switchLayout");
        switch (type) {
            case LAYOUT_VERTICAL_LIST:
                Log.d(TAG,"switchLayout to LAYOUT_VERTICAL");
                mLinerLayoutMgr.setOrientation(LinearLayoutManager.VERTICAL);
                mView.setLayoutManager(mLinerLayoutMgr);
                break;
            case LAYOUT_HORIZONTAL_LIST:
                Log.d(TAG,"switchLayout to LAYOUT_DETAIL");
                mLinerLayoutMgr.setOrientation(LinearLayoutManager.HORIZONTAL);
                mView.setLayoutManager(mLinerLayoutMgr);
                break;
            case LAYOUT_VERTICAL_GRID:
                Log.d(TAG,"switchLayout to LAYOUT_VERTICAL_GRID");
                mGridLayoutMgr.setOrientation(StaggeredGridLayoutManager.VERTICAL);
                mView.setLayoutManager(mGridLayoutMgr);
                break;
            case LAYOUT_HORIZONTAL_GRID:
                Log.d(TAG,"switchLayout to LAYOUT_HORIZONTAL_GRID");
                mGridLayoutMgr.setOrientation(StaggeredGridLayoutManager.HORIZONTAL);
                mView.setLayoutManager(mGridLayoutMgr);
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
