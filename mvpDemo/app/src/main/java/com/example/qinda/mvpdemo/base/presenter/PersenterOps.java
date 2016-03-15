package com.example.qinda.mvpdemo.base.presenter;

/**
 * Created by Qinda on 2016/3/15.
 *
 * persenterOps实现的接口类
 *
 */
public interface PersenterOps<PersenterRequestViewOps>{

    void onCreate(PersenterRequestViewOps persenterRequestViewOps );

    void onDestory(boolean isChangingConfiguration);

}
