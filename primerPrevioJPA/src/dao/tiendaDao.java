package dao;


import primerPrevioJPA.entities.Tienda;
import utils.Conexion;

public class tiendaDao 
extends Conexion<Tienda> implements GenericDao<Tienda> {
	public tiendaDao(){
		super(Tienda.class);
	}
}
