package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConectaDb {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String atrUser, atrPass, atrUrlConectar, atrDriver; //definicion de variables para
    public static Connection connection; //variable de la clase conect para conectar las
    private static java.sql.Statement statement; //controla las conexiones
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor No parametrizado por defecto de la clase Conecta Db
     */
    public ConectaDb() {}
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo que inicializa los atributos de la clase y hace la conexión con la base de datos indicada en 
     * el atributo atrUrlConectar
     * @return Verdadero si la conexión fue exito y falso de lo contrario
     */
    public boolean conectar() {
        atrUser = "postgres";
        atrPass = "postgres";
        atrDriver = "org.postgresql.Driver";
        atrUrlConectar = "jdbc:postgresql://localhost/CitasHospitalarias";
        
        try {
            Class.forName(atrDriver);
            connection = DriverManager.getConnection(atrUrlConectar, atrUser, atrPass);
            System.out.println("Conexión exitosa.");
            return true;
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexión no exitosa.");
            return false;
        }
    }
    /**
     * Hace la desconexión de la base de datos
     */
    public void desconectar() {
        try {
            connection.close();
            System.out.println("Cerrando conexion");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Consulta en la base de datos la cadena en SQL ingresada por parámetro
     * @param prmCadConsulta cadena consulta SQL 
     * @return Resultado de la consulta descrita por el parametro prmCadConsulta
     */
    public static ResultSet retornarConsultas(String prmCadConsulta) {
        ResultSet resultado = null;
        
        try {
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                        ResultSet.CONCUR_READ_ONLY);
            resultado = statement.executeQuery(prmCadConsulta);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }
    /**
     * Cierra el reultado de una consulta realizada
     * @param prmResultado resultado de una consulta hecha previamente
     */
    public void cierraResultado(ResultSet prmResultado) {
        try {
            prmResultado.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    /**
     * Realiza una transaccion que es recibida por parámetro
     * @param prmCadenaSql cadena SQL que define la transaccion a realizar
     * @return Verdadero si la transaccion termina con éxito y falso de lo contrario
     */
    public boolean transaccion(String prmCadenaSql) {
        try {
            statement = connection.createStatement();
            statement.execute(prmCadenaSql);
            statement.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Starter de Prueba">
    /*  public static void main(String args[]) {
    
    ConectaDb cc = new ConectaDb();
    cc.conectar();
    
    if (cc.transaccion("insert into medico values (1 , 1001, 'Pepito', 'perez', '13/02/2020', 888, 'pp@email.example', 'la calle del olvido', null, 5);")) {
    System.out.println("Inserci�n exitosa");
    }
    else {
    System.out.println("Inserci�n No exitosa");
    }
    }*/
//</editor-fold>
}

