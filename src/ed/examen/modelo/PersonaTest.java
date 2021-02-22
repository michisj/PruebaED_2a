package ed.examen.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonaTest {

	private Persona miguel = new Persona("11111111L", "Miguel", "San Juan");

	@Test
	public void getDniTest() {
		assertEquals("11111111L", miguel.getDni());
	}

}
