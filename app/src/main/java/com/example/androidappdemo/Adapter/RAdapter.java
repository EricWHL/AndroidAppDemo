package com.example.androidappdemo.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidappdemo.R;

import java.util.List;

public class RAdapter extends RecyclerView.Adapter<RAdapter.ViewHolder> {
    //动态数组
    private List<ListItem> mList;

    //构造
    public RAdapter(List<ListItem> mList) {
        this.mList = mList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //绑定行布局
        View view = View.inflate(parent.getContext(),R.layout.list_item,null);
        //实例化ViewHolder
        ViewHolder holder = new ViewHolder(view);

        //item设置监听
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast
                Toast.makeText(view.getContext(),"This is item :"+holder.text.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        //textView设置监听
        holder.text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast
                Toast.makeText(view.getContext(),"This is textView :"+holder.text.getText(),Toast.LENGTH_SHORT).show();
            }
        });

        return holder;
    }

    //设置数据
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        //获取当前实体类对象
        ListItem vo = mList.get(position);
        //设置
        holder.text.setText(vo.getName());
        holder.img.setImageResource(vo.getImg());
    }

    //数量
    @Override
    public int getItemCount() {
        return mList.size();
    }

    //内部类
    class ViewHolder extends RecyclerView.ViewHolder{
        //行布局中的控件
        ImageView img;
        TextView text;
        //视图
        View view;
        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;
            //绑定控件
            img = (ImageView) itemView.findViewById(R.id.item_img);
            text = (TextView) itemView.findViewById(R.id.item_text);
        }
    }
}
