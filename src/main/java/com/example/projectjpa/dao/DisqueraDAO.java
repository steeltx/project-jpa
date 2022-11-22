/**
 * 
 */
package com.example.projectjpa.dao;

import java.util.List;

import com.example.projectjpa.entity.Disquera;

/**
 * @author
 * Interface que genera el DAO para el crud de disquera
 */
public interface DisqueraDAO {
	
	void guardar(Disquera disquera);
	
	void actualizar(Disquera disquera);
	
	void eliminar(Long id);
	
	List<Disquera> consultar();
	
	Disquera consultarById(Long id);
	
	/**
	 * Metodo que permite consultar con JPQL la disquera por descripcion
	 * @param descripcion {@link String} descripción de la disquera
	 * @return {@link Disquera} la disquera consultada
	 */
	Disquera consultarByDescripcionJPQL(String descripcion);
	
	/**
	 * Metodo que permite consultar con SQL Nativo la disquera
	 * @param descripcion {@link String} descripción de la disquera
	 * @return {@link Disquera} la disquera consultada
	 */
	Disquera consultarByDescripcionNative(String descripcion);

}
