/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

public class clsCitaMedica {
    
    private int atrIdCita;
    private int atrIdPaciente;
    private int atrNumPaciente;
    private int atrIdMedico;
    private int atrTjtaProfMed;
    private int atrValor;
    private String atrFecha;
    private String atrHora;

    public clsCitaMedica(int prmIdCita, int prmIdPersona, int prmNumPaciente, int prmIdMedico, int prmTjtaProfMed, int prmValor, String prmFecha, String prmHora) {
        this.atrIdCita = prmIdCita;
        this.atrIdPaciente = prmIdPersona;
        this.atrNumPaciente = prmNumPaciente;
        this.atrIdMedico = prmIdMedico;
        this.atrTjtaProfMed = prmTjtaProfMed;
        this.atrValor = prmValor;
        this.atrFecha = prmFecha;
        this.atrHora = prmHora;
    }

    public int getAtrIdCita() {
        return atrIdCita;
    }

    public void setAtrIdCita(int prmIdCita) {
        this.atrIdCita = prmIdCita;
    }


    public int getAtrIdPaciente() {
        return atrIdPaciente;
    }

    public void setAtrIdPaciente(int prmIdPersona) {
        this.atrIdPaciente = prmIdPersona;
    }

    public int getAtrNumPaciente() {
        return atrNumPaciente;
    }

    public void setAtrNumPaciente(int prmNumPaciente) {
        this.atrNumPaciente = prmNumPaciente;
    }

    public int getAtrIdMedico() {
        return atrIdMedico;
    }

    public void setAtrIdMedico(int prmIdMedico) {
        this.atrIdMedico = prmIdMedico;
    }

    public int getAtrTjtaProfMed() {
        return atrTjtaProfMed;
    }

    public void setAtrTjtaProfMed(int prmTjtaProfMed) {
        this.atrTjtaProfMed = prmTjtaProfMed;
    }

    public int getAtrValor() {
        return atrValor;
    }

    public void setAtrValor(int prmValor) {
        this.atrValor = prmValor;
    }

    public String getAtrFecha() {
        return atrFecha;
    }

    public void setAtrFecha(String prmFecha) {
        this.atrFecha = prmFecha;
    }

    public String getAtrHora() {
        return atrHora;
    }

    public void setAtrHora(String prmHora) {
        this.atrHora = prmHora;
    }
    
    
}
