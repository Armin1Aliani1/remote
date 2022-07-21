package com.homeWorks.ten.base.service.impl;

import com.homeWorks.ten.base.repository.impl.BaseRepositoryImpl;
import com.homeWorks.ten.base.service.BaseService;

public class BaseServiceImpl<T extends BaseRepositoryImpl<T>> implements BaseService<T> {
    protected T repository;

    public BaseServiceImpl(T repository) {
        this.repository = repository;
    }

    @Override
    public void save(T t) {
        beginTransaction();
        repository.save(t);
        commitTransaction();
    }

    @Override
    public void beginTransaction() {
        repository.beginTransaction();
    }

    @Override
    public void commitTransaction() {
        repository.commitTransaction();
    }
}
