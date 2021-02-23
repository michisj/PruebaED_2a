package ed.examen.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CursoTest {

	private Curso micurso = new Curso();

	@Test
	public void numeroAlumnosTest() {
		assertEquals(micurso.numeroAlumnos(), new Integer(0));
	}

	@Test
	public void ContructorCursoTest() {
		Curso curso = new Curso();
		assertNotNull(curso);
		assertNotNull(curso.getListaAlumnos());

	}

	@Test
	public void estaRegistradoTest() {
		Persona miguel = new Persona("11111111L", "Miguel", "San Juan");
		Persona Antonio = new Persona("11111551L", "Antonio", "Sanz");

		micurso.aniadirAlumno(miguel);

		assertTrue(micurso.estaRegistrado(miguel.getDni()));
		assertFalse(micurso.estaRegistrado(Antonio.getDni()));

	}

	@Test
	public void aniadirAlumnoTest() {
		Integer Numerodealumnosantes = micurso.numeroAlumnos();

		Persona miguel = new Persona("11111111L", "Miguel", "San Juan");
		micurso.aniadirAlumno(miguel);

		assertEquals(Numerodealumnosantes.intValue() + 1, micurso.numeroAlumnos().intValue());
		assertTrue(micurso.estaRegistrado(miguel.getDni()));

	}

}
