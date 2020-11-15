package com.vic.dependency_inversion;

public class MysqlPersistencee implements IPersistence {

	@Override
	public void save(User user) {
		System.out.println("Mysql Persistence "+user.toString());
	}
}
