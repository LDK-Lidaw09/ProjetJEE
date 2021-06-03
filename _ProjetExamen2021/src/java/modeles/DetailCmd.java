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
public class DetailCmd {
    private int prixCmd,qteCmd;
    private String autresInfo;

    public DetailCmd(int prixCmd, int qteCmd, String autresInfo) {
        this.prixCmd = prixCmd;
        this.qteCmd = qteCmd;
        this.autresInfo = autresInfo;
    }

    public int getPrixCmd() {
        return prixCmd;
    }

    public void setPrixCmd(int prixCmd) {
        this.prixCmd = prixCmd;
    }

    public int getQteCmd() {
        return qteCmd;
    }

    public void setQteCmd(int qteCmd) {
        this.qteCmd = qteCmd;
    }

    public String getAutresInfo() {
        return autresInfo;
    }

    public void setAutresInfo(String autresInfo) {
        this.autresInfo = autresInfo;
    }
    
}
