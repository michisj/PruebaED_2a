package ed.examen.modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonaTest {

	private Persona miguel = new Persona("11111111L", "Miguel", "San Juan");

	@Test
	public void getDniTest() {
		assertEquals("11111111L", miguel.getDni());
	}

	@Test
	public void getNombreTest() {
		assertEquals("Miguel", miguel.getNombre());
	}

	@Test
	public void getApellido1Test() {
		assertEquals("San Juan", miguel.getApellido1());
	}

	@Test
	public void setDniTest() {
		try {
			miguel.setDni("12345678L");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("12345678L", miguel.getDni());

	}

	@Test
	public void setNombreTest() {
		try {
			miguel.setNombre("Antonio");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Antonio", miguel.getNombre());

	}
}
