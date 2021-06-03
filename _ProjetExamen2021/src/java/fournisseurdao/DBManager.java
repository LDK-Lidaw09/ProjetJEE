/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fournisseurdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ADMIN
 */
public class DBManager {
	private static Connection connection = null;
	private DBManager () {}
	
	public static Connection getConnection () throws Exception {
		try {
			// Chargement du driver jdbc mysql
			Class.forName ("com.mysql.jdbc.Driver");

			// Ouverture de la connexion
			connection = DriverManager.getConnection ("jdbc:mysql://localhost:3306/db_projet?serverTimezone=UTC", "root", "");

			return connection;
		} catch (ClassNotFoundException e) {
			throw new Exception ("ClassNotFoundException:'" + e.getMessage () + "' ");
		} catch (SQLException e) {
			throw new Exception ("SQLException:Connection failed:" + e.getMessage());
		}
	}
}
