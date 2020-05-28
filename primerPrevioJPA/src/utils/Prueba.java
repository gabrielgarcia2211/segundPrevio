package utils;

import java.util.List;

import dao.clienteDao;
import dao.servicioDao;
import dao.tiendaDao;
import primerPrevioJPA.entities.Cliente;
import primerPrevioJPA.entities.Servicio;
import primerPrevioJPA.entities.Tienda;





public class Prueba {

	public static void main(String[] args) {
		
		
		//CREACION DE UNA CLIENTE
		
		/*clienteDao cdao = new clienteDao();
		Cliente c = new Cliente();
		
		c.setClave("qqq");
		c.setEmail("garcia@gar.com");
		c.setNombre("gabriel");
		
		cdao.insert(c);*/
		
		
		//CREACION DE UNA TIENDA
		
		/*tiendaDao tdao = new tiendaDao();
		Tienda t = new Tienda();
		
		t.setClave("221s2");
		t.setDescripcion("primeras tienda");
		t.setEmail("tiendas@tineda.com");
		t.setFacebook("golas.com@g");
		t.setImagen("ggsss.jpg");
		t.setLema("si se puedess!");
		t.setNombre("hola mundo");
		t.setPropietario("quintero garcia");
		t.setWeb("tinda.cowm");
		
		
		tdao.insert(t);*/
		
		
		//CREACION DE UN SERVICIO
		
		/*servicioDao sdao = new servicioDao();
		Servicio s = new Servicio();
		Tienda t2 = new Tienda();
		tiendaDao tdao2 = new tiendaDao();
		
		
		t2.setNombre("hola");//traemos un cliente para guardarlo en el servicio
		
		Tienda aux = tdao2.findByFieldObject(Tienda.class, "nombre", t2.getNombre());
		
		s.setDescripcion("primer servicio");
		s.setNombre("quinteroven");
		s.setTiendaBean(aux);
	
		s.setTiendaBean(aux);
		
		sdao.insert(s);*/
		
		
		
		//SEGUIR UNA TIENDA POR UN CLIENTE
		
		Cliente cs = new Cliente();
		clienteDao cdaos = new clienteDao();
		Tienda ts = new Tienda();
		tiendaDao tdaos = new tiendaDao();
		
		cs.setNombre("gabriel");
		Cliente aux = cdaos.findByFieldObject(Cliente.class, "nombre", cs.getNombre());
		
		
		ts.setNombre("hola mundo");
		Tienda aux2 = tdaos.findByFieldObject(Tienda.class, "nombre", ts.getNombre());
		
		
		
		
		//aux2.setClientes(aux);
		
		tdaos.update(aux2);
		
		
		
		
		//ACTUALIZAR UNA TIENDA
		
		/*Tienda tien = new Tienda();
		tiendaDao tdaoa = new tiendaDao();
		
		tien.setNombre("hola");//traemos la tienda que deseamos actualizar
		
		Tienda aux = tdaoa.findByFieldObject(Tienda.class, "nombre", tien.getNombre());//guardamos en un objeto
		
		aux.setClave("221s2");
		aux.setDescripcion("primeras tienda");
		aux.setEmail("tiendas@tineda.com");
		aux.setFacebook("golas.com@g");
		aux.setImagen("ggsss.jpg");
		aux.setLema("si se puedess!");
		aux.setNombre("hola mundo");
		aux.setPropietario("quintero garcia");
		aux.setWeb("tindaGABRIEL.cowm");
		
		tdaoa.update(aux);*/
		
		
		
		
	
	
		
		
	}

}
