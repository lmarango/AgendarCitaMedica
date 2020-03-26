/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;


public class clsAdmin {
    private int atrId;
    private String atrNombre;
    private String atrUser;
    private String atrContraseña;

    public clsAdmin(String prmUser, String prmContraseña) {
        this.atrUser = prmUser;
        this.atrContraseña = prmContraseña;
    }

    public clsAdmin(String prmUser) {
        this.atrUser = prmUser;
    }

    public clsAdmin(int prmId) {
        this.atrId = prmId;
    }

    public clsAdmin(int prmId, String prmNombre, String prmUser, String prmContraseña) {
        this.atrId = prmId;
        this.atrNombre = prmNombre;
        this.atrUser = prmUser;
        this.atrContraseña = prmContraseña;
    }

    public int getAtrId() {
        return atrId;
    }

    public void setAtrId(int prmId) {
        this.atrId = prmId;
    }

    public String getAtrNombre() {
        return atrNombre;
    }

    public void setAtrNombre(String prmNombre) {
        this.atrNombre = prmNombre;
    }

    public String getAtrUser() {
        return atrUser;
    }

    public void setAtrUser(String prmUser) {
        this.atrUser = prmUser;
    }

    public String getAtrContraseña() {
        return atrContraseña;
    }

    public void setAtrContraseña(String prmContraseña) {
        this.atrContraseña = prmContraseña;
    }
    
    
}
