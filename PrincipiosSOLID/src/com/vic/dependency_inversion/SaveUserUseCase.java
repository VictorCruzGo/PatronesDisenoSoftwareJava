package com.vic.dependency_inversion;

public class SaveUserUseCase {

	private MysqlPersistence persistence;
	
	public SaveUserUseCase() {
		persistence=new MysqlPersistence();
	}
	
	public void register(User user) {
		persistence.save(user);
	}
}
