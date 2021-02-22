package ed.examen.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CursoTest {

	private Curso micurso = new Curso();

	@Test
	public void numeroAlumnosTest() {
		assertEquals(micurso.numeroAlumnos(), new Integer(0));
	}

}
