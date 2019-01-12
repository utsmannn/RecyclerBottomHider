/*
 * Created by Muhammad Utsman on 13/1/2019
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 1/13/19 12:25 AM
 */

package com.utsman.recyclerview.recyclerbottomhider;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private List<String> list;

    public MyAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new MyHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        String item = list.get(i);
        myHolder.textView.setText(item);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyHolder extends RecyclerView.ViewHolder {
        TextView textView;

        MyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.my_text_view);
        }
    }
}
