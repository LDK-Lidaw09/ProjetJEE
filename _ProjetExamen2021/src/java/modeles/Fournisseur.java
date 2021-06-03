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
public class Fournisseur extends Utilisateur{
    private int codeFour;
    private String nomFour,adresseFour,nationaliteFour;

    public Fournisseur(String login,String password,String profil,int codeFour, String nomFour, String adresseFour, String nationaliteFour) {
       super(login,password,profil);
        this.codeFour = codeFour;
        this.nomFour = nomFour;
        this.adresseFour = adresseFour;
        this.nationaliteFour = nationaliteFour;
    }

    public Fournisseur(String nomFour, String adresseFour, String nationaliteFour, String login, String password, String profil) {
        super(login, password, profil);
        this.nomFour = nomFour;
        this.adresseFour = adresseFour;
        this.nationaliteFour = nationaliteFour;
    }

    public Fournisseur(int codeFour, String nomFour, String adresseFour, String nationaliteFour, String login, String password, String profil) {
        super(login, password, profil);
        this.codeFour = codeFour;
        this.nomFour = nomFour;
        this.adresseFour = adresseFour;
        this.nationaliteFour = nationaliteFour;
    }
    

    public int getCodeFour() {
        return codeFour;
    }

    public void setCodeFour(int codeFour) {
        this.codeFour = codeFour;
    }

    public String getNomFour() {
        return nomFour;
    }

    public void setNomFour(String nomFour) {
        this.nomFour = nomFour;
    }

    public String getAdresseFour() {
        return adresseFour;
    }

    public void setAdresseFour(String adresseFour) {
        this.adresseFour = adresseFour;
    }

    public String getNationaliteFour() {
        return nationaliteFour;
    }

    public void setNationaliteFour(String nationaliteFour) {
        this.nationaliteFour = nationaliteFour;
    }
    
    
}
