package com.app.task22.Ej3.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	private final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String USER = "root";
	private final String PASSWORD = "0218";
	private final String bd = "tarea22_3;";

	protected Connection conexion = null;
	protected Statement statement = null;
	protected ResultSet resultado = null;

	public void connect() {
		try {
			Class.forName(DRIVER);
			String URL = "jdbc:mysql://localhost:3306?useTimezone=true&serverTimezone=UTC";
			conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("conexion ok");
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
		} catch (SQLException e) {
			System.out.println("error a la conexion");
			e.printStackTrace();
		}

	}

	public void disconnect() {
		if (resultado != null) {
			resultado = null;
		}

		if (statement != null) {
			statement = null;
		}

		try {
			conexion.close();
		} catch (Exception e) {
			System.out.println(" error al desconectar");
			e.printStackTrace();
		}
		System.out.println("desconexion exitosa");
	}

	public void CUD(String sql) throws Exception {
		try {
			connect();
			statement = conexion.createStatement();
			statement.executeUpdate("use " + bd);
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("error a la conexion");
			e.printStackTrace();
		}
		disconnect();

	}

	public void READ(String sql) {

		try {
			connect();
			statement = conexion.createStatement();
			statement.executeUpdate("use " + bd);
			resultado = statement.executeQuery(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}