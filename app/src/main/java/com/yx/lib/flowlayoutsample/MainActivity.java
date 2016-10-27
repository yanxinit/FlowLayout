package com.yx.lib.flowlayoutsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yx.lib.flowlayout.FlowLayout;

public class MainActivity extends AppCompatActivity {

    private static final String[] FLOW_CONTENTS1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};
    private static final String[] FLOW_DESCS1 = {"+1", "+2", "+3", "+4"};

    private static final String[] FLOW_CONTENTS2 = {"1", "2", "3", "4", "5", "6", "7"};
    private static final String[] FLOW_DESCS2 = {"+1", "+2", "+3", "+4"};

    FlowLayout mFlowLayout1;
    FlowLayout mFlowLayout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFlowLayout1 = (FlowLayout) findViewById(R.id.layout_flow1);
        mFlowLayout1.setAdapter(new SampleFlowAdapter(this, R.color.selector_text_color,
                R.dimen.text_size, FLOW_CONTENTS1, FLOW_DESCS1));
        mFlowLayout2 = (FlowLayout) findViewById(R.id.layout_flow2);
        mFlowLayout2.setAdapter(new SampleFlowAdapter(this, R.color.selector_text_color,
                R.dimen.text_size, FLOW_CONTENTS2, FLOW_DESCS2));
    }

}
