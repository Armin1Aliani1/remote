package com.homeWorks.ten.base.repository;

public interface BaseRepository<T> {
    void save(T t);

    void beginTransaction();

    void commitTransaction();

    T findByFullName(String fullName);
}
