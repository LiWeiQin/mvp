package com.example.qinda.mvpdemo.base.presenter;

import android.util.Log;

/**
 * Created by Qinda on 2016/3/15.
 */
public abstract class GenericPersenterOps<PersenterRequestViewOps> implements PersenterOps<PersenterRequestViewOps> {

    private static final String TAG = GenericPersenterOps.class.getSimpleName();
    /**
     * persenter 持有view的接口的引用
     */
    private PersenterRequestViewOps persenterRequestViewOps;


    @Override
    public void onCreate(PersenterRequestViewOps persenterRequestViewOps) {
        this.persenterRequestViewOps = persenterRequestViewOps;
    }

    @Override
    public void onDestory(boolean isChangingConfiguration) {
        Log.d(TAG, "onDestory:" + isChangingConfiguration);
    }
}
