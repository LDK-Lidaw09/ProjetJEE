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
public class Client extends Utilisateur  {
    private int idClient;
    private String nomClient,typeClient,adresseClient,specialiteClient;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idCleint) {
        this.idClient = idCleint;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }


    public String getTypeClient() {
        return typeClient;
    }

    public void setTypeClient(String typeClient) {
        this.typeClient = typeClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getSpecialiteClient() {
        return specialiteClient;
    }

    public void setSpecialiteClient(String specialiteClient) {
        this.specialiteClient = specialiteClient;
    }

    public Client(String login,String password,String profil,int idClient, String nomClient, String typeClient, String adresseClient, String specialiteClient) {
      super(login,password,profil);
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.typeClient = typeClient;
        this.adresseClient = adresseClient;
        this.specialiteClient = specialiteClient;
    }

    public Client(int idClient, String nomClient,String typeClient, String adresseClient, String specialiteClient, String login, String password, String profil) {
        super(login, password, profil);
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.typeClient = typeClient;
        this.adresseClient = adresseClient;
        this.specialiteClient = specialiteClient;
    }

    public Client(String nomClient,  String typeClient, String adresseClient, String specialiteClient, String login, String password, String profil) {
        super(login, password, profil);
        this.nomClient = nomClient;
        this.typeClient = typeClient;
        this.adresseClient = adresseClient;
        this.specialiteClient = specialiteClient;
    }

    
    
    
}
