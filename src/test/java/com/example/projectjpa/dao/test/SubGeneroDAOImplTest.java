/**
 * 
 */
package com.example.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.projectjpa.dao.SubGeneroDAO;
import com.example.projectjpa.dao.impl.SubGeneroDAOImpl;
import com.example.projectjpa.entity.Genero;
import com.example.projectjpa.entity.SubGenero;

/**
 * @author
 * Clase test para comprobar el funcionamiento de los metodos del crud subgenero
 */
class SubGeneroDAOImplTest {

	private SubGeneroDAO subGeneroDAO = new SubGeneroDAOImpl();
	
	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.SubGeneroDAOImpl#guardar(com.example.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testGuardar() {
		SubGenero subGenero = new SubGenero();
		subGenero.setDescripcion("Hard Core");
		subGenero.setFechaCreacion(LocalDateTime.now());
		subGenero.setEstatus(true);
		
		Genero genero = new Genero();
		genero.setDescripcion("Metal");
		genero.setFechaCreacion(LocalDateTime.now());
		genero.setEstatus(true);
		
		subGenero.setGenero(genero);
		this.subGeneroDAO.guardar(subGenero);
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.SubGeneroDAOImpl#actualizar(com.example.projectjpa.entity.SubGenero)}.
	 */
	@Test
	void testActualizar() {
		SubGenero subGenero = this.subGeneroDAO.consultarById(7L);
		subGenero.setDescripcion("Hard Core actualizado");
		subGenero.getGenero().setDescripcion("Metal actualizado");
		this.subGeneroDAO.actualizar(subGenero);
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.SubGeneroDAOImpl#eliminar(java.lang.Long)}.
	 */
	@Test
	void testEliminar() {
		this.subGeneroDAO.eliminar(7L);
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.SubGeneroDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<SubGenero> subGeneroConsultados = this.subGeneroDAO.consultar();
		assertTrue(subGeneroConsultados.size() > 0);
		for (SubGenero subGenero : subGeneroConsultados) {
			System.out.println("SubGenero : "+subGenero.getDescripcion());
			System.out.println("Genero : "+subGenero.getGenero().getDescripcion());
		}
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.SubGeneroDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		fail("Not yet implemented");
	}

}
