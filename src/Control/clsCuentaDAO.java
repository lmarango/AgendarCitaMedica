package Control;
import data.ConectaDb;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Arango
 * @author Yeferson Benavides
 * @author Juan José Rengifo
 */
public class clsCuentaDAO {
    private ConectaDb conecta = new ConectaDb();
  
    public clsCuentaDAO()
    {
        
    }
    
    public boolean RegistrarCuenta(clsCuenta prmCuenta){
        boolean varSeRegistro = false;
        String sql = "INSERT INTO cuenta (cu_usuario, per_id, cu_contrasena) VALUES ('" +
                prmCuenta.atrUsuario + "', " + prmCuenta.atrPerID + ", '" + prmCuenta.atrPassword + "')";
        
        conecta.conectar();
        if(conecta.transaccion(sql)) {
            varSeRegistro = true;
            conecta.desconectar();
        }
        return varSeRegistro;
    }
    
    /**
     * Permite cambiar la contraseña de la cuenta donde se haya iniciado la sesión
     * @param prmContraseña nueva contraseña de la cuenta
     * @param prmCorreo correo asociado a la cuenta donde se tiene iniciada sesión para poder encontrar el id del dueño de la cuenta
     * @return  True si se pudo cambiar la contraseña, False si no se pudo cambiar la contraseña
     */
    public boolean CambiarContraseña(String prmContraseña, int prmIdPersona)
    {
        boolean seActualizo = false;
        String sql = "update cuenta set cu_contrasena = '" + prmContraseña + "' where per_id = " + prmIdPersona + "";
        
        conecta.conectar();
        if(conecta.transaccion(sql))
        {
            seActualizo = true;
            conecta.desconectar();
        }
        return seActualizo;
    }
    
    /**
     * Se busca la cuenta asociada al correo de usuario dado. Si se encuentra, se obtiene el Id asociado.
     * @param prmCorreo usuario ingresado
     * @return Si se encontró coincidencia, Id asociado al correo dado por parametro. En caso contrario retorna -1.
     */
    public int buscarCuenta(String prmCorreo)
    {
        int varId = -1;
        String sql = "Select per_id from cuenta where cu_usuario = '" + prmCorreo +"'";
        conecta.conectar();
        ResultSet rs = conecta.retornarConsultas(sql);
        try {
            if(rs.next())
            {
                varId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(clsCuentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            varId = -1;
        } finally{
            conecta.cierraResultado(rs);
        }
        return varId;
    }
    
    
}
