package assistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Assistance {

	private static EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("DESENVOLVIMENTO");

	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	public static void close() {
		factory.close();
	}

}
