/*
 * Created by Muhammad Utsman on 13/1/2019
 * Copyright (c) 2019 . All rights reserved.
 * Last modified 1/13/19 12:41 AM
 */

package com.utsman.recyclerview.bottomhider;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public class RecyclerViewBottomHider extends RecyclerView.OnScrollListener {
    private View view;
    private int dipBottomMargin = 0;
    private int scrollDist = 0;
    private boolean isVisible = true;

    public RecyclerViewBottomHider(View view) {
        this.view = view;
    }

    public RecyclerViewBottomHider(View view, int dipBottomMargin) {
        this.view = view;
        this.dipBottomMargin = dipBottomMargin;
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        int margin = Math.round(TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dipBottomMargin, view.getResources().getDisplayMetrics()
        ));

        int minimum = 25;
        if (isVisible && scrollDist > minimum) {
            view.animate()
                    .translationY(view.getHeight()+margin)
                    .setInterpolator(new AccelerateInterpolator(2))
                    .start();

            scrollDist = 0;
            isVisible = false;
        }

        else if (!isVisible && scrollDist < -minimum) {
            view.animate()
                    .translationY(0)
                    .setInterpolator(new DecelerateInterpolator(2))
                    .start();

            scrollDist = 0;
            isVisible = true;
        }

        if ((isVisible && dy > 0) || (!isVisible && dy < 0)) {
            scrollDist += dy;
        }
    }
}
