package com.example.qinda.mvpdemo.base.model;

/**
 * Created by Qinda on 2016/3/15.
 */
public interface ModelOps<ModelRequestPersenterOps> {

    void onCreate(ModelRequestPersenterOps modelRequestPersenterOps);

    void onDestory(boolean isChangingConfiguration);


}
