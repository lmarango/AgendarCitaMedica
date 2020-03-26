/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

/**
 *
 * @author juan jose
 */
public class clsHistoriaClinica {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int atrHistoriaId; //Identificador de historia clinica
    private int atrPersonaId; //Identificador de la persona
    private int atrNumPaciente; //Identificador de paciente
    private int atrCitaMedicaId; //Identificador de cita medica
    private String atrMotivoConsulta; //Motivo de la cita medica
    private String atrEnfermedadActual; //Enfermedad actual del paciente
    private String atrAnamnesis; //Tipo de diagnostico médico
    private String atrAntecedentes; //Antecedentes médicos del paciente
    private String atrExamenFisico; //Examen Físico del paciente
    private String atrEvolucionMedica; //Mejorias que presenta el paciente luego de la cita médica
    private String atrTratamiento; //Tratamiento propuesto por el médico
    private String atrDiagnostico; //Diagnostico del paciente
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * COnstructor por defecto de la clase Historia Clinica
     */
    public clsHistoriaClinica()
    {
        
    }
    
    public clsHistoriaClinica(int prmHistoriaId, int prmPersonaId, int prmNumPaciente, int prmCitaMedicaId, String prmMotivoConsulta,
            String prmEnfermedadActual, String prmAnamnesis, String prmAntecedentes, String prmExamenFisico, String prmEvolucionMedica,
            String prmTratamiento, String prmDiagnostico)
    {
        this.atrHistoriaId = prmHistoriaId;
        this.atrPersonaId = prmPersonaId;
        this.atrNumPaciente = prmNumPaciente;
        this.atrCitaMedicaId = prmCitaMedicaId;
        this.atrMotivoConsulta = prmMotivoConsulta;
        this.atrEnfermedadActual = prmEnfermedadActual;
        this.atrAnamnesis = prmAnamnesis;
        this.atrAntecedentes = prmAntecedentes;
        this.atrExamenFisico = prmExamenFisico;
        this.atrEvolucionMedica = prmEvolucionMedica;
        this.atrTratamiento = prmTratamiento;
        this.atrDiagnostico = prmDiagnostico;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters">
    public int getAtrHistoriaId() {
        return atrHistoriaId;
    }
    public int getAtrPersonaId() {
        return atrPersonaId;
    }
    public int getAtrNumPaciente() {
        return atrNumPaciente;
    }
    public int getAtrCitaMedicaId() {
        return atrCitaMedicaId;
    }
    public String getAtrMotivoConsulta() {
        return atrMotivoConsulta;
    }
    public String getAtrEnfermedadActual() {
        return atrEnfermedadActual;
    }
    public String getAtrAnamnesis() {
        return atrAnamnesis;
    }
    public String getAtrAntecedentes() {
        return atrAntecedentes;
    }
    public String getAtrExamenFisico() {
        return atrExamenFisico;
    }
    public String getAtrEvolucionMedica() {
        return atrEvolucionMedica;
    }
    public String getAtrTratamiento() {
        return atrTratamiento;
    }
    public String getAtrDiagnostico() {
        return atrDiagnostico;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Setters">
    public void setAtrHistoriaId(int atrHistoriaId) {
        this.atrHistoriaId = atrHistoriaId;
    }
    public void setAtrPersonaId(int atrPersonaId) {
        this.atrPersonaId = atrPersonaId;
    }
    public void setAtrNumPaciente(int atrNumPaciente) {
        this.atrNumPaciente = atrNumPaciente;
    }
    public void setAtrCitaMedicaId(int atrCitaMedicaId) {
        this.atrCitaMedicaId = atrCitaMedicaId;
    }
    public void setAtrMotivoConsulta(String atrMotivoConsulta) {
        this.atrMotivoConsulta = atrMotivoConsulta;
    }
    public void setAtrEnfermedadActual(String atrEnfermedadActual) {
        this.atrEnfermedadActual = atrEnfermedadActual;
    }
    public void setAtrAnamnesis(String atrAnamnesis) {
        this.atrAnamnesis = atrAnamnesis;
    }
    public void setAtrAntecedentes(String atrAntecedentes) {
        this.atrAntecedentes = atrAntecedentes;
    }
    public void setAtrExamenFisico(String atrExamenFisico) {
        this.atrExamenFisico = atrExamenFisico;
    }
    public void setAtrEvolucionMedica(String atrEvolucionMedica) {
        this.atrEvolucionMedica = atrEvolucionMedica;
    }
    public void setAtrTratamiento(String atrTratamiento) {
        this.atrTratamiento = atrTratamiento;
    }
    public void setAtrDiagnostico(String atrDiagnostico) {
        this.atrDiagnostico = atrDiagnostico;
    }
    //</editor-fold>


    

    

    
}
