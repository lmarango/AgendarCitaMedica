/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;


public class clsAdminDAO {
    
    private ConectaDb conecta = new ConectaDb();

    /**
     * Verifica si el usuario está registrado como Administrador.
     * @param prmAdmin objeto con el usuario a utilizar
     * @return Verdadero si es Administrador. Falso de lo contrario
     * @throws SQLException 
     */
    public boolean esAdmin(clsAdmin prmAdmin) throws SQLException {
        String sql = "select * from Administrador where adm_usuario = '" + prmAdmin.getAtrUser() + "'";
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        if(rs.next())
        {
            return true;
        }
        return false;
    }
    
    public boolean coincidenDatos(clsAdmin prmAdmin) throws SQLException{
        String sql = "select * from Administrador where adm_usuario = '" + prmAdmin.getAtrUser() + "' and adm_contrasena = '" + prmAdmin.getAtrContraseña() + "'";
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        if(rs.next())
        {
            return true;
        }
        return false;
    }
    
    
}
