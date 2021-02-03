package com.example.androidappdemo.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.listener.OnItemLongClickListener;
import com.example.androidappdemo.Adapter.BRAdapter;
import com.example.androidappdemo.Adapter.BRItem;
import com.example.androidappdemo.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class BrvahActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private List<BRItem> mList = new ArrayList<BRItem>();
    private BRAdapter adapter;

    LinearLayoutManager layoutManager = new LinearLayoutManager(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brvah);
        recyclerView = (RecyclerView)findViewById(R.id.BrvahList);
        //模拟的数据（实际开发中一般是从网络获取的）
        initList();

        //创建布局管理

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        //创建适配器
        adapter = new BRAdapter(R.layout.item_brv, mList);
        adapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Toast.makeText(view.getContext(),"This is item :"+view.getTooltipText(),Toast.LENGTH_SHORT).show();
            }
        });

        adapter.setOnItemLongClickListener(new OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                Toast.makeText(view.getContext(),"This is item :"+view.getTooltipText(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        //给RecyclerView设置适配器
        recyclerView.setAdapter(adapter);
    }

    private void initList(){
        for (int i = 0; i < 15; i++) {
            BRItem item = new BRItem();
            item.setTitle("我是第" + i + "条标题");
            item.setContent("第" + i + "条内容");
            mList.add(item);
        }
    }
}