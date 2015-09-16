package com.example.m6.listviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<String>{

    public CustomAdapter(Context context, String[] foods) {
        super(context,R.layout.custom_row, foods);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater ishkInflater = LayoutInflater.from(getContext());
        View customView = ishkInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView ishkText =(TextView)customView.findViewById(R.id.ishkText);
        ImageView ishkImage =(ImageView)customView.findViewById(R.id.ishkImage);

        ishkText.setText(singleFoodItem);
        ishkImage.setImageResource(R.drawable.iresha);
        return customView;

    }
}
