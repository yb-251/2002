package com.example.team.lihaha.base;




import com.example.team.lihaha.interfaces.IBaseModel;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public abstract class BaseModel implements IBaseModel {

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    public void addDisposible(Disposable disposable) {
        compositeDisposable.add(disposable);
    }

    @Override
    public void clear() {
        compositeDisposable.clear();
    }
}