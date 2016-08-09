package com.training.ifaces;

import java.util.List;

public interface DonorMyDAO<T> {
	
	public int add(T object);
	public int delete(long donorCode);
	public T find(long donorCode);
	public List<T> findAll();

}
