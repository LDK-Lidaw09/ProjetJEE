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
public class Commande {
    private  int codeCmd;
    private String typeCmd,dateCmd,detailCmd;

    public Commande(int codeCmd, String typeCmd, String dateCmd, String detailCmd) {
        this.codeCmd = codeCmd;
        this.typeCmd = typeCmd;
        this.dateCmd = dateCmd;
        this.detailCmd = detailCmd;
    }

    public int getCodeCmd() {
        return codeCmd;
    }

    public void setCodeCmd(int codeCmd) {
        this.codeCmd = codeCmd;
    }

    public String getTypeCmd() {
        return typeCmd;
    }

    public void setTypeCmd(String typeCmd) {
        this.typeCmd = typeCmd;
    }

    public String getDateCmd() {
        return dateCmd;
    }

    public void setDateCmd(String dateCmd) {
        this.dateCmd = dateCmd;
    }

    public String getDetailCmd() {
        return detailCmd;
    }

    public void setDetailCmd(String detailCmd) {
        this.detailCmd = detailCmd;
    }

    
    
}
