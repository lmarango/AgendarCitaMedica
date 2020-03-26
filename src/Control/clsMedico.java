
package Control;

import java.sql.Date;

public class clsMedico extends clsPersona{
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int atrTProfesional;
    private String atrEspecialidad;
    private byte atrExperiencia;
    private int atrConsultorio;
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    public clsMedico(clsPersona prmObjPersona, int prmTProfesional, String prmEspecialidad, byte prmExperiencia, int prmConsultorio) {
        super(prmObjPersona.getAtrDNI(), prmObjPersona.getAtrNombre(), prmObjPersona.getAtrApellido(), prmObjPersona.getAtrFechaNac(), prmObjPersona.getAtrTelefono(), prmObjPersona.getAtrEmail(), prmObjPersona.getAtrDireccion());
        this.atrTProfesional = prmTProfesional;
        this.atrEspecialidad = prmEspecialidad;
        this.atrExperiencia = prmExperiencia;
        this.atrConsultorio = prmConsultorio;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getAtrTProfesional() {
        return atrTProfesional;
    }

    public void setAtrTProfesional(int atrTProfesional) {
        this.atrTProfesional = atrTProfesional;
    }

    public String getAtrEspecialidad() {
        return atrEspecialidad;
    }
    
    public int getConsultorio()
    {
        return this.atrConsultorio;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setAtrEspecialidad(String atrEspecialidad) {
        this.atrEspecialidad = atrEspecialidad;
    }

    public byte getAtrExperiencia() {
        return atrExperiencia;
    }

    public void setAtrExperiencia(byte atrExperiencia) {
        this.atrExperiencia = atrExperiencia;
    }
    
    public void setConsultorio(int prmConsultorio)
    {
        this.atrConsultorio = prmConsultorio;
    }
    //</editor-fold>
}
