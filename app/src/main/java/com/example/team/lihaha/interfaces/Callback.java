package com.example.team.lihaha.interfaces;

public interface Callback<T> {

    void success(T t);

    void fail(String err);

}
