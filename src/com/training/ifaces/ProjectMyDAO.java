/**
 * 
 */
package com.training.ifaces;

import java.util.List;

/**
 * @author mrai7
 *
 */
public interface ProjectMyDAO<T> {
	
	public int add(T object);
	public int delete(long projectId);
	public T find(long projectId);
	public List<T> findAll();

}
