package com.mysampleapp.demo;

/**
 * Created by HP on 6/17/2016.
 */
import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.mysampleapp.R;

public class ListAdapter extends BaseAdapter
{
    Context context;
    List<cources> valueList;
    public ListAdapter(List<cources> listValue, Context context)
    {
        this.context = context;
        this.valueList = listValue;
    }

    @Override
    public int getCount()
    {
        return this.valueList.size();
    }

    @Override
    public Object getItem(int position)
    {
        return this.valueList.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        TextView txtDescription;
        TextView txtTitle;

        if(convertView == null)
        {

            LayoutInflater layoutInfiater = (LayoutInflater)this.context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

            convertView = layoutInfiater.inflate(R.layout.list_adapter_view, parent,false);

            txtTitle = (TextView)convertView.findViewById(R.id.adapter_text_title);
            txtDescription = (TextView)convertView.findViewById(R.id.adapter_text_description);
            txtTitle.setText(valueList.get(position).store_name);
            Log.i("Result ", valueList.get(position).store_name);
           txtDescription.setText(valueList.get(position).imagelinks);


        }



        return convertView;
    }
}


