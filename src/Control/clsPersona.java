package Control;
import java.sql.Date;

public class clsPersona {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int atrDNI; // identificacion de la persona
    private String atrNombre; //Nombre de la persona
    private String atrApellido; //Apellido de la persona
    private String atrFechaNac; //Fecha de nacimiento de la persona
    private String atrTelefono; //Numero de contacto de la persona
    private String atrEmail; //Correo electronico de la persona
    private String atrDireccion; //DIreccion de residencia de la persona
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">    

    public clsPersona() {
        this.atrDNI = 0;
        this.atrNombre = "";
        this.atrApellido = "";
        this.atrFechaNac = "";
        this.atrTelefono = "";
        this.atrEmail = "";
        this.atrDireccion = "";
    }
    
    public clsPersona(int atrDNI) {
        this.atrDNI = atrDNI;
    }
    
    /**
     * Constructor parametrizado de la clase persona que crea una nueva instancia/objeto de la clase
     * @param prmDNI describre la identificaion del nuevo objeto persona
     * @param prmNombre describe el nombre del nuevo objeto persona
     * @param prmApellido describe el apellido del nuevo objeto persona
     * @param prmFechaNac describe la fecha de nacimiento del nuevo objeto persona
     * @param prmTelefono describe el relefono del nuevo objPersona
     * @param prmEmail describe el correo electronico del nuevo objPersona
     * @param prmDireccion  describe la residencia del nuevo objPersona
     */
    public clsPersona(int prmDNI, String prmNombre, String prmApellido, String prmFechaNac, String prmTelefono, String prmEmail, String prmDireccion) {
        this.atrDNI = prmDNI;
        this.atrNombre = prmNombre;
        this.atrApellido = prmApellido;
        this.atrFechaNac = prmFechaNac;
        this.atrTelefono = prmTelefono;
        this.atrEmail = prmEmail;
        this.atrDireccion = prmDireccion;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getAtrDNI() {
        return atrDNI;
    }
    public String getAtrNombre() {
        return atrNombre;
    }
    public String getAtrApellido() {
        return atrApellido;
    }
    public String getAtrFechaNac() {
        return atrFechaNac;
    }
    public String getAtrTelefono() {
        return atrTelefono;
    }
    public String getAtrEmail() {
        return atrEmail;
    }
    public String getAtrDireccion() {
        return atrDireccion;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setAtrDNI(int atrDNI) {
        this.atrDNI = atrDNI;
    }
    
    public void setAtrNombre(String atrNombre) {
        this.atrNombre = atrNombre;
    }
    
    public void setAtrApellido(String atrApellido) {
        this.atrApellido = atrApellido;
    }
    
    public void setAtrFechaNac(String atrFechaNac) {
        this.atrFechaNac = atrFechaNac;
    }
    
    public void setAtrTelefono(String atrTelefono) {
        this.atrTelefono = atrTelefono;
    }
    
    public void setAtrEmail(String atrEmail) {
        this.atrEmail = atrEmail;
    }
    
    public void setAtrDireccion(String atrDireccion) {
        this.atrDireccion = atrDireccion;
    }
//</editor-fold>
}
