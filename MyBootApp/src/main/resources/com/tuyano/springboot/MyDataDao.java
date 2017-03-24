package com.tuyano.springboot;

public interface MyDataDao <T> extends Serializable{

	public List<T> getAll();
}
