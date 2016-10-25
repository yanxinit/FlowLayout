package com.yx.lib.flowlayout;

import android.content.Context;
import android.view.View;

public abstract class FlowAdapter {

    private Context mContext;

    public FlowAdapter(Context context) {
        mContext = context;
    }

    public abstract View getItemView(int position);

    public abstract String[] getContents();

    public abstract int getItemCount();

    public Context getContext() {
        return mContext;
    }

    public abstract int getSelectedCount();

}
