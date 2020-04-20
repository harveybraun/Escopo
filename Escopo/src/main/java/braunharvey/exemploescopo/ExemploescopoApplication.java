package braunharvey.exemploescopo;

import braunharvey.exemploescopo.dao.ClasseDAO;
import braunharvey.exemploescopo.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author Harvey Braun
 * @version 1.0
 * @since 20.04.2020
 */
@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		// Retorna Objetos da Classe DAO (Data Access Object)
		ClasseDAO classeDAO1 = applicationContext.getBean(ClasseDAO.class);
		ClasseDAO classeDAO2 = applicationContext.getBean(ClasseDAO.class);

		System.out.println("objetoDAO1: " + classeDAO1);
		System.out.println("objetoDAO2: " + classeDAO2);

		System.out.println("objetoJDBC1: " + classeDAO1.getObjetoJDBC());
		System.out.println("objetoJDBC2: " + classeDAO2.getObjetoJDBC());

		Client client1 = new Client();
		Client client2 = new Client();
		System.out.println("client1: " + client1);
		System.out.println("client2: " + client2);

	}

}
