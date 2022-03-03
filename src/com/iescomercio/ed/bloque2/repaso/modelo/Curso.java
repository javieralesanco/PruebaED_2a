package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que crea un listado de alumnos y funciones para manejarlo.
 * 
 * @author javieralesanco
 * @version 1.0
 * @see Persona {@link Persona}
 */
public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * Esta funcion eliminara el alumno por DNI.
	 * 
	 * @param dni DNI del alumno a eliminar.
	 * @throws Exception El dni no tiene la longitud adecuada.
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Funcion que aniadira al aluma introducido.
	 * 
	 * @param p Objeto tipo persona que sera introducido para meter en el listado.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Funcion que comprueba si el alumno con DNI introducidop por parametro esta
	 * registrado.
	 * 
	 * @param dni DNI del alumno a buscar.
	 * @return Devolvera verdader en caso de que este y falso en caso de que no
	 *         este.
	 */
	public Boolean estaRegistrado(String dni) {
		int i = 0;
		Boolean encontrado = false;
		while (!encontrado && i < listaAlumnos.size()) {
			if (listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado = true;
			}
			i++;
		}
		return encontrado;
	}

	/**
	 * Construuctor del curso. Inicializara un array vacio de alumnos.
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Funcion que devolvera el numero de alumnos que tiene el curso.
	 * 
	 * @return Tamaño del curso como entero.
	 */
	public Integer numeroAlumnos() {
		return listaAlumnos.size();
	}

	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
