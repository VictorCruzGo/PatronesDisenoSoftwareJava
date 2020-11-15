
public class App {

	public static void main(String[] args) {
		PersonaA A=new PersonaA();
		A.setNombreA("vic");
		A.setApellidoA("cru");
		
		PersonaB B=new PersonaB();
		B.setNombreB("ric");
		B.setApellidoB("cru");
		
		//MostrarDatos datos=new MostrarDatos(new PersonaA("victor","cruz"));
		//MostrarDatos datos=new MostrarDatos(new PersonaB("ric","cruz"));
		MostrarDatos datos=new MostrarDatos(B);
		System.out.println(datos.getVacio().getNombre());		
	}

}
