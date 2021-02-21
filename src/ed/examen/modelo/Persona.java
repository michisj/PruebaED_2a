package ed.examen.modelo;
/**
 * Personas de un curso
 * @author Miguel San Juan
 *
 */
public class Persona {

	private String dni;
	private String nombre;
	private String apellido1;

	public Persona() {
	}

	/**
	 * Crea una persona
	 * 
	 * @param dni       dni de la persona
	 * @param nombre    nombre de la persona
	 * @param apellido1 apellido de la persona
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}

	/**
	 * Devuelve el dni
	 * 
	 * @return el dni de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * almacena el dni de la persona
	 * 
	 * @param dni el dni de la persona
	 * @throws Exception El ultimo caracter introducido no es una letra
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
	 * Devuelve el nombre
	 * 
	 * @return el nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * almacena el nombre de la persona
	 * 
	 * @param nombre el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el apellido
	 * 
	 * @return el apellido de la persona
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * almacena el apellido de la persona
	 * 
	 * @param apellido1 el apellido de la persona
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
