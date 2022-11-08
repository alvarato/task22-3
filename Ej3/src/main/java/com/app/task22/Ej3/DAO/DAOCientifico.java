package com.app.task22.Ej3.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import com.app.task22.Ej3.Models.Cientifico;

public class DAOCientifico extends DAO{

	public ArrayList<Cientifico> showAll() throws SQLException{
		String query = "SELECT * FROM cientificos";
		ArrayList<Cientifico> listaCientificos = new ArrayList<>();
		READ(query);
		while (resultado.next()) {
			String dni = resultado.getString(1);
			String nombre = resultado.getString(2);
			Cientifico cf = new Cientifico(dni, nombre);
			listaCientificos.add(cf);
		}
		disconnect();
		return listaCientificos;
	}
	
	public void delete(String dni) throws Exception {
		String query = "DELETE FROM cientificos WHERE dni = '" + dni + "' ;";
		CUD(query);
	}
	
	public void createUpDate(Cientifico cientifico) throws Exception {
		String query = "SELECT * FROM cientificos WHERE dni = '" + cientifico.getDni() + "' ;";
		READ(query);
		if(!resultado.next()){
			 query = "INSERT INTO `cientificos` (`dni`, `nom_apels`)"
						+ " VALUES ('"+cientifico.getDni()+"', '"+cientifico.getNomApels()+"');";
		}else {
			query = "UPDATE `cientificos` SET `nom_apels` = '"+cientifico.getNomApels()+"' WHERE (`dni` = '"+cientifico.getDni()+"');";
		}
	
		CUD(query);
	}

}
