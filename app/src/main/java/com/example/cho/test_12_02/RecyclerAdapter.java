package com.example.cho.test_12_02;

/**
 * Created by cho on 2016-11-17.
 */
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Samsung on 2016-11-17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyVeiwHolder> {

    ArrayList<Magazine> arrayList = new ArrayList<>();
    RecyclerAdapter(ArrayList<Magazine> arrayList)
    {
        this.arrayList = arrayList;
    }

    @Override
    public MyVeiwHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new MyVeiwHolder(view);
    }

    @Override
    public void onBindViewHolder(MyVeiwHolder holder, int position) {
        holder.c_flag.setImageResource(arrayList.get(position).getFlag_id());
        holder.c_name.setText(arrayList.get(position).getName());
        holder.c_text.setText(arrayList.get(position).getText());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public static class MyVeiwHolder extends RecyclerView.ViewHolder
    {
        ImageView c_flag;
        TextView c_name;
        TextView c_text;
        Context applicationContext;

        public MyVeiwHolder(View itemView) {
            super(itemView);
            c_flag = (ImageView) itemView.findViewById(R.id.flag);
            c_name = (TextView) itemView.findViewById(R.id.name);
            c_text = (TextView) itemView.findViewById(R.id.card_text);
            c_flag.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View itemView) {
                    itemView.setLayoutDirection(R.layout.home_to_info);
                }
            });
        }


    }

    public void setFilter(ArrayList<Magazine> newList)
    {
        arrayList = new ArrayList<>();
        arrayList.addAll(newList);
        notifyDataSetChanged();
    }


}
