package com.app.task22.Ej3.Views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.app.task22.Ej3.Models.Cientifico;
import com.app.task22.Ej3.Models.CientificoProyecto;
import com.app.task22.Ej3.Models.Proyecto;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame {

	private JPanel contentPane;
	public DefaultTableModel TableCientificos;
	public DefaultTableModel TableProyectos;
	public DefaultTableModel TableCyP;
	//btn principales
	public JButton btnCientificos;
	public JButton btnProyecto;
	public JButton btnCyP;
	//cientificos
	public JTextField addDni;
	public JTextField addNomyApel;
	public JLabel dni;
	public JLabel nombresyapellidos;
	public JButton btnCrearCientifico;
	public JButton btnEliminarCientifico;
	public JLabel textEliminarCientifico;
	public JTable tableCientificos;
	//Proyectos
	public JTable tableProyectos;
	public JButton btnCrearProyecto;
	public JLabel lblNewLabel_1_1;
	public JTextField inputNombreP;
	public JLabel lblNewLabel_1;
	public JTextField inputHorasP;
	public JTextField inputIdPoryect;
	public JLabel txtIdProyecto;
	
	//CyP
	public JTable tableCyP;
	public JTextField inputDniCientifico;
	public JLabel lblDnicientifico;
	public JButton btnAsignarProyecto;
	public JLabel lblNewLabel_2;
	public JButton btnQuitarProyecto;

	
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cientificos y Proyectos");
		lblNewLabel.setBounds(318, 27, 286, 46);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);
		
		btnCientificos = new JButton("Ver Cientificos");
		btnCientificos.setBounds(39, 149, 117, 46);
		contentPane.add(btnCientificos);
		
		btnProyecto = new JButton("Ver Proyectos");
		btnProyecto.setBounds(186, 149, 117, 46);
		contentPane.add(btnProyecto);
				
		addDni = new JTextField();
		addDni.setBounds(39, 298, 181, 46);
		addDni.setColumns(6);
		
		addNomyApel = new JTextField();
		addNomyApel.setColumns(10);
		addNomyApel.setBounds(39, 377, 181, 46);

		
		dni = new JLabel("DNI");
		dni.setFont(new Font("Tahoma", Font.PLAIN, 12));
		dni.setBounds(248, 313, 117, 13);
		
		
		nombresyapellidos = new JLabel("Nombres y Apellidos");
		nombresyapellidos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nombresyapellidos.setBounds(230, 392, 117, 13);
		
		
		btnCrearCientifico = new JButton("Nuevo Cientifico");
		btnCrearCientifico.setBounds(39, 442, 117, 46);

		  
		  btnEliminarCientifico = new JButton("Eliminar Cientifico");
		  btnEliminarCientifico.setBounds(209, 442, 117, 46);
		 
		  
		  textEliminarCientifico = new JLabel("Para Eliminar ingrese solo el dni");
		  textEliminarCientifico.setBounds(105, 498, 208, 40);
		  btnCyP = new JButton("Ver Cientificos/Proyectos");
		  btnCyP.setBounds(76, 216, 201, 46);
		  contentPane.add(btnCyP);
		  
		  tableCientificos= new JTable();
		  tableCientificos.setBounds(476, 165, 1, 1);
		  contentPane.add(tableCientificos);
		  // tablas
			tableCientificos = new JTable();
			tableCientificos.setModel(new DefaultTableModel(
				new Object[][] {
					{"dni", "Nombres y Apellidos"},
				},
				new String[] {
					"dni", "nomyapels"
				}
			));
			tableCientificos.getColumnModel().getColumn(0).setPreferredWidth(123);
			tableCientificos.setBounds(359, 113, 520, 576);
			this.TableCientificos  = (DefaultTableModel) tableCientificos.getModel();
		  
		  
		  tableProyectos = new JTable();
		  tableProyectos.setModel(new DefaultTableModel(
		  	new Object[][] {
		  		{"ID", "Nombre", "Horas"},
		  	},
		  	new String[] {
		  		"id", "nombre", "horas"
		  	}
		  ));
		  tableProyectos.setBounds(359, 113, 520, 576);
		  this.TableProyectos  = (DefaultTableModel) tableProyectos.getModel();
			//tablas
		  
		   btnCrearProyecto = new JButton("Crear Proyecto");
		   btnCrearProyecto.setBounds(76, 439, 201, 46);
		   lblNewLabel_1_1 = new JLabel("Horas");
		   lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   lblNewLabel_1_1.setBounds(217, 378, 100, 13);
		   inputNombreP = new JTextField();
		   inputNombreP.setBounds(27, 291, 165, 46);
		   inputNombreP.setColumns(10);
		   
		   lblNewLabel_1 = new JLabel("Nombre");
		   lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   lblNewLabel_1.setBounds(217, 307, 100, 13);
		   
		   
		   inputHorasP = new JTextField();
		   inputHorasP.setColumns(10);
		   inputHorasP.setBounds(27, 362, 165, 46);
		   inputIdPoryect = new JTextField();
		   inputIdPoryect.setBounds(27, 349, 165, 46);
		   
		   inputIdPoryect.setColumns(10);
		   
		   txtIdProyecto = new JLabel("idProyecto");
		   txtIdProyecto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   txtIdProyecto.setBounds(217, 364, 100, 13);
		   
		   
		   inputDniCientifico = new JTextField();
		   inputDniCientifico.setColumns(10);
		   inputDniCientifico.setBounds(27, 424, 165, 46);
		   
		   
		   lblDnicientifico = new JLabel("dniCientifico");
		   lblDnicientifico.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   lblDnicientifico.setBounds(217, 439, 100, 13);
		   
		   
		   btnAsignarProyecto = new JButton("Asignar Proyecto");
		   btnAsignarProyecto.setBounds(39, 512, 117, 46);
		   
		   
		   lblNewLabel_2 = new JLabel("Asignar/Quitar   Proyecto a un Cientifico");
		   lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   lblNewLabel_2.setForeground(new Color(0, 0, 0));
		   lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		   lblNewLabel_2.setBounds(-7, 291, 310, 24);
		   btnQuitarProyecto = new JButton("Quitar Proyecto");
		   btnQuitarProyecto.setBounds(186, 512, 117, 46);
			
		   //agregamos los items de proyecto
		   //contentPane.add(tableProyectos);
		   contentPane.add(inputNombreP);
		   contentPane.add(inputHorasP);
		   contentPane.add(lblNewLabel_1);
		   contentPane.add(lblNewLabel_1_1);
		   contentPane.add(btnCrearProyecto);

		 //agregamos los items de Cientificos
		   //contentPane.add(tableCientificos);
		   contentPane.add(dni);
		   contentPane.add(nombresyapellidos);
		   contentPane.add(btnCrearCientifico);
		   contentPane.add(addNomyApel);
		   contentPane.add(addDni);
		   contentPane.add(textEliminarCientifico);
		   contentPane.add(btnEliminarCientifico);
		   
		   //agregamos los items de CyP
		   contentPane.add(tableCyP);
		   contentPane.add(txtIdProyecto);
		   contentPane.add(inputDniCientifico);
		   contentPane.add(lblDnicientifico);
		   contentPane.add(btnAsignarProyecto);
		   contentPane.add(lblNewLabel_2);
		   contentPane.add(inputIdPoryect);
		   contentPane.add(btnQuitarProyecto);
		   
		   //hacemos invisible todos los items
		   SetInvisibleCientificos();
		   SetInvisibleProyectos();
		   //SetInvisiblePyC();
	}
	
	public void SetVisiblePyC() {
		   SetInvisibleCientificos();
		   SetInvisibleProyectos();
		   tableCyP.setVisible(true);
		   txtIdProyecto.setVisible(true);
		   inputDniCientifico.setVisible(true);
		   lblDnicientifico.setVisible(true);
		   btnAsignarProyecto.setVisible(true);
		   lblNewLabel_2.setVisible(true);
		   inputIdPoryect.setVisible(true);
		   btnQuitarProyecto.setVisible(true);
	}
	
	public void SetInvisiblePyC() {
		TableCyP.getDataVector().removeAllElements();
		   tableCyP.setVisible(false);
		   txtIdProyecto.setVisible(false);
		   inputDniCientifico.setVisible(false);
		   lblDnicientifico.setVisible(false);
		   btnAsignarProyecto.setVisible(false);
		   lblNewLabel_2.setVisible(false);
		   inputIdPoryect.setVisible(false);
		   btnQuitarProyecto.setVisible(false);
	}
	//cientificos
	public void SetVisibleCientificos() {
		SetInvisiblePyC();
		SetInvisibleProyectos();
			tableCientificos.setVisible(true);
			dni.setVisible(true);
			nombresyapellidos.setVisible(true);
			btnCrearCientifico.setVisible(true);
			addNomyApel.setVisible(true);
			addDni.setVisible(true);
			textEliminarCientifico.setVisible(true);
			btnEliminarCientifico.setVisible(true);
	}
	public void SetInvisibleCientificos() {
		TableCientificos.getDataVector().removeAllElements();
		tableCientificos.setVisible(false);
		dni.setVisible(false);
		nombresyapellidos.setVisible(false);
		btnCrearCientifico.setVisible(false);
		addNomyApel.setVisible(false);
		addDni.setVisible(false);
		textEliminarCientifico.setVisible(false);
		btnEliminarCientifico.setVisible(false);
		
}
	//proyectos
	public void SetVisibleProyectos() {
		   SetInvisiblePyC();
		   SetInvisibleCientificos();
		   tableProyectos.setVisible(true);
		   inputNombreP.setVisible(true);
		   inputHorasP.setVisible(true);
		   lblNewLabel_1.setVisible(true);
		   lblNewLabel_1_1.setVisible(true);
		   btnCrearProyecto.setVisible(true);
	}
	
	public void SetInvisibleProyectos() {
			TableProyectos.getDataVector().removeAllElements();
		   tableProyectos.setVisible(false);
		   inputNombreP.setVisible(false);
		   inputHorasP.setVisible(false);
		   lblNewLabel_1.setVisible(false);
		   lblNewLabel_1_1.setVisible(false);
		   btnCrearProyecto.setVisible(false);
	}
	
	public void showCientifios(ArrayList<Cientifico> listCientificos) {
		String[] base = new String[] {"Dni","Nombre y Apellido"};
		this.TableCientificos.addRow(base);
		for (Cientifico cientifico : listCientificos) {
			String[] aux = new String[] {cientifico.getDni(),cientifico.getNomApels()};
			this.TableCientificos.addRow(aux);
		}
	}
	
	public void showProyectos(ArrayList<Proyecto> listProyectos) {
		String[] base = new String[] {"Id","Nombre","Horas"};
		this.TableProyectos.addRow(base);
		for (Proyecto proyecto : listProyectos) {
			String[] aux = new String[] {String.valueOf(proyecto.getId()),proyecto.getNombre(),
					String.valueOf(proyecto.getHoras())};
			this.TableProyectos.addRow(aux);
		}
		
	}
	
	public void showCyP(ArrayList<CientificoProyecto> listCientificosProyectos) {
		String[] base = new String[] {"dni", "idProyecto", "nomProyecto", "nomCientifico", "Horas"};
		this.TableCyP.addRow(base);
		for (CientificoProyecto cp : listCientificosProyectos) {
			String[] aux = new String[] {
					cp.getCientifico().getDni(),cp.getProyecto().getId(),
					cp.getProyecto().getNombre(),cp.getCientifico().getNomApels(),
					String.valueOf(cp.getProyecto().getHoras())};
			this.TableCyP.addRow(aux);
		}
	}
	
}
