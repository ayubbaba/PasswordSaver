package com.ayubbaba.passwordsaver.passwordsaver;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by ayub on 18-Jan-17.
 */

public class Save_Data extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedata_page);
        ButterKnife.bind(this);
    }
}
