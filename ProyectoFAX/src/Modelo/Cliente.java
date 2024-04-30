package Modelo;

public class Cliente {
	/**
	 * Creamos tres variable nombre apellidos y edad
	 */
	private String nombre;
	private String apellidos;
	private int edad;
	/**
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public Cliente(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	/**
	 * todo los los get y set los ejerciocios
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
}
