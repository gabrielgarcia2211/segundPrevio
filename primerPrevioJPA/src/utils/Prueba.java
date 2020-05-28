package utils;

import java.util.List;

import dao.clienteDao;
import dao.tiendaDao;
import primerPrevioJPA.entities.Cliente;
import primerPrevioJPA.entities.Tienda;





public class Prueba {

	public static void main(String[] args) {
		
		
		//CREACION DE UNA TIENDA
		
		clienteDao cdao = new clienteDao();
		Cliente c = new Cliente();
		
		c.setClave("qqq");
		c.setEmail("garcia@gar.com");
		c.setNombre("gabriel");
		
		cdao.insert(c);
		
		
		//CREACION DE UNA TIENDA
		
		tiendaDao tdao = new tiendaDao();
		Tienda t = new Tienda();
		
		c.setClave("qqq");
		c.setEmail("garcia@gar.com");
		c.setNombre("gabriel");
		
		cdao.insert(c);
		
		
	    //user.setUser("gabriel");
		
		
		/*e.setApellido(apellido);
		e.setCarreraBean(carreraBean);
		e.setCodigo(codigo);
		e.setFechanacimiento(fechanacimiento);
		e.setGenero(genero);
		e.setNombre(nombre);*/
		
		//Mensaje aux = mdao.findByFieldObject(Mensaje.class, "website", m.getWebsite());
		
	
	
		
		
	}

}
