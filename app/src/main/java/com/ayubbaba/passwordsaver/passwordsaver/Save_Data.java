package com.ayubbaba.passwordsaver.passwordsaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.realm.Realm;
import io.realm.RealmResults;
import pojo.SaveDataPojo;

/**
 * Created by ayub on 18-Jan-17.
 */

public class Save_Data extends AppCompatActivity {
    /*@BindView(R.id.emailid)
    MaterialEditText emailid;*/
    @BindView(R.id.password)
    MaterialEditText password;
    Realm saverealm;
    int count;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.savedata_page);
        ButterKnife.bind(this);
        saverealm=Realm.getDefaultInstance();
        RealmResults<SaveDataPojo> savedataresult=saverealm.where(SaveDataPojo.class).findAll();
        if (savedataresult!=null){
            saverealm.beginTransaction();
            count=savedataresult.size();
            saverealm.commitTransaction();
        }

    }

    @OnClick(R.id.savebutton)
    public void savebutton(){
        /*InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(password.getWindowToken(),0);
        emailid.setEnabled(false);
        password.setEnabled(false);
        emailid.clearFocus();
        password.clearFocus();*/
        saverealm.beginTransaction();
        SaveDataPojo savepojo=saverealm.createObject(SaveDataPojo.class);
        savepojo.setId(count++);
//        savepojo.setEmail(emailid.getText().toString());
        savepojo.setPassword(password.getText().toString());
        saverealm.commitTransaction();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
//        Constant.t(findViewById(R.id.savebutton),"Your data has been saved");
    }
}
