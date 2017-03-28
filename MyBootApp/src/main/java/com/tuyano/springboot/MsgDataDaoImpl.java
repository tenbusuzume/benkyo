package com.tuyano.springboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class MsgDataDaoImpl implements MsgDataDao<MsgData> {
	private EntityManager entityManager;

	public MsgDataDaoImpl() {
		super();
	}

	public MsgDataDaoImpl(EntityManager manager) {
		entityManager = manager;
	}

	@Override
	public List<MsgData> getAll() {
		Query query = entityManager.createQuery("from MsgData");
		List<MsgData> list = query.getResultList();
		entityManager.close();
		return list;
	}

	@Override
	public MsgData findById(long id) {
		return (MsgData) entityManager.createQuery(
				"from MsgData where id = " + id).getSingleResult();
	}

}