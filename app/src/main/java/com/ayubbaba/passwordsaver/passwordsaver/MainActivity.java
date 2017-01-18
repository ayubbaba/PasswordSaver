package com.ayubbaba.passwordsaver.passwordsaver;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import helper.Constant;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.mainview)
    ConstraintLayout mainview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.savebutton)
    public void savebutton(){
        Constant.t(findViewById(R.id.savebutton),"Button Clicked");
    }
}
