package com.example.mickey.addviewdemo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mickey.addviewdemo.R;

/**
 * Created by Mickey on 2017/11/30.
 */

public class PopView extends View {
    public static final String TAG = PopView.class.getName();

    private Context mCx;
    private TextView mTitleTextView;
    private Button mOkButton;

    public PopView(Context context) {
        super(context);
        mCx = context;
        init();
    }

    public PopView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mCx = context;
        init();
    }

    public PopView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mCx = context;
        init();
    }

    private void init() {
        Log.d(TAG, "init: ");
    }
}
