package com.app.task22.Ej3.Models;

import com.app.task22.Ej3.DAO.DAOCientificoProyecto;

public class CientificoProyecto extends DAOCientificoProyecto {

	private Cientifico cientifico;
	private Proyecto proyecto;

	public CientificoProyecto() {
	}

	public CientificoProyecto(Cientifico cientifico, Proyecto proyecto) {
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	public Cientifico getCientifico() {
		return this.cientifico;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

}
