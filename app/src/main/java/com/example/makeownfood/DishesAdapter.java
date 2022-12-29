package com.example.makeownfood;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DishesAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Dishes> dishes;

    public DishesAdapter(Activity activity, List<Dishes> dishes){
        mInflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        this.dishes = dishes;
    }
    @Override
    public int getCount(){
        return dishes.size();

    }
    @Override
    public  Object getItem(int i){return dishes.get(i);}

    @Override
    public long getItemId(int i){return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        View rowView;
        rowView = mInflater.inflate(R.layout.listview, null);
        TextView textView = (TextView) rowView.findViewById(R.id.label);
        ImageView imageView =(ImageView) rowView.findViewById(R.id.pic);
        Dishes dishes = this.dishes.get(i);

        textView.setText(dishes.getType());
        imageView.setImageResource(dishes.getPicId());
        return rowView;


    }



}