package com.avatar.demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.avatar.demo.R;
import com.avatar.demo.banner3d.SensorLayout;
import com.avatar.demo.bean.Banner3D;

import java.util.List;


public class ForegroundAdapter extends PagerAdapter {

    private Context mContext;
    private List<Banner3D> list;

    public ForegroundAdapter(Context context, List<Banner3D> list) {
        super();
        this.mContext=context;
        this.list=list;
    }

    @Override
    public View instantiateItem(ViewGroup container, int position) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_3d_foreground, null);
        Banner3D item= list.get(position);
        view.findViewById(R.id.iv_mid).setBackgroundResource(item.getMid());
        view.findViewById(R.id.iv_foreground).setBackgroundResource(item.getForeground());
        SensorLayout sensorLayout= view.findViewById(R.id.sensor_layout);
        sensorLayout.setDirection(SensorLayout.DIRECTION_RIGHT);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject( View view, Object object) {
        return view == object;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView mid;
        private SensorLayout sensor;
        private ImageView foreground;

        public ViewHolder(View itemView) {
            super(itemView);
            mid = itemView.findViewById(R.id.iv_mid);
            sensor = itemView.findViewById(R.id.sensor_layout);
            foreground=itemView.findViewById(R.id.iv_foreground);
        }
    }
}
