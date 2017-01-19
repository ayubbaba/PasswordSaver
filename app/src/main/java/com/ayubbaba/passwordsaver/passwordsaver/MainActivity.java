package com.ayubbaba.passwordsaver.passwordsaver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import adapter.SaveData_adapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import helper.Constant;
import io.realm.Realm;
import io.realm.RealmResults;
import pojo.SaveDataPojo;

public class MainActivity extends AppCompatActivity {

    Realm mainrealm;
    SaveData_adapter saveData_adapter;
    @BindView(R.id.passwordlist)
    RecyclerView passwordlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Realm.init(MainActivity.this);
        mainrealm=Realm.getDefaultInstance();
        passwordlist.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mainrealm.beginTransaction();
        RealmResults<SaveDataPojo> savedataresult=mainrealm.where(SaveDataPojo.class).findAll();
        saveData_adapter=new SaveData_adapter(savedataresult);
        Constant.l(savedataresult.toString());
        passwordlist.setAdapter(saveData_adapter);
        saveData_adapter.notifyDataSetChanged();
        mainrealm.commitTransaction();

    }
    @OnClick(R.id.savebutton)
    public void savebutton(){
        Intent savedataintent=new Intent(getApplicationContext(),Save_Data.class);
        savedataintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(savedataintent);
    }
}
