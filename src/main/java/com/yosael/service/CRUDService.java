package com.yosael.service;

import java.util.List;

public interface CRUDService<T> {
	
	void agregar(T t) throws Exception;
	void modificar(T t) throws Exception;
	void eliminar(T t) throws Exception;
	T buscarPorId(int id) throws Exception;
	List<T> buscarTodos() throws Exception;
}
