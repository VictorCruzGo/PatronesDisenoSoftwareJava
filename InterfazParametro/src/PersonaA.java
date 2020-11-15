
public class PersonaA implements Ivacio {
	private String nombreA;
	private String apellidoA;
	
	public PersonaA() {
	
	}
	
	public PersonaA(String nombreA, String apellidoA) {
		super();
		this.nombreA = nombreA;
		this.apellidoA = apellidoA;
	}
	public String getNombreA() {
		return nombreA;
	}
	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}
	public String getApellidoA() {
		return apellidoA;
	}
	public void setApellidoA(String apellidoA) {
		this.apellidoA = apellidoA;
	}
			
	public String getNombre() {
		return this.nombreA;
	}
}
