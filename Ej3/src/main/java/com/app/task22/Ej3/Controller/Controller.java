package com.app.task22.Ej3.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import com.app.task22.Ej3.Models.Cientifico;
import com.app.task22.Ej3.Models.CientificoProyecto;
import com.app.task22.Ej3.Models.Proyecto;
import com.app.task22.Ej3.Views.Vista;

public class Controller implements ActionListener {

	private Cientifico cientifico;
	private Proyecto proyecto;
	private CientificoProyecto cp;
	private Vista vista;

	public Controller() {
		cleanAll();
	}
	
	public void IniciarVista() {
		vista.setVisible(true);
		this.vista.btnCientificos.addActionListener(this);
		this.vista.btnProyecto.addActionListener(this);
		this.vista.btnCyP.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(vista.btnCientificos == e.getSource()) {
			isBtnCientificos();
		}else if(vista.btnProyecto == e.getSource()) {
			isBtnProyectos();
		}else if(vista.btnCyP == e.getSource()) {
			isBtnCyP();
		}
		
	}
	
	private void isBtnCyP() {
		vista.SetVisibleCientificos();
		try {vista.showCyP(cp.showAll());
		} catch (SQLException e1) {
			e1.printStackTrace();	
}
		
	}

	public void cleanAll() {
		this.cientifico = new Cientifico();
		this.proyecto = new Proyecto();
		this.vista  = new Vista();
		this.cp = new CientificoProyecto();
	}
	
	
	public void isBtnCientificos() {
		vista.SetVisibleCientificos();
		try {vista.showCientifios(cientifico.showAll());
		} catch (SQLException e1) {
			e1.printStackTrace();	
}
	}

	public void isBtnProyectos() {
		vista.SetVisibleProyectos();
		try {vista.showProyectos(proyecto.showAll());
		} catch (SQLException e1) {
			e1.printStackTrace();	
}
	}






}
