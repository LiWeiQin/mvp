package com.example.qinda.mvpdemo;

import com.example.qinda.mvpdemo.base.model.ModelOps;
import com.example.qinda.mvpdemo.base.presenter.PersenterOps;
import com.example.qinda.mvpdemo.base.view.ActivityView;

/**
 * Created by Qinda on 2016/3/14.
 */
public interface MVP_INTERFACE {

    /**
     * persenter 请求View的方法
     * 由view来实现，让persenter持有其接口
     */
    public interface PersenterRequestViewOps extends ActivityView {

    }

    /**
     * provider 实现其接口
     * 由view持有其接口
     */
    public interface ProviderPresenterOps extends PersenterOps<PersenterRequestViewOps> {

    }

    /**
     * model 请求Persenter的方法
     * 由persenter来实现，让model
     */
    public interface ModelRequestPersenterOps {

    }

    /**
     * model 实现其接口
     * 有presenter持有其接口引用
     */
    public interface ProviderModelOps extends ModelOps<ModelRequestPersenterOps> {

    }


}
