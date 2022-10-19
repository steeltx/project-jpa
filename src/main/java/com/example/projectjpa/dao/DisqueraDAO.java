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

}
