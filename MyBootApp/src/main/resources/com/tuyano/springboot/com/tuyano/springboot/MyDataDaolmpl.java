package com.tuyano.springboot;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class MyDataDaolmpl implements MyDataDao<MyData>{

	private static final long serialVersionUID = 1L;

	private EntityManager entityManager;

	public MyDataDaoImpl(){
		super();
	}

	public MyDataDaoImpl(EntityManager manager){
		entityManager = manager;
	}

	@Override
	public List<MyData> getAll(){
		Query query = entityManager.createQuery("from MyData");
		List<MyData> list = query.getResultList();
		entityManager.close();
		return list;
	}

}
