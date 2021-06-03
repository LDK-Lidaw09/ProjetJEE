/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraison;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modeles.Livraison;


/**
 *
 * @author ADMIN
 */
public class livraisondao {
     public static int save(Livraison p){ 
        
 int status=0; 
		try {
			Connection con = livraison.DBManager.getConnection();
			String query = "insert into livraison(codeLivraison,dateLivraison)"+ "values(null,?)";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, p.getDateLivraison());
			status = ps.executeUpdate();              
                con.close(); 
                    }catch(Exception ex){ex.printStackTrace();} 
                    return status; 
    }
     
      public List<Livraison> listliv() throws DAOException {
		List<Livraison> livraisons = new ArrayList<>();

		try (Connection connection = DBManager.getConnection()) {
			String query = "SELECT * FROM livraison";
			PreparedStatement ps = connection.prepareStatement(query);			
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("codeLivraison");
				String dateLivraison = rs.getString("dateLivraison");
				
                                Livraison livraison = new Livraison(id,dateLivraison); 				
				livraisons.add(livraison);
			}

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}

		return livraisons;
	}
	

    public static void  delete(int id) throws DAOException {
		try (Connection connection = DBManager.getConnection()) {
			String query = "DELETE FROM livraison WHERE codeLivraison=?";

			PreparedStatement ps = connection.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();

		} catch (Exception e) {
			throw new DAOException(e.getMessage());
		}		
		
	}
    
}
