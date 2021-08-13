package com.avatar.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;


import com.avatar.demo.R;
import com.avatar.demo.bean.Banner3D;

import java.util.List;

public class BackgroundAdapter extends RecyclerView.Adapter<BackgroundAdapter.ViewHolder> {

    private Context mContext;
    private List<Banner3D> list;

    public BackgroundAdapter(Context context,List<Banner3D> list) {
        super();
        this.mContext=mContext;
        this.list=list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_3d_background, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Banner3D item= list.get(position);
        holder.background.setImageResource(item.getBackground());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView background;

        public ViewHolder(View itemView) {
            super(itemView);
            background = itemView.findViewById(R.id.iv_background);
        }
    }
}
