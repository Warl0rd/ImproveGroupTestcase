package ru.sokolov.pricelist.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ru.sokolov.pricelist.models.Cathegory;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ImproveGroup");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Cathegory cathegory = entitymanager.find(Cathegory.class, 2);
		
		System.out.println(cathegory);
		
		entitymanager.close();
		emfactory.close();
	}

}
