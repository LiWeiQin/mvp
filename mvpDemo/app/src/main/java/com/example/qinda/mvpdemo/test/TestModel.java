package com.example.qinda.mvpdemo.test;

import com.example.qinda.mvpdemo.MVP_INTERFACE;
import com.example.qinda.mvpdemo.base.model.GenericModelOps;

/**
 * Created by Qinda on 2016/3/15.
 */
public class TestModel extends GenericModelOps<MVP_INTERFACE.ModelRequestPersenterOps>
        implements MVP_INTERFACE.ProviderModelOps {

    @Override
    public void onCreate(MVP_INTERFACE.ModelRequestPersenterOps modelRequestPersenterOps) {
        super.onCreate(modelRequestPersenterOps);
    }

    @Override
    public void onDestory(boolean isChangingConfiguration) {
        super.onDestory(isChangingConfiguration);
    }
}
