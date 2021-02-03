package com.example.androidappdemo.Adapter;

import android.widget.ImageView;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.androidappdemo.R;

import java.util.List;

public class BRAdapter extends BaseQuickAdapter<BRItem, BaseViewHolder> {
    public BRAdapter(@LayoutRes int layoutResId, @Nullable List<BRItem> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BRItem item) {
        //可链式调用赋值
        helper.setText(R.id.tv_title, item.getTitle())
                .setText(R.id.tv_content, item.getContent())
                .setImageResource(R.id.iv_img, R.mipmap.ic_launcher);

        //获取当前条目position
        //int position = helper.getLayoutPosition();

    }


}
