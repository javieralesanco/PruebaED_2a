package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPersona {

	private Persona p;

	@BeforeEach
	void setUp() throws Exception {
		p = new Persona("123456789A", "Test", "Apellido");
	}

	@Test
	void testPersonaStringStringString() {
		Persona p = new Persona("123456789B", "Test1", "Apellido1");
		assertTrue(p != null);
		assertEquals("123456789B", p.getDni());
		assertEquals("Test1", p.getNombre());
		assertEquals("Apellido1", p.getApellido1());
	}

	@Test
	void testGetDni() {
		assertEquals("123456789A", p.getDni());
	}

	// Da error
	@Test
	void testSetDni() {
		boolean pasado = false;
		try {
			p.setDni("987654321A");
			p.setDni("1234567893");
		} catch (Exception e) {
			pasado = true;
		}
		assertTrue(pasado);
		assertEquals("987654321A", p.getDni());
	}

	@Test
	void testGetNombre() {
		assertEquals("Test", p.getNombre());
	}

	@Test
	void testSetNombre() {
		p.setNombre("Test2");
		assertEquals("Test2", p.getNombre());
	}

	@Test
	void testGetApellido1() {
		assertEquals("Apellido", p.getApellido1());
	}

	@Test
	void testSetApellido1() {
		p.setApellido1("Testeo");
		assertEquals("Testeo", p.getApellido1());
	}

}
