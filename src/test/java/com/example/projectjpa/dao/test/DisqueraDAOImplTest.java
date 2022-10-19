/**
 * 
 */
package com.example.projectjpa.dao.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.projectjpa.dao.DisqueraDAO;
import com.example.projectjpa.dao.impl.DisqueraDAOImpl;
import com.example.projectjpa.entity.Disquera;

/**
 * @author
 *
 */
class DisqueraDAOImplTest {
	
	private DisqueraDAO disqueraDAO = new DisqueraDAOImpl();

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.DisqueraDAOImpl#guardar(com.example.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testGuardar() {
		Disquera disquera = new Disquera();
		disquera.setDescripcion("Disquera 2");
		disquera.setFechaCreacion(LocalDateTime.now());
		disquera.setEstatus(true);
		this.disqueraDAO.guardar(disquera);
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.DisqueraDAOImpl#actualizar(com.example.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testActualizar() {
		Disquera disqueraConsultada = this.disqueraDAO.consultarById(9L);
		disqueraConsultada.setDescripcion("Disquera 1 modificada");
		this.disqueraDAO.actualizar(disqueraConsultada);
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.DisqueraDAOImpl#eliminar(com.example.projectjpa.entity.Disquera)}.
	 */
	@Test
	void testEliminar() {
		this.disqueraDAO.eliminar(9L);
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.DisqueraDAOImpl#consultar()}.
	 */
	@Test
	void testConsultar() {
		List<Disquera> disquerasConsultadas = this.disqueraDAO.consultar();
		assertTrue(disquerasConsultadas.size() > 0);
		disquerasConsultadas.forEach(disquera -> {
			System.out.println("Disquera: "+ disquera.getDescripcion());
		});
	}

	/**
	 * Test method for {@link com.example.projectjpa.dao.impl.DisqueraDAOImpl#consultarById(java.lang.Long)}.
	 */
	@Test
	void testConsultarById() {
		Disquera disquera = this.disqueraDAO.consultarById(7L);
		System.out.println("Disquera : "+disquera.getDescripcion());
	}

}
