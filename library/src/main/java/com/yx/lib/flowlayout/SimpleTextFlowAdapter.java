package com.yx.lib.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public abstract class SimpleTextFlowAdapter extends FlowAdapter {

    int mStyleRes;

    float mTextSize;
    int mTextColor;

    public SimpleTextFlowAdapter(Context context, int styleRes) {
        super(context);
        mStyleRes = styleRes;
        TypedArray array = getContext().obtainStyledAttributes(mStyleRes,
                android.support.v7.appcompat.R.styleable.TextAppearance);
        mTextSize = array.getDimensionPixelSize(
                android.support.v7.appcompat.R.styleable.TextAppearance_android_textSize, 0);
        mTextColor = array.getColor(
                android.support.v7.appcompat.R.styleable.TextAppearance_android_textColor, Color.BLACK);
        array.recycle();
    }

    @Override
    public View getItemView(int position) {
        if (TextUtils.isEmpty(getDesc(position)))
            return null;
        TextView view = new TextView(getContext());
        view.setTextSize(mTextSize);
        view.setTextColor(mTextColor);
        view.setText(getDesc(position));
        view.setGravity(Gravity.CENTER);
        return view;
    }

    public abstract String getDesc(int position);

}
