/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author Usuario
 */
public class clsPaciente extends clsPersona{
    
    private int atrNumPaciente;
    private int atrEpsNit;
    private int atrHCid;
    
    public clsPaciente(int prmPacienteNum, clsPersona prmObjPersona) {
        super(prmObjPersona.getAtrDNI(), prmObjPersona.getAtrNombre(), prmObjPersona.getAtrApellido(), 
              prmObjPersona.getAtrFechaNac(), prmObjPersona.getAtrTelefono(), prmObjPersona.getAtrEmail(), prmObjPersona.getAtrDireccion());
        atrNumPaciente = prmPacienteNum;
        atrEpsNit = 0;
        atrEpsNit = 0;
    }

    public int getAtrNumPaciente() {
        return atrNumPaciente;
    }

    public void setAtrNumPaciente(int prmNumPaciente) {
        this.atrNumPaciente = prmNumPaciente;
    }
    
    public int getAtrEpsNit() {
        return atrEpsNit;
    }

    public void setAtrEpsNit(int prmEpsNit) {
        this.atrEpsNit = prmEpsNit;
    }

    public int getAtrHCid() {
        return atrHCid;
    }

    public void setAtrHCid(int prmHCid) {
        this.atrHCid = prmHCid;
    }

    public clsPaciente(int prmIdPaciente) {
        super(prmIdPaciente);
        this.atrNumPaciente = 0;
    }
    
}
