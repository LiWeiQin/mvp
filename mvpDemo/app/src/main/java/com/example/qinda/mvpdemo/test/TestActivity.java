package com.example.qinda.mvpdemo.test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.example.qinda.mvpdemo.MVP_INTERFACE;
import com.example.qinda.mvpdemo.R;
import com.example.qinda.mvpdemo.base.view.GenericActivity;

/**
 * Created by Qinda on 2016/3/15.
 */
public class TestActivity extends GenericActivity<MVP_INTERFACE.PersenterRequestViewOps, TestPersenter>
        implements MVP_INTERFACE.PersenterRequestViewOps {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //调用自己的mvp周期
        super.onCreate(TestPersenter.class,this);

    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(getThisApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(String msg, int duration) {
        Toast.makeText(getThisApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getThisApplicationContext() {
        return this.getApplicationContext();
    }

    @Override
    public Context getActivityContext() {
        return this;
    }
}
