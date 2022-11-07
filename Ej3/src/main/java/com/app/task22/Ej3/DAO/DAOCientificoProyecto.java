package com.app.task22.Ej3.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

import com.app.task22.Ej3.Models.Cientifico;
import com.app.task22.Ej3.Models.CientificoProyecto;
import com.app.task22.Ej3.Models.Proyecto;

public class DAOCientificoProyecto extends DAO{

	
	public ArrayList<CientificoProyecto> showAll() throws SQLException{
		String query = "SELECT p.id_proyecto, p.nombre_proyecto, p.horas,c.dni,c.nom_apels FROM cientificos c LEFT JOIN asignado_a  ON asignado_a.cientifico = c.dni LEFT JOIN proyecto p ON asignado_a.proyecto = p.id_proyecto;";
		ArrayList<CientificoProyecto> listaCP = new ArrayList<>();
		READ(query);
		while (resultado.next()) {
			String id = resultado.getString(1);
			String nombre = resultado.getString(2);
			int horas = resultado.getInt(3);
			String dni = resultado.getString(4);
			String nomApel = resultado.getString(5);
			Cientifico cf = new Cientifico(dni, nombre);
			Proyecto p = new Proyecto(id,nombre,horas);
			listaCP.add(new CientificoProyecto(cf,p));
		}
		disconnect();
		return listaCP;
	}
	
	public void asignar(String dni, String id) throws Exception {
		String query = "INSERT INTO `asignado_a` (`cientifico`, `proyecto`) VALUES ('"+dni+"', '"+id+"');";
		CUD(query);
	}
	
	public void delete(String dni, String id) throws Exception {
		String query = "DELETE FROM asignado_a WHERE cientifico = '"+dni+"' AND proyecto = '"+id+"';";
		CUD(query);
	}
}
