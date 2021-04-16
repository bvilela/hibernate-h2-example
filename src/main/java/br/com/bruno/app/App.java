package br.com.bruno.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bruno.dao.UserDAO;
import br.com.bruno.entidade.User;

public class App {
	private static final Logger LOG = LogManager.getLogger(App.class);
	
	public static void main(String args[]) {
		LOG.info("Iniciando...");

		UserDAO dao = new UserDAO();
		
		LOG.info("Listando Todos os Usuarios...");
		LOG.info(dao.getUsers());
		System.out.println("");
		
		LOG.info("Inserindo 3 usuarios...");
		dao.add(new User(1, "Joao", "joao@gmail.com"));
		dao.add(new User(2, "Pedro", "pedro@gmail.com"));
		dao.add(new User(3, "Andre", "andre@gmail.com"));
		System.out.println("");
		
		LOG.info("Listando Todos os Usuarios...");
		LOG.info(dao.getUsers());
		System.out.println("");
				
		LOG.info("Listando Usuario ID 2...");
		LOG.info(dao.findById(2L));
		System.out.println("");
		
		LOG.info("Atualizando Usuario 3...");
		dao.update(new User(3, "Andre Gomes", "andre.gomes@gmail.com"));
		LOG.info(dao.findById(3L));
		System.out.println("");
		
		LOG.info("Deletando Usuario 2...");
		dao.delete(2L);
		LOG.info(dao.getUsers());
		
		LOG.info("Finalizando...");
		System.exit(0);
	}
}
