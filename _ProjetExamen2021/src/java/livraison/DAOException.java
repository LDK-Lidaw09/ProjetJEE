/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraison;

import produitdao.*;

/**
 *
 * @author ADMIN
 */
public class DAOException extends Exception {
    private static final long serialVersionUID = 1L;

	public DAOException(String message) {
		super(message);
	}
}
