package dao;

import primerPrevioJPA.entities.Servicio;
import utils.Conexion;

public class servicioDao 
extends Conexion<Servicio> implements GenericDao<Servicio> {
	public servicioDao(){
		super(Servicio.class);
	}
}
