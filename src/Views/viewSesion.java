/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.clsAdmin;
import Control.clsAdminDAO;
import Control.clsCuentaDAO;
import Control.clsPersona;
import Control.clsPersonaDAO;
import data.ConectaDb;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class viewSesion extends javax.swing.JFrame {
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private String atrUserAdmin = "admin@example.com";//Inicializacion explicita del user del administrador
    private String atrPasswordAdmin = "postgres";//Inicializacion explícita del password asociado al administrador
    private clsPersonaDAO daoPersona; //Objeto de tipo personaDAO
    private clsCuentaDAO daoCuenta; //Objeto de tipo cuentaDAO
    private clsAdminDAO daoAdmin;
    
    private JFrame frmSgte = new JFrame();
    
    // este es necesario para conocer quien es el que va a generar la cita.
    public static int atrIdUsuarioActual; 
    //</editor-fold> 
    //<editor-fold defaultstate="collapsed" desc="Constructores"> 
    /**
     * Constructor no parametrizado por defecto
     */
    public viewSesion() {        
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
//</editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIniSesion = new javax.swing.JButton();
        lblPregunta = new javax.swing.JLabel();
        lblRegistro = new javax.swing.JLabel();
        lblErrorSesion = new javax.swing.JLabel();
        lblCertificadoIcon = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Sesion"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIniSesion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIniSesion.setText("Iniciar");
        btnIniSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 90, 30));

        lblPregunta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblPregunta.setText("¿No te has registrado aún?");
        getContentPane().add(lblPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        lblRegistro.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(0, 51, 204));
        lblRegistro.setText("Registrarse ahora.");
        lblRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistroMouseClicked(evt);
            }
        });
        getContentPane().add(lblRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        lblErrorSesion.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        lblErrorSesion.setForeground(new java.awt.Color(153, 0, 0));
        lblErrorSesion.setText("Usuario o contraseña incorrectos. Intente nuevamente");
        getContentPane().add(lblErrorSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        lblCertificadoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/iconfinder-sslcertificate-4263529_117858.png"))); // NOI18N
        getContentPane().add(lblCertificadoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 110));

        lblTitulo.setBackground(new java.awt.Color(23, 138, 29));
        lblTitulo.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 0, 204));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("INICIAR SESIÓN");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 262, -1));

        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 190, 40));

        lblUsuario.setBackground(new java.awt.Color(236, 240, 241));
        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("USUARIO:");
        lblUsuario.setOpaque(true);
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, 40));
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 190, 40));

        lblPassword.setBackground(new java.awt.Color(236, 240, 241));
        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPassword.setText("CONTRASEÑA:");
        lblPassword.setOpaque(true);
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 100, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/85640256-médico-inteligente-con-estetoscopio-de-pie-con-la-imagen-borrosa-de-hospital-interior-y-fondo-azul-pat.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //<editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnIniSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniSesionActionPerformed
        String varUser = this.txtUser.getText();
        char[] arrayC = this.txtPassword.getPassword();
        String varPassword = new String(arrayC);
        if (hayCamposVacios() == false){
            boolean inicioCorrecto = IniciarSesion(varUser, varPassword);
            if (inicioCorrecto){
                this.lblErrorSesion.setVisible(false);
                frmSgte.setVisible(true);
                this.dispose();   
            }   
        }
        else{
            this.lblErrorSesion.setVisible(true);
        }
             
        
    }//GEN-LAST:event_btnIniSesionActionPerformed

    private void lblRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistroMouseClicked
        // se usa esta tecnica para no crear múltiples instancias de los mismos frames
        ViewRegUsuario frmRegUser = new ViewRegUsuario(){
            // con esto cuando llamemos a dispose() de frmRegUser abrimos la instancia actual de viewSesion 
            @Override
            public void dispose(){
                // hacemos visible la principal
                getFrame().setVisible(true);
                // cerramos frmRegUser
                super.dispose();
            }
        };

        // hacemos visible a frmRegUser
        frmRegUser.setVisible(true);
        // cerramos este viewSesion
        dispose();
    }//GEN-LAST:event_lblRegistroMouseClicked
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
     * Metodo que permite iniciar sesion mediante un user y un password
     * @param prmUser usuario a hacer login
     * @param prmPassword contraseña asociada al password
     * @return Verdadero si el logeo fue exitoso, falso de lo contrario
     */
    private boolean IniciarSesion(String prmUser, String prmPassword){
        daoCuenta = new clsCuentaDAO();
        daoPersona = new clsPersonaDAO();
        daoAdmin = new clsAdminDAO();
        try {
            
            // en el case de que sea admin
            clsAdmin objAdmin = new clsAdmin(prmUser, prmPassword);
            boolean esAdmin = daoAdmin.coincidenDatos(objAdmin);
            // si es admin se muestra su interfaz correspondiente
            if (esAdmin){
                frmSgte = new viewAdministrador(){
                    // con esto cuando llamemos a dispose() de frmRegUser abrimos la instancia actual de viewSesion 
                    @Override
                    public void dispose(){
                        // hacemos visible la principal
                        getFrame().setVisible(true);
                        // cerramos frmRegUser
                        super.dispose();
                    }
                };
                System.out.println("Iniciando Sesion como Admin");
                LimpiarCampos();
                return true;
            }
            // si no es admin
            else{
                int varIdActual = daoCuenta.buscarCuenta(prmUser);
                if(varIdActual != -1){
                    this.atrIdUsuarioActual = varIdActual;
                    clsPersona objPersona = new clsPersona(atrIdUsuarioActual);
                // si es un paciente se muestra su interfaz correspondiente
                    if(daoPersona.esPaciente(objPersona) == true){
                        frmSgte = new viewPaciente(){
                            // con esto cuando llamemos a dispose() de frmRegUser abrimos la instancia actual de viewSesion 
                            @Override
                            public void dispose(){
                                // hacemos visible la principal
                                getFrame().setVisible(true);
                                // cerramos frmRegUser
                                super.dispose();
                            }
                        };
                        System.out.println("Iniciando Sesion como Paciente");
                        LimpiarCampos();
                        return true;
                    }
                    if(daoPersona.esMedico(objPersona) == true){
                        frmSgte = new viewMedico(){
                            // con esto cuando llamemos a dispose() de frmRegUser abrimos la instancia actual de viewSesion 
                            @Override
                            public void dispose(){
                                // hacemos visible la principal
                                getFrame().setVisible(true);
                                // cerramos frmRegUser
                                super.dispose();
                            }
                        };
                        System.out.println("Iniciando Sesion como Medico");
                        LimpiarCampos();
                        return true;
                    }
                }           
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        this.lblErrorSesion.setVisible(true);
        return false;
    }
    /**
     * Limpia los campos del textfield txtUser y txtPassword
     */
    public static void LimpiarCampos(){
        txtUser.setText("");
        txtPassword.setText("");
    }
    
    /**
     * valida que no hayan campos vacíos, antes de ir a consultar la DB
     * @return Verdadero si hay campos vacios. Falso de lo contrario.
     */
    public boolean hayCamposVacios(){
        boolean varEstanVacios = false;
        if(this.txtUser.getText().trim().isEmpty()){
            txtUser.requestFocus();
            varEstanVacios = true;
        }
        else if(this.txtPassword.getText().trim().isEmpty()){
            txtPassword.requestFocus();
            varEstanVacios = true;
        }
        return varEstanVacios;
    }
    
    /**
     * Se obtiene la instancia actual de viewSesion
     */
    private JFrame getFrame(){
        return this;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Starter principal de ejecucion del software">
    /**
     * Starter principal de la aplicacion
     * @param args
     */
    public static void main(String args[]) {
        
        ConectaDb cc = new ConectaDb();
        viewSesion frmInicio = new viewSesion(); //Nueva instancia de view sesion
        
        if(cc.conectar()){
            frmInicio.setVisible(true);
            LimpiarCampos();
            frmInicio.lblErrorSesion.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos. Contacte con el administrador");
        }
    }
//</editor-fold>
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniSesion;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblCertificadoIcon;
    private javax.swing.JLabel lblErrorSesion;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    protected static javax.swing.JPasswordField txtPassword;
    protected static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
