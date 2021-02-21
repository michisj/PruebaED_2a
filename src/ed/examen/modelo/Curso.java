package ed.examen.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private List<Persona> listaAlumnos;

	/**
	 * elimina el alumno con el dni que está como parámetro
	 * 
	 * @param dni el dni del alumno
	 * @throws Exception Lanza excepcion si la longitud no es adecuada
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if (dni.length() == 9) {// comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); // solo hace falta el dni
		} else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}

	/**
	 * Le añade un alumno al curso
	 * 
	 * @param p es el alumno que queremos añadir
	 */

	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}

	/**
	 * Comprueba si el alumno está registrado
	 * 
	 * @param dni dni del alumno que queremos comprobar
	 * @return true si está registrado false si no lo está
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
	 * Crea un curso nuevo
	 */
	public Curso() {
		listaAlumnos = new ArrayList<Persona>();
	}

	/**
	 * Devuelve el número de alumnos del curso
	 * 
	 * @return número de alumnos del curso
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
