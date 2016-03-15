package com.example.qinda.mvpdemo.base.model;

import android.util.Log;

import com.example.qinda.mvpdemo.MVP_INTERFACE.ModelRequestPersenterOps;

/**
 * Created by Qinda on 2016/3/15.
 */
public abstract class GenericModelOps<ModelRequestPersenterOps> implements ModelOps<ModelRequestPersenterOps> {

    private static final String TAG = GenericModelOps.class.getSimpleName();
    /**
     * 持有persenter的接口引用
     */
    private ModelRequestPersenterOps modelRequestPersenterOps;


    @Override
    public void onCreate(ModelRequestPersenterOps modelRequestPersenterOps) {
        this.modelRequestPersenterOps = modelRequestPersenterOps;
    }


    @Override
    public void onDestory(boolean isChangingConfiguration) {
        Log.d(TAG, "onDestroy:" + isChangingConfiguration);

    }
}


