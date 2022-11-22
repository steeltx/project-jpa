/**
 * 
 */
package com.example.projectjpa.dao;

import java.util.List;

import com.example.projectjpa.entity.SubGenero;

/**
 * @author
 * Interface DAO para hacer el CRUD de SubGenero
 */
public interface SubGeneroDAO {
	
	/**
	 * Metodo para guardar un SubGenero
	 * @param subGenero {@link SubGenero} objeto a guardar
	 */
	void guardar(SubGenero subGenero);
	
	/**
	 * Metodo para actualizar un SubGenero
	 * @param subGenero {@link SubGenero} objeto a actualizar
	 */
	void actualizar(SubGenero subGenero);
	
	/**
	 * Metodo para eliminar un SubGenero por el ID
	 * @param id {@link Long} identificador a eliminar
	 */
	void eliminar(Long id);
	
	/**
	 * Metodo para consultar la lista de subGeneros
	 * @return {@link List} lista de subgeneros consultados
	 */
	List<SubGenero> consultar();
	
	/**
	 * Metodo para consultar por ID
	 * @param id {@link Long} identificador
	 * @return {@link SubGenero} objeto consultado 
	 */
	SubGenero consultarById(Long id);
}
