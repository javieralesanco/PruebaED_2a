package com.iescomercio.ed.bloque2.repaso.modelo;

/**
 * @author Javier Lopez
 * @version 1.0
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/**
	 * Constructor de un objeto tipo persona con los parametros inicados.
	 * 
	 * @param dni       DNI de la persona.
	 * @param nombre    Nombre de la persona.
	 * @param apellido1 Apellido de la persona.
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Funcion que devolvera el DNI de la persona.
	 * 
	 * @return DNI de la persona en formato String.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Funcion que reescribira de nuevo el DNI de la persona.
	 * 
	 * @param dni DNI nuevo.
	 * @throws Exception El ultimo caracter introducido no es una letra.
	 */
	public void setDni(String dni) throws Exception {
		// comprobacion de si el ultimo caracter es una letra
		if (Character.isLetter(dni.charAt(dni.length()))) {
			this.dni = dni;
		} else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}

	/**
	 * Funcion que devolvera el nombre de la persona.
	 * 
	 * @return Nombre en formato String.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Funcion que sobreescribira el nombre de la persona.
	 * 
	 * @param nombre Nuevo nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Funcion que devilvera el apellido de la persona.
	 * 
	 * @return Apellido de la persona en formato String.
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Funcion que sobreescribira el apellido de la persona.
	 * 
	 * @param apellido1 Apellido nuevo para la persona.
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}

}
