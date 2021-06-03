/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modeles.Client;

/**
 *
 * @author ADMIN
 */
public class ClientDao {
    public static int save(Client entity){ 
        
 int status=0; 
		try {
			Connection con = DBManager.getConnection();
			String query = "INSERT INTO client (idClient,nomClient,typeClient,adresseClient,specialiteClient,login,password,profil)"
					+ " VALUES (null,?,?,?,?,?,?,?)";
                        PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, entity.getNomClient());
			ps.setString(2, entity.getTypeClient());
			ps.setString(3, entity.getAdresseClient());
			ps.setString(4, entity.getSpecialiteClient());
                        ps.setString(5, entity.getLogin());
			ps.setString(6, entity.getPassword());
			ps.setString(7, entity.getProfil());
			status = ps.executeUpdate(); 
                      
                con.close(); 
                    }catch(Exception ex){ex.printStackTrace();} 
                    return status; 
    }
    public static Client read(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM client WHERE idClient=?";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.first()) {
				
				String nom = rs.getString("nomClient");
				String type = rs.getString("typeClient");
				String adresse = rs.getString("adresseClient");
                                String specialite = rs.getString("specialiteClient");
                                String login = rs.getString("login");
				String password = rs.getString("password");
                                String profil = rs.getString("profil");
				
                                Client client = new Client(nom,type,adresse,specialite,login,password,profil); 
				return client ;
			}						

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
		
		return null;
		
	}

	
	public List<Client> list() throws DAOException {
		List<Client> clients = new ArrayList<>();

		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM client";
			PreparedStatement ps = connection.prepareStatement(query);			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("idClient");
				String nom = rs.getString("nomClient");
				String type = rs.getString("typeClient");
				String adresse = rs.getString("adresseClient");
                                String specialite = rs.getString("specialiteClient");
                                String login = rs.getString("login");
				String password = rs.getString("password");
                                String profil = rs.getString("profil");
				
                                Client client = new Client(id,nom,type,adresse,specialite,login,password,profil); 				
				clients.add(client);
			}

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}

		return clients;
	}
	

	
	public static int update(Client entity){
               int status=0;
		try (Connection connection = DBManager.getConnection()) {
			String query = "UPDATE client SET nomClient=?, typeClient=?,adresseClient=?, specialiteClient=?,"
					+ "login=?, password=?, profil=? WHERE idClient=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, entity.getNomClient());
			ps.setString(2, entity.getTypeClient());
			ps.setString(3, entity.getAdresseClient());
			ps.setString(4, entity.getSpecialiteClient());
                        ps.setString(5, entity.getLogin());
			ps.setString(6, entity.getPassword());
			ps.setString(7, entity.getProfil());
                        ps.setInt(8, entity.getIdClient());
			ps.executeUpdate();
                        connection.close();

		} catch(Exception e){e.printStackTrace();}
		
		
                return status;
		
	}

	
	public static void  delete(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "DELETE FROM client WHERE idClient=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}		
		
	}

}		
		
		
	
    

