package com.app.task22.Ej3.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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
		this.vista.btnCrearCientifico.addActionListener(this);
		this.vista.btnEliminarCientifico.addActionListener(this);
		this.vista.btnCrearProyecto.addActionListener(this);
		this.vista.btnBorrarProyecto.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(vista.btnCientificos == e.getSource()) isBtnCientificos();
		else if(vista.btnProyecto == e.getSource()) isBtnProyectos();
		else if(vista.btnCyP == e.getSource()) isBtnCyP();
		else if(vista.btnCrearCientifico == e.getSource()) isCreateCientifico();
		else if(vista.btnEliminarCientifico == e.getSource()) isDeleteCientifico();
		else if(vista.btnCrearProyecto == e.getSource()) isCreateProyecto();
		else if(vista.btnBorrarProyecto == e.getSource()) isDeleteProyecto();
		
	}
	
	private void isDeleteProyecto() {
		String id = vista.inputIdProyecto.getText();
		vista.inputIdProyecto.setText("");
		if(id.equals("") || id.length() > 4){
			showMenssage("Faltan Datos o Datos Erroneos(di max caracteres 4)");
		}else {
			try {proyecto.delete(id);
			} catch (Exception e) {e.printStackTrace();}
			proyecto = new Proyecto();
			isBtnProyectos();
		}
	}

	private void isCreateProyecto() {
		String id = vista.inputIdProyecto.getText();
		vista.inputIdProyecto.setText("");
		showMenssage(id);
		String nom = vista.inputNombreP.getText();
		vista.inputNombreP.setText("");
		int time = 0;
		try {time = Integer.parseInt(vista.inputHorasP.getText());
		vista.inputHorasP.setText("");
		} catch (Exception e) {}
		if(id.equals("") || nom.equals("") || id.length() > 4 || time < 1){
			showMenssage("Faltan Datos o Datos Erroneos(id max caracteres 4)");
		}else {
			proyecto = new Proyecto(id,nom,time);
			try {proyecto.createUpDate(proyecto);
			} catch (Exception e) {e.printStackTrace();}
			proyecto = new Proyecto();
			isBtnProyectos();
		}
		
	}

	private void isCreateCientifico() {
		String dni = vista.addDni.getText();
		String nom = vista.addNomyApel.getText();
		if(nom.equals("") || dni.equals("") || dni.length() > 8){
			showMenssage("Faltan Datos o Datos Erroneos(Dni max caracteres 8)");
		}else {
			cientifico = new Cientifico(dni,nom);
			vista.addDni.setText("");
			vista.addNomyApel.setText("");
			try {cientifico.createUpDate(cientifico);
			} catch (Exception e) {e.printStackTrace();}
			cientifico = new Cientifico();
			isBtnCientificos();
		}
	}
	
	public void isDeleteCientifico() {
		String dni = vista.addDni.getText();
		if(dni.equals("") || dni.length() > 8){
			showMenssage("Faltan Datos o Datos Erroneos(Dni max caracteres 8)");
		}else {
			vista.addDni.setText("");
			vista.addNomyApel.setText("");
			try {cientifico.delete(dni);
			} catch (Exception e) {e.printStackTrace();}
			cientifico = new Cientifico();
			isBtnCientificos();
		}
	}

	private void isBtnCyP() {
		vista.SetVisibleCyP();
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

	public void showMenssage(String data) {
		JOptionPane.showMessageDialog(null, data);
	}




}
