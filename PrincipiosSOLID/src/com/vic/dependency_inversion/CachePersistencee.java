package com.vic.dependency_inversion;

public class CachePersistencee implements IPersistence {

	@Override
	public void save(User user) {
		System.out.println("Cache Persistence "+user.toString());
	}
}
