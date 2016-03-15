package com.example.qinda.mvpdemo.test;

import com.example.qinda.mvpdemo.MVP_INTERFACE;
import com.example.qinda.mvpdemo.base.presenter.GenericPersenterOps;

/**
 * Created by Qinda on 2016/3/15.
 */
public class TestPersenter extends GenericPersenterOps<MVP_INTERFACE.PersenterRequestViewOps>
        implements MVP_INTERFACE.ProviderPresenterOps {

    @Override
    public void onCreate(MVP_INTERFACE.PersenterRequestViewOps persenterRequestViewOps) {
        super.onCreate(persenterRequestViewOps);
    }

    @Override
    public void onDestory(boolean isChangingConfiguration) {
        super.onDestory(isChangingConfiguration);
    }
}

