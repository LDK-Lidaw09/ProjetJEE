/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeles;

/**
 *
 * @author PC
 */
public class Livraison {

   
    private int codeLivraison;
    private String dateLivraison;

    public Livraison(int codeLivraison, String dateLivraison) {
        this.codeLivraison = codeLivraison;
        this.dateLivraison = dateLivraison;
    }

    public Livraison() {
    }
    

    public int getCodeLivraison() {
        return codeLivraison;
    }

    public void setCodeLivraison(int codeLivraison) {
        this.codeLivraison = codeLivraison;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }
    
    
}
