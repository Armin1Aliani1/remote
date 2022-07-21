package com.homeWorks.ten.base.repository.impl;

import com.homeWorks.ten.base.repository.BaseRepository;
import com.homeWorks.ten.util.HibernateUtil;

import javax.persistence.EntityManager;

public abstract class BaseRepositoryImpl<T extends BaseRepositoryImpl> implements BaseRepository<T> {
    EntityManager em = HibernateUtil.getEmf().createEntityManager();

    public abstract Class<T> getEntityClass();

    @Override
    public void save(T t) {
        em.persist(t);
    }

    @Override
    public void beginTransaction() {
        em.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        em.getTransaction().commit();
    }

    @Override
    public T findByFullName(String fullName) {
        return em.find(getEntityClass(), fullName);
    }

    public EntityManager getEm() {
        return em;
    }
}
