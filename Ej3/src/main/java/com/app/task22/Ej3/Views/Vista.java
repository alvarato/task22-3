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

	private JPanel content;
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
	public JTextField inputIdProyecto;
	public JLabel txtIdProyecto;
	public JLabel lblNewLabel_3;
	public JButton btnBorrarProyecto;
	
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
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(content);
		content.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cientificos y Proyectos");
		lblNewLabel.setBounds(318, 27, 286, 46);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		content.add(lblNewLabel);
		
		lblNewLabel_3 = new JLabel("Id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(217, 303, 86, 20);
		
		btnCientificos = new JButton("Ver Cientificos");
		btnCientificos.setBounds(39, 149, 117, 46);
		content.add(btnCientificos);
		
		btnProyecto = new JButton("Ver Proyectos");
		btnProyecto.setBounds(186, 149, 117, 46);
		content.add(btnProyecto);
				
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
		
		
		btnCrearCientifico = new JButton("Nuevo/Actualizar Cientifico");
		btnCrearCientifico.setBounds(39, 442, 181, 46);

		  
		  btnEliminarCientifico = new JButton("Eliminar Cientifico");
		  btnEliminarCientifico.setBounds(39, 502, 181, 46);
		 
		  
		  textEliminarCientifico = new JLabel("Para Eliminar ingrese solo el dni");
		  textEliminarCientifico.setBounds(60, 558, 208, 40);
		  btnCyP = new JButton("Ver Cientificos/Proyectos");
		  btnCyP.setBounds(76, 216, 201, 46);
		  content.add(btnCyP);
		  
		  tableCientificos= new JTable();
		  tableCientificos.setBounds(476, 165, 1, 1);
		  content.add(tableCientificos);
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
			tableCientificos.setBounds(359, 113, 520, 576);
			this.TableCientificos  = (DefaultTableModel) tableCientificos.getModel();
		  
		  
		  tableProyectos = new JTable();
		  tableProyectos.setModel(new DefaultTableModel(
				  	new Object[][] {
				  		{"ID", "Nombre", "Horas"},
				  	},
				  	new String[] {
				  		"", "", ""
				  	}
				  ));
		  tableProyectos.setBounds(359, 113, 520, 576);
		  this.TableProyectos  = (DefaultTableModel) tableProyectos.getModel();
		  
		  
		  tableCyP = new JTable();
		  tableCyP.setModel(new DefaultTableModel(
		  	new Object[][] {
		  		{"ID", "Nombre", "Horas","NombreP","dni"},
		  	},
		  	new String[] {"ID", "Nombre", "Horas","NombreP","dni"}
		  ));
		  tableCyP.setBounds(359, 113, 520, 576);
		  this.TableCyP  = (DefaultTableModel) tableCyP.getModel();
			//tablas
		  
		   btnCrearProyecto = new JButton("Crear/Editar Proyecto");
		   btnCrearProyecto.setBounds(27, 477, 201, 46);
		   lblNewLabel_1_1 = new JLabel("Horas");
		   lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   lblNewLabel_1_1.setBounds(217, 415, 100, 13);
		   inputNombreP = new JTextField();
		   inputNombreP.setBounds(27, 344, 165, 46);
		   inputNombreP.setColumns(10);
		   
		   lblNewLabel_1 = new JLabel("Nombre");
		   lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		   lblNewLabel_1.setBounds(217, 359, 100, 13);
		   
		   
		   inputHorasP = new JTextField();
		   inputHorasP.setColumns(10);
		   inputHorasP.setBounds(27, 400, 165, 46);
		   
		   inputIdProyecto = new JTextField();
		   inputIdProyecto.setBounds(27, 288, 165, 46);
		   inputIdProyecto.setColumns(10);
		   
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
		 
			
		   btnBorrarProyecto = new JButton("Borrar Proyecto(id)");
		   btnBorrarProyecto.setBounds(27, 552, 206, 49);
		   
		   /**/
		   //agregamos los items de proyecto
		   
		   content.add(inputNombreP);
		   content.add(inputHorasP);
		   content.add(lblNewLabel_1);
		   content.add(lblNewLabel_1_1);
		   content.add(btnCrearProyecto);
		   content.add(tableProyectos);
		   content.add(inputIdProyecto);
		   content.add(lblNewLabel_3);
		   content.add(btnBorrarProyecto);
		   
		   /**/
		 //agregamos los items de Cientificos
		   content.add(dni);
		   content.add(nombresyapellidos);
		   content.add(btnCrearCientifico);
		   content.add(addNomyApel);
		   content.add(addDni);
		   content.add(textEliminarCientifico);
		   content.add(btnEliminarCientifico);
		   content.add(tableCientificos);
		   
		  /**/
		   //agregamos los items de CyP
		   content.add(tableCyP);
		   content.add(txtIdProyecto);
		   content.add(inputDniCientifico);
		   content.add(lblDnicientifico);
		   content.add(btnAsignarProyecto);
		   content.add(lblNewLabel_2);
		  
		   
		   //hacemos invisible todos los items
		   SetInvisibleCientificos();
		   SetInvisibleProyectos();
		   SetInvisibleCyP();
	}
	
	public void SetVisibleCyP() {
		setInvisibleAll();
		cleanTables();
		   tableCyP.setVisible(true);
		   txtIdProyecto.setVisible(true);
		   inputDniCientifico.setVisible(true);
		   lblDnicientifico.setVisible(true);
		   btnAsignarProyecto.setVisible(true);
		   lblNewLabel_2.setVisible(true);
		   inputIdProyecto.setVisible(true);
		   btnQuitarProyecto.setVisible(true);
		   
	}
	
	public void SetInvisibleCyP() {
		tableCyP.setVisible(false);
		txtIdProyecto.setVisible(false);
		inputDniCientifico.setVisible(false);
		lblDnicientifico.setVisible(false);
		btnAsignarProyecto.setVisible(false);
		lblNewLabel_2.setVisible(false);
		inputIdProyecto.setVisible(false);
		btnQuitarProyecto.setVisible(false);
		
	}
	//cientificos
	public void SetVisibleCientificos() {
		setInvisibleAll();
		cleanTables();
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
		setInvisibleAll();
		cleanTables();
		   tableProyectos.setVisible(true);
		   inputNombreP.setVisible(true);
		   inputHorasP.setVisible(true);
		   lblNewLabel_1.setVisible(true);
		   lblNewLabel_1_1.setVisible(true);
		   btnCrearProyecto.setVisible(true);
		   inputIdProyecto.setVisible(true);
		   lblNewLabel_3.setVisible(true);
		   btnBorrarProyecto.setVisible(true);
	}
	
	public void SetInvisibleProyectos() {
		   tableProyectos.setVisible(false);
		   inputNombreP.setVisible(false);
		   inputHorasP.setVisible(false);
		   lblNewLabel_1.setVisible(false);
		   lblNewLabel_1_1.setVisible(false);
		   btnCrearProyecto.setVisible(false);
		   inputIdProyecto.setVisible(false);
		   lblNewLabel_3.setVisible(false);
		   btnBorrarProyecto.setVisible(false);
	}
	
	public void setInvisibleAll() {
		   SetInvisibleCyP();
		   SetInvisibleCientificos();
		   SetInvisibleProyectos();
	}

	public void cleanTables() {
			TableProyectos.getDataVector().removeAllElements();
			TableCientificos.getDataVector().removeAllElements();
			TableCyP.getDataVector().removeAllElements();
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
		 base = new String[] {"1","pepe","102"};
		 this.TableProyectos.addRow(base);
		for (Proyecto proyecto : listProyectos) {
			String[] aux = new String[] {String.valueOf(proyecto.getId()),proyecto.getNombre(),
					String.valueOf(proyecto.getHoras())};
			this.TableProyectos.addRow(aux);
		}
		
	}
	
	public void showCyP(ArrayList<CientificoProyecto> listCientificosProyectos) {
		String[] base = new String[] {"dni", "idProyecto", "nom Proyecto", "nom Cientifico", "Horas"};
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
