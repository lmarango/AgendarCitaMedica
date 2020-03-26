/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;

public class clsCitaDAO{
    
    private ConectaDb conecta = new ConectaDb();
    
    //<editor-fold defaultstate="collapsed" desc="METODOS">
    /**
     * Metodo que cuenta las filas de la tabla CitaMedica de la base de datos
     * @return numero de filas + 1 de CitasMedica, que corresponden a la cantidad de citas registradas en la base de datos+1
     * @throws SQLException 
     */
    public int contarFilas() throws SQLException
    {
        int contador = 0;
        String sql = "Select count(*) res from citamedica";
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
     * Metodo que permite el registro de una cita medica en la base de datos
     * @param prmCita objeto de tipo CitaMedica recibido por parametro
     * @return Verdadero si el proceso finaliza con exito, falso de lo contrario
     */
    public boolean registrarCita(clsCitaMedica prmCita) throws SQLException{
        boolean varSeRegistro = false;
        
        // en esta consulta he borrado los datos referentes a la tabla pago
        String sql = "INSERT INTO citamedica (cm_id, per_id, p_numpaciente, med_per_id, "
                + "m_tprofesional, cm_valor, cm_fecha, cm_hora) "
                + "VALUES (" + prmCita.getAtrIdCita()+ 
                ", " + prmCita.getAtrIdPaciente() + ", " + prmCita.getAtrNumPaciente() + ", "
                + prmCita.getAtrIdMedico() + ", " + prmCita.getAtrTjtaProfMed() + ", " + prmCita.getAtrValor()
                + ", '" + prmCita.getAtrFecha() + "', '" + prmCita.getAtrHora() + "')";
        
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            varSeRegistro = true;
            conecta.desconectar();
        }
        return varSeRegistro;
    }
    
    //</editor-fold>
}
