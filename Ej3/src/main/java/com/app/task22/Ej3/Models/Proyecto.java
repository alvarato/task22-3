package com.app.task22.Ej3.Models;

import com.app.task22.Ej3.DAO.DAOProyecto;

public class Proyecto extends DAOProyecto {
	private String id;
	private String nombre;
	private int horas;

	public Proyecto() {
	}

	public Proyecto(String nombre, int horas) {
		this.nombre = nombre;
		this.horas = horas;
	}

	public Proyecto(String id, String nombre, int horas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public String toString() {
		return "Proyecto id: " + id + ", nombre: " + nombre + ", horas: " + horas + "";
	}

}
