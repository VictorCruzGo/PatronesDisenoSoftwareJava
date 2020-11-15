
public class PersonaB implements Ivacio {
	private String nombreB;
	private String apellidoB;
	
	public PersonaB() {}
	
	public PersonaB(String nombreB, String apellidoB) {
		super();
		this.nombreB = nombreB;
		this.apellidoB = apellidoB;
	}
	public String getNombreB() {
		return nombreB;
	}
	public void setNombreB(String nombreB) {
		this.nombreB = nombreB;
	}
	public String getApellidoB() {
		return apellidoB;
	}
	public void setApellidoB(String apellidoB) {
		this.apellidoB = apellidoB;
	}
	
	public String getNombre() {
		return this.nombreB;
	}
}
