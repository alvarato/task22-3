package com.app.task22.Ej3.Models;

import com.app.task22.Ej3.DAO.DAOCientifico;

public class Cientifico extends DAOCientifico {
	private String dni;
	private String nomApels;

	public Cientifico() {
	}

	public Cientifico(String dni, String nomApels) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@Override
	public String toString() {
		return "Cientificos dni: " + dni + ", nomApels:" + nomApels + "";
	}

}
