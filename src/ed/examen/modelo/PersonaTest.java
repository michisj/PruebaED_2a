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

	@Test
	public void setApellido1Test() {
		try {
			miguel.setApellido1("Ocina");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertEquals("Ocina", miguel.getApellido1());

	}

	@Test
	public void ContructorPersonaTest() {
		Persona Antonio = new Persona("11111551L", "Antonio", "Sanz");
		assertEquals("11111551L", Antonio.getDni());
		assertEquals("Antonio", Antonio.getNombre());
		assertEquals("Sanz", Antonio.getApellido1());

	}
}
