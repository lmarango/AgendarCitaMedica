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
public class clsHorarioMedico {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private int atrIdHorario; //Identidficador del horario
    private int atrIdPersona; //Identificar de la persona
    private int atrIdMedico; //Identificador del médico
    private String atrEstado; // Estado del horario (Disponible o no disponible)
    private String atrFecha; //Fecha de atencion laboral
    private String atrHoraInicio; //Hora de inicio laboral del médico
    private String atrHoraFin; //Hora de fin de seccion laboral
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor parametrizado para la Clase HorarioMedico
     * @param prmIdHorario Identificador de horario 
     * @param prmIdPersona identificacion de la persona
     * @param prmIdMedico identificacion del medico
     * @param prmEstado estado del horario (disponible o no disponible)
     * @param prmFecha Fecha del horario medico adjunto 
     * @param prmHoraInicio Hora de inicio del horario 
     * @param prmHoraFin  Hora de finalización
     */
    public clsHorarioMedico(int prmIdHorario, int prmIdPersona, int prmIdMedico, String prmEstado, String prmFecha, String prmHoraInicio, String prmHoraFin)
    {
        this.atrIdHorario = prmIdHorario;    
        this.atrIdPersona = prmIdPersona;
        this.atrIdMedico = prmIdMedico;
        this.atrEstado = prmEstado;
        this.atrFecha = prmFecha;
        this.atrHoraInicio = prmHoraInicio;
        this.atrHoraFin = prmHoraFin;
    }

    public clsHorarioMedico(int atrIdHorario) {
        this.atrIdHorario = atrIdHorario;
    }    
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Metedo que retorna el ID del horario
     * @return idebntificador de horario
     */
    public int getIdHorario()
    {
        return this.atrIdHorario;
    }
    /**
     * Obtiene la id de la tarjeta profesional del médico
     * @return Identificar de Tarjeta profesional del medico
     */
    public int getIdMedico() {
        return atrIdMedico;
    }
    /**
     * Obtiene la fecha del horario medico
     * @return fecha de horario medico
     */
    public String getFecha() {
        return atrFecha;
    }
    /**
     * Obtiene el inicio de la atencion
     * @return la hora de inicio del horario medico de atencion
     */
    public String getHoraInicio()
    {
        return this.atrHoraInicio;
    }
    /**
     * Obtiene la hora de finalización
     * @return la hora de fin del horario medido adascrito a una fecha y aun medico
     */
    public String getHoraFin()
    {
        return this.atrHoraFin;
    }
    /**
     * Obtiene el estado de la asignacion de horario en una franja de tiempo
     * @return Estado del esacio de tiempo solicitado
     */
    public String getEstado()
    {
        return this.atrEstado;
    }
    /**
     * Obtiene el id del medico
     * @return numero de identificacion del médico
     */
    public int getIdPersona()
    {
        return this.atrIdPersona;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Actualiza el estado por medio del parámetro 
     * @param prmEstado Disponible o no disponible, estado del horario 
     */
    public void setEstado(String prmEstado)
    {
        this.atrEstado = prmEstado;
    }
    /**
     * Actualiza el id del horario definido en parametro
     * @param prmIdHorario identificador de horario
     */
    public void setIdHorario( int prmIdHorario)
    {
        this.atrIdHorario = prmIdHorario;
    }
    /**
     * Actualiza la hora de finalizacion del horario del medico
     * @param prmHoraFin hora de fin del horario laboral del medico
     */
    public void setHoraFin(String prmHoraFin)
    {
        this.atrHoraFin = prmHoraFin;
    }
    /**
     * Actualiza la hora de inicio del horario del medico 
     * @param prmHoraInicio hora de inicio laboral del medico
     */
    public void setHoraInicio(String prmHoraInicio)
    {
        this.atrHoraInicio = prmHoraInicio;
    }
    /**
     * Actualiza la fecha del horario de un medico
     * @param prmFecha fecha del horario laboral de un médico
     */
    public void setFecha(String prmFecha)
    {
        this.atrFecha = prmFecha;
    }
    /**
     * Actualiza el id de una persona
     * @param prmIdPersona id de la persona medico
     */
    public void setIdPersona(int prmIdPersona)
    {
        this.atrIdPersona = prmIdPersona;
    }
    //</editor-fold>
}
