package Control;

/**
 *
 * @author Luis Arango
 * @author Yeferson Benavides
 * @author  Juan José Rengifo
 */
public class clsCuenta {
    String atrUsuario;
    int atrPerID;
    String atrPassword;

    public clsCuenta(String atrUsuario, int atrPerID, String atrPassword) {
        this.atrUsuario = atrUsuario;
        this.atrPerID = atrPerID;
        this.atrPassword = atrPassword;
    }
    
    public String getAtrUsuario() {
        return atrUsuario;
    }

    public void setAtrUsuario(String atrUsuario) {
        this.atrUsuario = atrUsuario;
    }

    public int getAtrPerID() {
        return atrPerID;
    }

    public void setAtrPerID(int atrPerID) {
        this.atrPerID = atrPerID;
    }

    public String getAtrPassword() {
        return atrPassword;
    }

    public void setAtrPassword(String atrPassword) {
        this.atrPassword = atrPassword;
    }
}
