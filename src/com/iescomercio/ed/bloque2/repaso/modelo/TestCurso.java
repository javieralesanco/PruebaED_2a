package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCurso {

	Curso c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Curso();
		c.aniadirAlumno(new Persona());
		c.aniadirAlumno(new Persona("123456789A", "Test", "Test"));
	}

	@Test
	void testEliminarAlumno() {
		boolean pasado = false;
		try {
			c.eliminarAlumno("123");
		} catch (Exception e) {
			pasado = true;
		}
		assertTrue(pasado);
		try {
			c.eliminarAlumno("123456789A");
		} catch (Exception e) {
			assertEquals(1, c.numeroAlumnos());
		}
	}

	@Test
	void testAniadirAlumno() {
		c.aniadirAlumno(new Persona());
		assertEquals(3, c.numeroAlumnos());
	}

	@Test
	void testEstaRegistrado() {
		assertFalse(c.estaRegistrado("123"));
		assertTrue(c.estaRegistrado("123456789A"));
	}

	@Test
	void testCurso() {
		c = new Curso();
		assertTrue(c != null);
	}

	@Test
	void testNumeroAlumnos() {
		assertEquals(2, c.numeroAlumnos());
	}

}
