package com.ayubbaba.passwordsaver.passwordsaver;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import helper.Constant;

/**
 * Created by ayub on 18-Jan-17.
 */

public class Save_Data extends AppCompatActivity {
    @BindView(R.id.emailid)
    EditText emailid;
    @BindView(R.id.password)
    EditText password;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedata_page);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.savebutton)
    public void savebutton(){
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(password.getWindowToken(),0);
        emailid.setEnabled(false);
        password.setEnabled(false);
        emailid.clearFocus();
        password.clearFocus();
        Constant.t(findViewById(R.id.savebutton),"Save Button Clicked");
    }
}
