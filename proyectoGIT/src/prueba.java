
public class prueba {
	String nombre;
	String apellido;
	int edad;
	
	/**
	 * Constructor
	 */
	public prueba(String nombre, String apellido, int edad)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	/**
	 * Getter para el nombre
	 */
	public String getNombre()
	{
		return this.nombre;
	}
	
	/**
	 * Getter para el apellido
	 */
	public String getApellido()
	{
		return this.apellido;
	}
	
	/**
	 * Getter para la edad
	 */
	public int getEdad()
	{
		return this.edad;
	}
	
	/**
	 * Setter para el nombre 
	 */
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	/**
	 * Setter para el apellido
	 */
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	
	/**
	 * Setter para la edad
	 */
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
}
