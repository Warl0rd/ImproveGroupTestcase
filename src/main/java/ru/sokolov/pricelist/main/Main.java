package ru.sokolov.pricelist.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ru.sokolov.pricelist.models.Cathegory;
import ru.sokolov.pricelist.models.Product;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ImproveGroup");
		EntityManager entitymanager = emfactory.createEntityManager();
		
		Product product = entitymanager.find(Product.class, 3);
		Cathegory cathegory = entitymanager.find(Cathegory.class, 2);
		
		System.out.println(product);
		System.out.println(cathegory);
		
		entitymanager.close();
		emfactory.close();
	}

}
