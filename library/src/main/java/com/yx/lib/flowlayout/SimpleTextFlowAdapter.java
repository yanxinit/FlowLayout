package com.yx.lib.flowlayout;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

public abstract class SimpleTextFlowAdapter extends FlowAdapter {

    private int mTextColorRes;
    private int mTextSizeRes;

    public SimpleTextFlowAdapter(Context context, int textColorRes, int textSizeRes) {
        super(context);
        mTextColorRes = textColorRes;
        mTextSizeRes = textSizeRes;
    }

    @Override
    public View getItemView(int position) {
        if (TextUtils.isEmpty(getDesc(position)))
            return null;
        TextView view = new TextView(getContext());
        view.setTextColor(ContextCompat.getColorStateList(getContext(), mTextColorRes));
        view.setTextSize(TypedValue.COMPLEX_UNIT_PX, getContext().getResources().getDimensionPixelSize(mTextSizeRes));
        view.setText(getDesc(position));
        view.setGravity(Gravity.CENTER);
        return view;
    }

    public abstract String getDesc(int position);

}
