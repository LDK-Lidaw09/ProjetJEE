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
public class Produit {
    private int codeProd;
    private String nomProd;
     private String categorieProd;
    private int qteProd;
    private int prixUnitaire;
    private String dateFab;
    private String dateExp;

    public Produit() {
    }

    
    public Produit(int codeProd, String nomProd, String categorieProd, int qteProd, int prixUnitaire, String dateFab, String dateExp) {
        this.codeProd = codeProd;
        this.nomProd = nomProd;
        this.categorieProd = categorieProd;
        this.qteProd = qteProd;
        this.prixUnitaire = prixUnitaire;
        this.dateFab = dateFab;
        this.dateExp = dateExp;
    }

    public Produit(String nomProd, String categorieProd, int qteProd, int prixUnitaire, String dateFab, String dateExp) {
        this.nomProd = nomProd;
        this.categorieProd = categorieProd;
        this.qteProd = qteProd;
        this.prixUnitaire = prixUnitaire;
        this.dateFab = dateFab;
        this.dateExp = dateExp;
    }
    

    public int getCodeProd() {
        return codeProd;
    }

    public void setCodeProd(int codeProd) {
        this.codeProd = codeProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getCategorieProd() {
        return categorieProd;
    }

    public void setCategorieProd(String categorieProd) {
        this.categorieProd = categorieProd;
    }

    public int getQteProd() {
        return qteProd;
    }

    public void setQteProd(int qteProd) {
        this.qteProd = qteProd;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public String getDateFab() {
        return dateFab;
    }

    public void setDateFab(String dateFab) {
        this.dateFab = dateFab;
    }

    public String getDateExp() {
        return dateExp;
    }

    public void setDateExp(String dateExp) {
        this.dateExp = dateExp;
    }
    
    
}
