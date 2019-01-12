/*
 * Created by Muhammad Utsman on 13/1/2019
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 1/13/19 1:01 AM
 */

package com.utsman.recyclerview.recyclerbottomhider;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.utsman.recyclerview.bottomhider.RecyclerViewBottomHider;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.my_recycler);
        //final LinearLayout bottomView = findViewById(R.id.my_bottom_view);

        FloatingActionButton mFab = findViewById(R.id.my_fab);

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 40; i++) {
            list.add("item "+String.valueOf(i));
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, OrientationHelper.VERTICAL));
        recyclerView.setAdapter(new MyAdapter(list));
        recyclerView.addOnScrollListener(new RecyclerViewBottomHider(mFab, 12));
    }
}
