package dao;

import primerPrevioJPA.entities.Cliente;
import utils.Conexion;

public class clienteDao 
extends Conexion<Cliente> 
implements GenericDao<Cliente> {
	public clienteDao(){
		super(Cliente.class);
	}
}
