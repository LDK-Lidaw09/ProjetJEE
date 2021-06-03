/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fournisseurdao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modeles.Fournisseur;

/**
 *
 * @author ADMIN
 */
public class FournisseurDao {
     public static int save(Fournisseur entity){ 
        
 int status=0; 
		try {
			Connection con = clientdao.DBManager.getConnection();
			String query = "INSERT INTO fournisseur(codeFour,nomFour,adresseFour,nationaliteFour,login,password,profil)"
					+ " VALUES (null,?,?,?,?,?,?)";
                        PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1, entity.getNomFour());
			ps.setString(2, entity.getAdresseFour());
			ps.setString(3, entity.getNationaliteFour());
                        ps.setString(4, entity.getLogin());
			ps.setString(5, entity.getPassword());
			ps.setString(6, entity.getProfil());
			status = ps.executeUpdate(); 
                      
                con.close(); 
                    }catch(Exception ex){ex.printStackTrace();} 
                    return status; 
    }
     public Fournisseur read(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM fournisseur  WHERE codeFour=?";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.first()) {
				
				String nom = rs.getString("nomFour");
				String adresse = rs.getString("adresseFour");
				String nationalite = rs.getString("nationaliteFour");
                                String login = rs.getString("login");
				String password = rs.getString("password");
                                String profil = rs.getString("profil");
				
                                Fournisseur four = new Fournisseur(id,nom, adresse, nationalite, login, password, profil); 
				return four ;
			}						

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
		
		return null;
		
	}

	
	public List<Fournisseur> list() throws DAOException {
		List<Fournisseur> fours = new ArrayList<>();

		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM fournisseur";
			PreparedStatement ps = connection.prepareStatement(query);			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("codeFour");
				String nom = rs.getString("nomFour");
				String adresse = rs.getString("adresseFour");
				String nationalite = rs.getString("nationaliteFour");
                                String login = rs.getString("login");
				String password = rs.getString("password");
                                String profil = rs.getString("profil");
				
                                Fournisseur four = new Fournisseur(id,nom, adresse, nationalite, login, password, profil); 				
				fours.add(four);
			}

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}

		return fours;
	}
	

	
	public void update(Fournisseur entity) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "UPDATE fournisseur SET nomFour=?, adresseFour=?,nationaliteFour=?,"
					+ "login=?, password=?, profil=? WHERE codeFour=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, entity.getNomFour());
			ps.setString(2, entity.getAdresseFour());
			ps.setString(3, entity.getNationaliteFour());
                        ps.setString(4, entity.getLogin());
			ps.setString(5, entity.getPassword());
			ps.setString(6, entity.getProfil());
			ps.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}		
		
	}

	
	public static void delete(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "DELETE FROM fournisseur WHERE codeFour=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}		
		
	}
}
