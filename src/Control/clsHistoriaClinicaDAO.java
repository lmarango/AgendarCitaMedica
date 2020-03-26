/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juan jose
 */
public class clsHistoriaClinicaDAO {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Objeto de tipo ConectaDb
     */
    ConectaDb conecta = new ConectaDb();
    
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
    
    public boolean generarHistoria(clsHistoriaClinica prmHistoriaClinica) throws SQLException
    {
        boolean varSeGenero = false;
        prmHistoriaClinica.setAtrHistoriaId(this.contarFilas());
        String sql = "insert into historia_clinica values(" + prmHistoriaClinica.getAtrHistoriaId() +
                ", " + prmHistoriaClinica.getAtrPersonaId() + ", " + prmHistoriaClinica.getAtrNumPaciente()
                + ", " + prmHistoriaClinica.getAtrCitaMedicaId() + ", '" + prmHistoriaClinica.getAtrMotivoConsulta()
                + "', '" + prmHistoriaClinica.getAtrEnfermedadActual() + "', '" + prmHistoriaClinica.getAtrAnamnesis()
                + "', '" + prmHistoriaClinica.getAtrAntecedentes() + "', '" + prmHistoriaClinica.getAtrExamenFisico()
                + "', '" + prmHistoriaClinica.getAtrEvolucionMedica() + "', '" + prmHistoriaClinica.getAtrTratamiento()
                + "', '" + prmHistoriaClinica.getAtrDiagnostico() + "')";
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            varSeGenero = true;
            conecta.desconectar();
        }
        return varSeGenero;
    }
    //</editor-fold>
    
}
