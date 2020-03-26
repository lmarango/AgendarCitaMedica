/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;


public class clsPacienteDAO {
    
    ConectaDb conecta = new ConectaDb();
    
    /**
     * Metodo que cuenta las filas de la tabla de Pacientes de la base de datos
     * @return numero de filas de Paciente + 1, que corresponden a la cantidad de pacientes registrados
     * @throws SQLException 
     */
    public int contarFilas() throws SQLException
    {
        int contador = 0;
        String sql = "Select count(*) res from paciente";
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
     * Metodo que permite el registro de un paciente en la base de datos
     * @param prmPaciente objeto de tipo paciente recibido por parametro
     * @return Verdadero si el proceso finaliza con exito, falso de lo contrario
     */
    public boolean registrarPaciente(clsPaciente prmPaciente) {
        boolean varSeRegistro = false;
        
        String sql = "INSERT INTO paciente (per_id, p_numpaciente) "
                + "VALUES (" + prmPaciente.getAtrDNI() + ", " + prmPaciente.getAtrNumPaciente() +")";
        
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            varSeRegistro = true;
            conecta.desconectar();
        }
        return varSeRegistro;
    }
    
    /**
     * Se obtiene el Numero de Paciente del Paciente dado.
     * @param prmPaciente objeto de tipo Paciente que contiene el Id a utilizar
     * @return Numero del paciente en caso de existir. En caso contrario retorna -1.
     */
    public int getNumPacienteById(clsPaciente prmPaciente){
        int numPac = -1;
        String sql = "Select p_numpaciente from paciente where per_id = " + prmPaciente.getAtrDNI();
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        
        try {
            if(rs.next())
            {
                numPac = rs.getInt(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            conecta.cierraResultado(rs);
        }
        
        return numPac;
    }
}
