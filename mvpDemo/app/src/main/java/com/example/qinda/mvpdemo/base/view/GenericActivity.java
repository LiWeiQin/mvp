package com.example.qinda.mvpdemo.base.view;

import android.support.v7.app.AppCompatActivity;
import com.example.qinda.mvpdemo.MVP_INTERFACE;
import com.example.qinda.mvpdemo.base.presenter.PersenterOps;

/**
 * Created by Qinda on 2016/3/15.
 */
public abstract class GenericActivity<PersenterRequestViewOps,
        GenericPersenterOps extends PersenterOps<PersenterRequestViewOps>>
        extends AppCompatActivity implements MVP_INTERFACE.PersenterRequestViewOps {

    private static final String TAG = GenericActivity.class.getSimpleName();
    /**
     * 持有其persenter的接口
     */
    private GenericPersenterOps genericPersenterOps;

    public void onCreate(Class<GenericPersenterOps> objType, PersenterRequestViewOps view) {
        try {
            initalize(objType, view);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private void initalize(Class<GenericPersenterOps> objType, PersenterRequestViewOps view)
            throws InstantiationException, IllegalAccessException {
        genericPersenterOps = objType.newInstance();
        genericPersenterOps.onCreate(view);
    }
}
