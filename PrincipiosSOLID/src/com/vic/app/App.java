package com.vic.app;

import java.util.ArrayList;
import java.util.List;

import com.vic.dependency_inversion.CachePersistencee;
import com.vic.dependency_inversion.MysqlPersistencee;
import com.vic.dependency_inversion.IPersistence;
import com.vic.dependency_inversion.SaveUserUseCase;
import com.vic.dependency_inversion.SaveUserUseCasee;
import com.vic.dependency_inversion.User;
import com.vic.interface_segregation.Boss;
import com.vic.interface_segregation.ISignWorker;
import com.vic.interface_segregation.IWork;
import com.vic.interface_segregation.IWorker;
import com.vic.interface_segregation.Operator;
import com.vic.interface_segregation.Robot;
import com.vic.liskov_herencia.ABird;
import com.vic.liskov_herencia.Duck;
import com.vic.liskov_herencia.Eagle;
import com.vic.liskov_herencia.AFlyingBird;
import com.vic.liskov_herencia.Penguin;
import com.vic.open_close.CaballeroCisne;
import com.vic.open_close.CaballeroDragon;
import com.vic.open_close.CaballeroFenix;
import com.vic.open_close.CaballeroPegaso;
import com.vic.open_close.ACaballeroZodiaco;
import com.vic.open_close.CaballeroZodiacoUseCaseAtaque;
import com.vic.single_responsability.Tarea;

public class App {
	public static void main(String[] args) {
		//mainSingleReponsability();
		//mainOpenClose();
		//mainLiskov();
		//mainInterfaceSegregation();
		//mainDependencyInversion();
		mainDependencyInversionOptimizado();
	}
	
	public static void mainSingleReponsability() {
		Tarea tarea=new Tarea();
		String ubicacion="C:/files";
		String fichero="my_cv.pdf";
		
		tarea.descargarFichero(ubicacion);
		tarea.parsearFichero(fichero);
		tarea.guardarFicher(fichero);
	}
	
	public static void mainOpenClose() {
		ACaballeroZodiaco seiya=new CaballeroPegaso();				
		ACaballeroZodiaco shiryu=new CaballeroDragon();
		ACaballeroZodiaco hyoga=new CaballeroCisne();
		ACaballeroZodiaco ikki=new CaballeroFenix();
		//CaballeroFenix ikki2=new CaballeroFenix();
		
		List<ACaballeroZodiaco> caballerosBronce=new ArrayList<>();
		caballerosBronce.add(seiya);
		caballerosBronce.add(shiryu);
		caballerosBronce.add(hyoga);
		caballerosBronce.add(ikki);
		//caballerosBronce.add(ikki2);
		
		//CaballeroZodiacoAtaque caballerosAtaques=new CaballeroZodiacoAtaque();
		//caballerosAtaques.ataque(caballerosBronce);		
		new CaballeroZodiacoUseCaseAtaque().ataque(caballerosBronce);
	}
	
	public static void mainLiskov() {
		AFlyingBird pato=new Duck("pipocas", "cua cua cua");
		AFlyingBird agila=new Eagle("serpientes", "eaiii eaiii");
		ABird pinguino=new Penguin("peces", "wiiii");
		
		System.out.println("---Pato---");
		pato.fly();
		System.out.println("Soy pato me gusta la "+pato.getEat());
		System.out.println("Soy pato y digo "+pato.getSound());
		
		System.out.println("---Agila---");
		agila.fly();
		System.out.println("Soy agila me gusta la "+agila.getEat());
		System.out.println("Soy agila y digo "+agila.getSound());
		
		System.out.println("---Pinguino---");
		System.out.println("Soy pinguino no puedo volar");
		System.out.println("Soy pinguino me gusta la "+pinguino.getEat());
		System.out.println("Soy pinguino y digo "+pinguino.getSound());
	}
	
	public static void mainInterfaceSegregation() {
		System.out.println("---Operator Worker---");
		IWork operator=new Operator();
		operator.work();
		operator.signWork();
		
		System.out.println("---Boss Worker---");
		IWork boss=new Boss();
		boss.work();
		operator.signWork();
		
		System.out.println("---Robot Worker---");
		IWorker robot=new Robot();
		robot.work();		
	}
	
	public static void mainDependencyInversion() {		
		User user=new User();
		user.setName("Victor");
		user.setLastName("Cruz");
		
		SaveUserUseCase useCase=new SaveUserUseCase();
		
		useCase.register(user);
	}
	
	public static void mainDependencyInversionOptimizado() {
		User user=new User();
		user.setName("Victor");
		user.setLastName("Cruz");
		
		//Persistence persistence=new MysqlPersistencee();
		IPersistence persistence=new CachePersistencee();
		
		SaveUserUseCasee useCase=new SaveUserUseCasee(persistence);		
		useCase.register(user);
	}
}
