package com.tuyano.springboot;

import java.io.Serializable;
import java.util.List;

public interface MsgDataDao<T> extends Serializable {

	public List<T> getAll();
	public MsgData findById(long id);
}
