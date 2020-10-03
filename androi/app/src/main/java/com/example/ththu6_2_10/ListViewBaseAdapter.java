package com.example.ththu6_2_10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewBaseAdapter extends BaseAdapter {
    public ArrayList<product> arraylistListener;
    private List<product> mListenerList;
    Context mContext;

    public ListViewBaseAdapter(List<product> mListenerList, Context context) {

        mContext = context;
        this.mListenerList = mListenerList;
        this.arraylistListener = new ArrayList<product>();
        this.arraylistListener.addAll(mListenerList);

    }

    public class ViewHolder {

        ImageView img;
        ImageView caidat;
        TextView tenbai;
        TextView tencasi;
    }

    @Override
    public int getCount() {
        return mListenerList.size();
    }

    @Override
    public Object getItem(int position) {
        return mListenerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.row, null);
            holder = new ViewHolder();
            holder.img = (ImageView) view.findViewById(R.id.img);
            holder.tencasi=(TextView)view.findViewById(R.id.tencasi);
            holder.caidat = (ImageView) view.findViewById(R.id.caidat);
            holder.tenbai=(TextView)view.findViewById(R.id.ten);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int img = mListenerList.get(position).getImg();
            holder.img.setImageResource(img);
            int caidat = mListenerList.get(position).getCaidat();
            holder.caidat.setImageResource(caidat);
            holder.tenbai.setText(mListenerList.get(position).getTenbai());
            holder.tencasi.setText(mListenerList.get(position).getTencasi());

        }catch (Exception ex){


        }

        return view;
    }

}