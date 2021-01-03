package com.example.team.base;

import com.example.team.interfaces.IBasePresenter;
import com.example.team.interfaces.IBaseView;

import java.lang.ref.WeakReference;

public abstract class BasePresenter<V extends IBaseView> implements IBasePresenter<V> {

    WeakReference<V> weakReference;
    protected V mView;
    @Override
    public void attachView(V view) {
        weakReference = new WeakReference<V>(view);
        mView = weakReference.get();
    }

    @Override
    public void unAttachView() {
        weakReference.clear();
        mView = null;
    }
}
