package Control;
import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;


public class clsPersonaDAO {
    ConectaDb conecta = new ConectaDb();
    
    public boolean RegistrarPersona(clsPersona prmPersona){
        boolean varRegistro = false;
        
        String sql = "INSERT INTO persona (per_id, per_nombre, per_apellido, per_fechanac, per_telefono, per_email, per_direccion) "
                + "VALUES (" + prmPersona.getAtrDNI() + "," + "'"+ prmPersona.getAtrNombre() +  
                "', '" + prmPersona.getAtrApellido() + "', '" + prmPersona.getAtrFechaNac() + "', '" + 
                prmPersona.getAtrTelefono() + "', '" + prmPersona.getAtrEmail() + "', '" +
                prmPersona.getAtrDireccion() + "')";
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            varRegistro = true;
            conecta.desconectar();
        }
       return varRegistro;
    }
    
    /**
     * Permite actualizar la direccion de la persona que tiene iniciada la sesion
     * @param prmDireccion nueva direccion
     * @param prmIdPersona Id de la persona que tiene iniciada la sesion
     * @return True si se actualizo la direccion correctamente, False si no se pudo actualizar
     */
    public boolean CambiarDireccion(String prmDireccion, int prmIdPersona)
    {
        boolean seActualizo = false;
        String sql = "update persona set per_direccion = '" + prmDireccion + "' where per_id = " + prmIdPersona + "";
        
        conecta.conectar();
        if(conecta.transaccion(sql))
        {
            seActualizo = true;
            conecta.desconectar();
        }
        return seActualizo;
    }

    /**
     * Permite cambiar el telefono de la cuenta donde se tiene la sesión iniciada.
     * @param prmTelefono nuevo telefono
     * @param prmIdPersona id de la persona dueña de la cuenta
     * @return True si se pudo actualizar el telefono correctamente, False si no se pudo actualizar
     */
    public boolean CambiarTelefono(String prmTelefono, int prmIdPersona)
    {
        boolean seActualizo = false;
        String sql = "update persona set per_telefono = '" + prmTelefono + "' where per_id = " + prmIdPersona + "";
        
        conecta.conectar();
        if(conecta.transaccion(sql))
        {
            seActualizo = true;
            conecta.desconectar();
        }
        return seActualizo;
    }
    
    /**
     * Verifica si la persona está registrada como Paciente.
     * @param prmPersona objeto con el Id a utilizar
     * @return Verdadero si es Paciente. Falso de lo contrario
     * @throws SQLException 
     */
    public boolean esPaciente(clsPersona prmPersona)throws SQLException{
        String sql = "select * from Paciente where per_id = " + prmPersona.getAtrDNI();
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        if(rs.next())
        {
            return true;
        }
        return false;
    }
    
    
    public boolean esMedico(clsPersona prmPersona)throws SQLException{
        String sql = "select * from medico where per_id = " + prmPersona.getAtrDNI();
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        if(rs.next())
        {
            return true;
        }
        return false;
    }
}