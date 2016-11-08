package com.yx.lib.flowlayoutsample;

import android.content.Context;

import com.yx.lib.flowlayout.SimpleTextFlowAdapter;

public class SampleFlowAdapter extends SimpleTextFlowAdapter {

    private String[] mContents;
    private String[] mDescs;

    public SampleFlowAdapter(Context context, int styleRes,
                             String[] contents, String[] descs) {
        super(context, styleRes);
        mContents = contents;
        mDescs = descs;
    }

    @Override
    public String getDesc(int position) {
        if (position < mDescs.length)
            return mDescs[position];
        return null;
    }

    @Override
    public String[] getContents() {
        return mContents;
    }

    @Override
    public int getItemCount() {
        return mContents.length;
    }

    @Override
    public int getSelectedCount() {
        return mDescs.length;
    }

}
