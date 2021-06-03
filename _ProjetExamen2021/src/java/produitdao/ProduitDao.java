/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produitdao;

import clientdao.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import modeles.Produit;
import modeles.Livraison;

/**
 *
 * @author ADMIN
 */
public class ProduitDao {
    public static int save(Produit entity){ 
        
 int status=0; 
		try {
			Connection con = DBManager.getConnection();
			String query = "INSERT INTO produit (codeProd,nomProd,categorieProd,qteProd,prixUnitaire,dateFab,dateExp)"
					+ " VALUES (null,?,?,?,?,?,?)";
                        PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, entity.getNomProd());
			ps.setString(2, entity.getCategorieProd());
			ps.setInt(3, entity.getQteProd());
			ps.setInt(4, entity.getPrixUnitaire());
                        ps.setString(5, entity.getDateFab());
			ps.setString(6, entity.getDateExp());
			
			status = ps.executeUpdate(); 
                      
                con.close(); 
                    }catch(Exception ex){ex.printStackTrace();} 
                    return status; 
    }
    public static Produit read(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM produit WHERE codeProd=?";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			if (rs.first()) {
				
				String nom = rs.getString("nomProd");
				String categorie = rs.getString("categorieProd");
				int quantite = rs.getInt("qteProd");
                                int prix = rs.getInt("prixUnitaire");
                                String dateFab = rs.getString("dateFab");
				String dateExp = rs.getString("dateExp");
                               
				
                                Produit produit = new Produit(nom,categorie,quantite,prix,dateFab,dateExp); 
				return produit ;
			}						

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
		
		return null;
		
	}
    public static Produit livraison(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM listecommande WHERE codeProd=?";
			PreparedStatement ps = connection.prepareStatement(query);

			ps.setInt(1, id); 
			ResultSet rs = ps.executeQuery();

			if (rs.first()) {
				
				String nom = rs.getString("nomProd");
				String categorie = rs.getString("categorieProd");
				int quantite = rs.getInt("qteProd");
                                int prix = rs.getInt("prixUnitaire");
                                String dateFab = rs.getString("dateFab");
				String dateExp = rs.getString("dateExp");
                               
				
                                Produit produit = new Produit(nom,categorie,quantite,prix,dateFab,dateExp); 
				return produit ;
			}						

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}
		
		return null;
		
	}

	
	public List<Produit> list() throws DAOException {
		List<Produit> produits = new ArrayList<>();

		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM produit";
			PreparedStatement ps = connection.prepareStatement(query);			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("codeProd");
				String nom = rs.getString("nomProd");
				String categorie = rs.getString("categorieProd");
				int quantite = rs.getInt("qteProd");
                                int prix = rs.getInt("prixUnitaire");
                                String dateFab = rs.getString("dateFab");
				String dateExp = rs.getString("dateExp");
				
                                Produit produit = new Produit(id,nom,categorie,quantite,prix,dateFab,dateExp); 				
				produits.add(produit);
			}

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}

		return produits;
	}
        
        public List<Produit> listCmd() throws DAOException {
		List<Produit> produits = new ArrayList<>();

		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM listeCommande";
			PreparedStatement ps = connection.prepareStatement(query);			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("codeProd");
				String nom = rs.getString("nomProd");
				String categorie = rs.getString("categorieProd");
				int quantite = rs.getInt("qteProd");
                                int prix = rs.getInt("prixUnitaire");
                                String dateFab = rs.getString("dateFab");
				String dateExp = rs.getString("dateExp");
				
                                Produit produit = new Produit(id,nom,categorie,quantite,prix,dateFab,dateExp); 				
				produits.add(produit);
			}

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}

		return produits;
	}
	

	
	public static int update(Produit entity) throws DAOException {
            int status=0; 
		try (Connection connection = DBManager.getConnection()) {
			String query = "UPDATE produit set nomProd=?, categorieProd=?,qteProd=?,prixUnitaire=?,dateFab=?,"
					+ "dateExp=? WHERE codeProd=?";

			 PreparedStatement ps = connection.prepareStatement(query);
			ps.setString(1, entity.getNomProd());
			ps.setString(2, entity.getCategorieProd());
			ps.setInt(3, entity.getQteProd());
			ps.setInt(4, entity.getPrixUnitaire());
                        ps.setString(5, entity.getDateFab());
			ps.setString(6, entity.getDateExp());
                        ps.setInt(7, entity.getCodeProd());
			ps.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}		
		return status;
	}
public static int command(Produit p){
        int status=0;
       
        try{
            Connection con=DBManager.getConnection();
            PreparedStatement ps=con.prepareStatement( "insert into listeCommande(codeProd,nomProd,categorieProd,qteProd,prixUnitaire,dateFab,dateExp) values(null,?,?,?,?,?,?)");
                 
                    ps.setString(1,p.getNomProd());
                    ps.setString(2,p.getCategorieProd());
                    ps.setInt(3,p.getQteProd());
                    ps.setInt(4,p.getPrixUnitaire());
                    ps.setString(5,p.getDateFab());
                    ps.setString(6,p.getDateExp());
                    status=ps.executeUpdate();
                    con.close();
        }catch(Exception ex){ex.printStackTrace();}
        return status;
    }
	
	public static void  delete(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "DELETE FROM produit WHERE codeProd=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}		
		
	}
}
