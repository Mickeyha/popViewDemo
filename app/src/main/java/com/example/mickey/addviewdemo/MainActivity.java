package com.example.mickey.addviewdemo;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private View mPopView;
    private Button mBtn;
    private ConstraintLayout mLayout;
    private Button mCloseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initLayout();
        inflateView();
        setPopViewComponent();

    }

    private void setPopViewComponent() {
        mCloseBtn = mPopView.findViewById(R.id.close_btn);
        mCloseBtn.setOnClickListener(mCloseBtnListener);
    }

    private void inflateView() {
        LayoutInflater layoutInflater = LayoutInflater.from(MainActivity.this);
        mPopView = layoutInflater.inflate(R.layout.view_detail, null);
        mLayout.addView(mPopView);
        mPopView.setVisibility(View.INVISIBLE);

    }

    private void initLayout() {
        mBtn = findViewById(R.id.button);
        mLayout = findViewById(R.id.relativeLayout);
        mBtn.setOnClickListener(mBtnListener);
    }

    Button.OnClickListener mBtnListener = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            mPopView.setVisibility(View.VISIBLE);
        }
    };

    Button.OnClickListener mCloseBtnListener = new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            mPopView.setVisibility(View.INVISIBLE);
        }
    };
}
