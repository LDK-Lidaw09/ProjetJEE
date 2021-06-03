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
public class DetailLivraison {
    private int idDetailLiv,qteLiv;

    public DetailLivraison(int idDetailLiv, int qteLiv) {
        this.idDetailLiv = idDetailLiv;
        this.qteLiv = qteLiv;
    }

    public int getIdDetailLiv() {
        return idDetailLiv;
    }

    public void setIdDetailLiv(int idDetailLiv) {
        this.idDetailLiv = idDetailLiv;
    }

    public int getQteLiv() {
        return qteLiv;
    }

    public void setQteLiv(int qteLiv) {
        this.qteLiv = qteLiv;
    }
    
}
