import com.vic.model.Conexion;

public class App {
	public static void main(String args[]) {
		//Clave. Instancia por constructor prohibido per ser private
		Conexion c=Conexion.getConexion();
		c.conectar();
		c.desconectar();
		
		System.out.println(c instanceof Conexion);
	}
}
