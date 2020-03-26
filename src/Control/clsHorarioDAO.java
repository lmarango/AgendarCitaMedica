package Control;

import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class clsHorarioDAO {
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Objeto de tipo ConectaDb
     */
    ConectaDb conecta = new ConectaDb();
    /**
     * Atributo que define el horario de un médico
     */
    String varHorario[] = {"",""};
    /**
     * Describe la hora final de atencion del medico en horario laboral
     */
    String varHoraFinal = "";
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo que cuenta las filas del espacio de atencion de la tabla de la base de datos
     * @return numero de filas de espacio de atencion, que corresponden a la cantidad de citas asiganadas para ese dia
     * @throws SQLException 
     */
    public int contarFilas() throws SQLException
    {
        int contador = 0;
        String sql = "Select count(*) res from espacioatencion";
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        if(rs.next())
        {
            contador = rs.getInt(1);
        }
        conecta.cierraResultado(rs);
        return contador + 1;
    }
    /**
     * Metodo que asigna el horario de atencion a un médico por medio del parametro recibido
     * @param prmHorario horario otorgado para el médico
     * @return Verdadero en caso de exito en la asignación y Falso de lo contrario
     * @throws SQLException 
     */
    public boolean asignarHorarioAtencion(clsHorarioMedico prmHorario) throws SQLException {
        boolean varSeAsigno = false;
        varHoraFinal = prmHorario.getHoraFin();
        prmHorario.setHoraFin(prmHorario.getHoraInicio());
        varHorario = prmHorario.getHoraInicio().split(":");
        while(varHoraFinal.equals(prmHorario.getHoraFin()) == false)
        {
            if(varHorario[1].equals("00"))
            {
                varHorario[1] = "30";
                String varHora = varHorario[0] + ":" + varHorario[1];
                prmHorario.setHoraFin(varHora);
                prmHorario.setIdHorario(this.contarFilas());
                //String varFecha = prmMedico.getAtrFechaNac();
                String sql = "INSERT INTO espacioatencion (ea_id, per_id, m_tprofesional, ea_fecha, ea_horainicio, ea_horafin, "
                        + "ea_estadoespacio) "
                        + "VALUES (" + prmHorario.getIdHorario() + ", " + prmHorario.getIdPersona() + ", " + prmHorario.getIdMedico() +
                        ", '"+ prmHorario.getFecha() + "', '" + prmHorario.getHoraInicio() + "', '"
                        + prmHorario.getHoraFin() + "', '" + prmHorario.getEstado() + "' )";
                conecta.conectar();
                if(conecta.transaccion(sql)) {
                    varSeAsigno = true;
                    conecta.desconectar();
                }
                prmHorario.setHoraInicio(varHora);
            }
            if(varHorario[1].equals("30") == true)
            {
                int hora = Integer.parseInt(varHorario[0]);
                hora++;
                if(hora == 24)
                {
                    hora = 0;
                }
                varHorario[0] = hora + "";
                varHorario[1] = "00";
                String varHora = varHorario[0] + ":" + varHorario[1];
                prmHorario.setHoraFin(varHora);
                prmHorario.setIdHorario(this.contarFilas());
                //String varFecha = prmMedico.getAtrFechaNac();
                String sql = "INSERT INTO espacioatencion (ea_id, per_id, m_tprofesional, ea_fecha, ea_horainicio, ea_horafin, "
                        + "ea_estadoespacio) "
                        + "VALUES (" + prmHorario.getIdHorario() + ", " + prmHorario.getIdPersona() + ", " + prmHorario.getIdMedico() +
                        ", '"+ prmHorario.getFecha() + "', '" + prmHorario.getHoraInicio() + "', '"
                        + prmHorario.getHoraFin() + "', '" + prmHorario.getEstado() + "' )";
                conecta.conectar();
                if(conecta.transaccion(sql)) {
                    varSeAsigno = true;
                    conecta.desconectar();
                }
                prmHorario.setHoraInicio(varHora);
            }
        }
        
        return varSeAsigno;
    }
    /**
     * Se actualiza a "No Disponible" el estado del Horario
     * @param prmHorario Objeto que contiene el Id a utilizar
     * @return Verdadero si se actualizo el estado. Falso de lo contrario.
     */
    public boolean actualizarEstado(clsHorarioMedico prmHorario){
        boolean varSeActualizo = false;
        String sql = "update espacioatencion set ea_estadoespacio = '" + prmHorario.getEstado() + "' where ea_id = " + prmHorario.getIdHorario();
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            varSeActualizo = true;
            conecta.desconectar();
        }
        return varSeActualizo;
    }
    
    /**
     * Metodo que obtiene informacion sobre espacios de atencion de citas que se encuentran como 'Libre' en la base de datos
     * @return tabla con información de espacios libres y del médico que los atiende
     * @throws SQLException 
     */
    public ResultSet obtenerTabla(String prmEspecialidad) throws SQLException{
        String sql = "select ea_id \"idEA\", ea_fecha \"Fecha\", ea_horainicio \"Hora\", per_id \"IdMedico\", m_tprofesional \"TarjetaProf\", initcap(concat(per_nombre,concat(' ', per_apellido))) \"Medico\", m_especialidad \"Especialidad\"  from  espacioatencion natural join medico natural join persona where ea_estadoespacio = 'Disponible' and m_estado = 'Activo' and m_especialidad = '" + prmEspecialidad + "'";
        conecta.conectar();
        ResultSet rs = ConectaDb.retornarConsultas(sql);
        if (rs.next()) {
            return rs;
        }
        conecta.cierraResultado(rs);
        return null;
    }
//</editor-fold>
}
