package com.homeWorks.ten.base.service;

public interface BaseService<T> {
    void save(T t);

    void beginTransaction();

    void commitTransaction();
}
