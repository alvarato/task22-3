package com.app.task22.Ej3.DAO;

import java.sql.SQLException;
import java.util.ArrayList;


import com.app.task22.Ej3.Models.Proyecto;

public class DAOProyecto extends DAO{

	
	public ArrayList<Proyecto> showAll() throws SQLException{
		String query = "SELECT * FROM proyecto";
		ArrayList<Proyecto> listaProyectos = new ArrayList<>();
		READ(query);
		while (resultado.next()) {
			String id = resultado.getString(1);
			String nombre = resultado.getString(2);
			int horas = resultado.getInt(3);
			Proyecto p = new Proyecto(id, nombre,horas);
			listaProyectos.add(p);
		}
		disconnect();
		return listaProyectos;
	}
	
	public void delete(String id) throws Exception {
		String query = "DELETE FROM proyecto WHERE id_proyecto = '"+id+"';";
		System.out.println(id);
		CUD(query);
		System.out.println(id);
	}
	
	public void createUpDate(Proyecto proyecto) throws Exception {
		String query="SELECT * FROM proyecto WHERE id_proyecto = '" +proyecto.getId()+"' ;";
		READ(query);
		if(resultado == null) {
		query = "INSERT INTO `proyecto` (`id_proyecto`, `nombre_proyecto`, `horas`) VALUES ('"+proyecto.getId()+"', '"+proyecto.getNombre()+"', '"+proyecto.getHoras()+"');";
		CUD(query);
		}else {
			upDate(proyecto);
		}
	}
	
	public void upDate(Proyecto proyecto) throws Exception {
		String query = "UPDATE `proyecto` SET `nombre_proyecto` = '"+proyecto.getNombre()+"', `horas` = '"+proyecto.getHoras()+"' WHERE (`id_proyecto` = '"+proyecto.getId()+"');";
		CUD(query);
	}
}
