package com.vic.dependency_inversion;

public class SaveUserUseCasee {
	//Se inyecta mediante el constructor
	private IPersistence persistence;
	
	public SaveUserUseCasee() {
		
	}
	
	public SaveUserUseCasee(IPersistence persistence) {
		this.persistence=persistence;
	}
	
	public void register(User user) {
		persistence.save(user);
	}
}
