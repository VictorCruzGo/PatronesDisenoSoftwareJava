package com.vic.dependency_inversion;

public class MysqlPersistence {
	public void save(User user) {
		System.out.println("Usuario registrado: "+user.toString());
	}
}
