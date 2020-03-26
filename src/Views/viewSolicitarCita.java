/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Control.clsCitaDAO;
import Control.clsCitaMedica;
import Control.clsHorarioDAO;
import Control.clsHorarioMedico;
import Control.clsPaciente;
import Control.clsPacienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class viewSolicitarCita extends javax.swing.JFrame {

    //<editor-fold defaultstate="collapsed" desc="Atributos">
    private clsHorarioDAO daoHorario = new clsHorarioDAO();
    private clsCitaDAO daoCita = new clsCitaDAO();
    private clsPacienteDAO daoPaciente = new clsPacienteDAO();
    
    private ResultSet rsDatosObtenidosDB; // contiene una tabla con columnas: idEA, Fecha, Hora, idMedico, TarjetaProf, Medico
    private int atrFilaSeleccionada = -1;  // se inicializa en -1 para controlar el caso en el que no se seleccione ninguna fila.
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Creates new form viewSolicitarCita
     */
    public viewSolicitarCita() {
        initComponents();
        this.lblSeleccioneHorario.setVisible(false);
        this.scrlpnlTabla.setVisible(false);
        this.btnAgendar.setVisible(false);
        this.lblSelTipoEsp.setVisible(false);
        this.cbxEspecialidad.setVisible(false);
        this.btnContinuarEsp.setVisible(false);
        this.pnlSeleccionCitaGen.requestFocus();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    //</editor-fold> 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        pnlTituloAgCi = new javax.swing.JPanel();
        lblTituloSoliCita = new javax.swing.JLabel();
        pnlSolicitarCita = new java.awt.Panel();
        scrlpnlTabla = new javax.swing.JScrollPane();
        tblEspaciosDispnbls = new javax.swing.JTable();
        lblSeleccioneHorario = new javax.swing.JLabel();
        btnAgendar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        pnlSeleccionCitaGen = new javax.swing.JPanel();
        lblSeleccionCitaGen = new javax.swing.JLabel();
        pnlSeleccionCitaEsp = new javax.swing.JPanel();
        lblSeleccionCitaEsp = new javax.swing.JLabel();
        cbxEspecialidad = new javax.swing.JComboBox<>();
        lblSelTipoEsp = new javax.swing.JLabel();
        btnContinuarEsp = new javax.swing.JButton();

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(89, 98, 117));

        pnlTituloAgCi.setBackground(new java.awt.Color(89, 98, 117));

        lblTituloSoliCita.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 36)); // NOI18N
        lblTituloSoliCita.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSoliCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSoliCita.setText("Agendar una Cita");

        javax.swing.GroupLayout pnlTituloAgCiLayout = new javax.swing.GroupLayout(pnlTituloAgCi);
        pnlTituloAgCi.setLayout(pnlTituloAgCiLayout);
        pnlTituloAgCiLayout.setHorizontalGroup(
            pnlTituloAgCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloAgCiLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblTituloSoliCita, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloAgCiLayout.setVerticalGroup(
            pnlTituloAgCiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloAgCiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTituloSoliCita, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(352, 352, 352))
        );

        pnlSolicitarCita.setBackground(new java.awt.Color(245, 205, 121));
        pnlSolicitarCita.setName("pnlSolicitarCita"); // NOI18N
        pnlSolicitarCita.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEspaciosDispnbls.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEspaciosDispnbls.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblEspaciosDispnbls.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEspaciosDispnblsMouseClicked(evt);
            }
        });
        scrlpnlTabla.setViewportView(tblEspaciosDispnbls);

        pnlSolicitarCita.add(scrlpnlTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 480, 200));

        lblSeleccioneHorario.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        lblSeleccioneHorario.setText("Seleccione uno de los horarios disponibles");
        pnlSolicitarCita.add(lblSeleccioneHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        btnAgendar.setBackground(new java.awt.Color(255, 255, 255));
        btnAgendar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });
        pnlSolicitarCita.add(btnAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 100, 30));

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.setFocusPainted(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        pnlSolicitarCita.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 110, 30));

        pnlSeleccionCitaGen.setBackground(new java.awt.Color(153, 153, 153));
        pnlSeleccionCitaGen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlSeleccionCitaGen.setForeground(new java.awt.Color(204, 204, 204));
        pnlSeleccionCitaGen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeleccionCitaGen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSeleccionCitaGenMouseClicked(evt);
            }
        });
        pnlSeleccionCitaGen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSeleccionCitaGen.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        lblSeleccionCitaGen.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionCitaGen.setText("Cita con Médico General");
        pnlSeleccionCitaGen.add(lblSeleccionCitaGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        pnlSolicitarCita.add(pnlSeleccionCitaGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 250, 60));

        pnlSeleccionCitaEsp.setBackground(new java.awt.Color(153, 153, 153));
        pnlSeleccionCitaEsp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnlSeleccionCitaEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSeleccionCitaEsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSeleccionCitaEspMouseClicked(evt);
            }
        });

        lblSeleccionCitaEsp.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        lblSeleccionCitaEsp.setForeground(new java.awt.Color(255, 255, 255));
        lblSeleccionCitaEsp.setText("Cita con Especialista");

        javax.swing.GroupLayout pnlSeleccionCitaEspLayout = new javax.swing.GroupLayout(pnlSeleccionCitaEsp);
        pnlSeleccionCitaEsp.setLayout(pnlSeleccionCitaEspLayout);
        pnlSeleccionCitaEspLayout.setHorizontalGroup(
            pnlSeleccionCitaEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeleccionCitaEspLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblSeleccionCitaEsp)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlSeleccionCitaEspLayout.setVerticalGroup(
            pnlSeleccionCitaEspLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSeleccionCitaEspLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblSeleccionCitaEsp)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pnlSolicitarCita.add(pnlSeleccionCitaEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 250, 60));

        cbxEspecialidad.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        cbxEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ortopedia", "Medicina Interna", "Pediatria", "Cardiologia", "Anestesiologia", "Psiquiatria" }));
        cbxEspecialidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSolicitarCita.add(cbxEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 210, 40));

        lblSelTipoEsp.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        lblSelTipoEsp.setText("Seleccione la Especialidad");
        pnlSolicitarCita.add(lblSelTipoEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        btnContinuarEsp.setBackground(new java.awt.Color(255, 255, 255));
        btnContinuarEsp.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        btnContinuarEsp.setText("Continuar");
        btnContinuarEsp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        btnContinuarEsp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuarEsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinuarEspMouseClicked(evt);
            }
        });
        pnlSolicitarCita.add(btnContinuarEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSolicitarCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlTituloAgCi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTituloAgCi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pnlSolicitarCita, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //<editor-fold defaultstate="collapsed" desc="Eventos">
    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        boolean asigVariablesExitosa = true;
        if(atrFilaSeleccionada != -1){
            
            // se obtiene el id del horario seleccionado para posteriormente registrar la cita con ese horario
            int idHorarioSeleccionado = Integer.parseInt(tblEspaciosDispnbls.getValueAt(atrFilaSeleccionada, 0).toString());
            int varIdCita=0, varIdPago=0, varIdUsuario=0, varNumPaciente=0, varIdMed=0, varTjtaProf=0, varValor=0;
            String varEstadoCita="", varFecha="", varHora="";
            
            try {             
                // se apunta a la primera fila del ResultSet
                rsDatosObtenidosDB.first();
                int id;
                // se recorre el resultset hasta encontrar la fila seleccionada para tomar los datos que se necesitan (que no se mostraron en el jTable)
                while (rsDatosObtenidosDB.next()) {
                    id = Integer.parseInt(rsDatosObtenidosDB.getObject(1).toString());
                    if (id == idHorarioSeleccionado){
                        // rompe el ciclo pero el ResultSet queda apuntando a la fila que necesitamos
                        break;
                    }
                }
                varIdUsuario = viewSesion.atrIdUsuarioActual;
                clsPaciente objPaciente = new clsPaciente(varIdUsuario);
                varNumPaciente = daoPaciente.getNumPacienteById(objPaciente);
                
                if(varNumPaciente == -1){
                    JOptionPane.showMessageDialog(null, "No se pudo agendar la cita por favor verifique los datos.");
                    return;
                }
                
                varIdCita = daoCita.contarFilas();                
                // se obtiene el id del medico de la fila seleccionada. "idMedico" es la columna 4 del Resultset.
                varIdMed = Integer.parseInt(rsDatosObtenidosDB.getObject(4).toString());
                varTjtaProf = Integer.parseInt(rsDatosObtenidosDB.getObject(5).toString());
                varValor = 60000;  // dando un valor cualquiera
                varFecha = rsDatosObtenidosDB.getObject(2).toString();
                varHora = rsDatosObtenidosDB.getObject(3).toString();
                                
            } catch (SQLException ex) {
                Logger.getLogger(viewSolicitarCita.class.getName()).log(Level.SEVERE, null, ex);
                asigVariablesExitosa = false;
            }
            
            // si no hubieron problemas asignando valores a las variables
            if (asigVariablesExitosa == true){
                
                clsCitaMedica objCita = new clsCitaMedica(varIdCita, varIdUsuario, varNumPaciente, varIdMed, varTjtaProf, varValor, varFecha, varHora);
                                
                boolean varSeAgendo = false;
                try {
                    varSeAgendo = daoCita.registrarCita(objCita);
                } catch (SQLException ex) {
                    Logger.getLogger(viewAsignarHorario.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if(varSeAgendo == true){
                    clsHorarioMedico objHorario = new clsHorarioMedico(idHorarioSeleccionado);
                    objHorario.setEstado("No Disponible");
                    daoHorario.actualizarEstado(objHorario);
                    JOptionPane.showMessageDialog(null, "Cita agendada.");
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se pudo agendar la cita por favor verifique los datos.");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "No se pudo agendar la cita por favor verifique los datos.");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar uno de los horarios disponibles.", "Info Horario", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void tblEspaciosDispnblsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEspaciosDispnblsMouseClicked
        // se obtiene la fila seleccionada 
        this.atrFilaSeleccionada = tblEspaciosDispnbls.rowAtPoint(evt.getPoint());
    }//GEN-LAST:event_tblEspaciosDispnblsMouseClicked

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // dependiendo de qué componentes estén activados, realizará una cosa u otra
        if(this.pnlSeleccionCitaGen.isVisible() == true){
            // si se está visualizando el menú cita general o especialista
            dispose();
        }
        else if(this.cbxEspecialidad.isVisible() == true){
            // si se está visualizando el combobox de especialidades
            this.lblSelTipoEsp.setVisible(false);
            this.cbxEspecialidad.setVisible(false);
            this.btnContinuarEsp.setVisible(false);
            this.pnlSeleccionCitaGen.setVisible(true);
            this.pnlSeleccionCitaEsp.setVisible(true);
        }
        else{
            // si está visualizandose el JTable
            this.lblSeleccioneHorario.setVisible(false);
            this.scrlpnlTabla.setVisible(false);
            this.btnAgendar.setVisible(false);
            this.pnlSeleccionCitaGen.setVisible(true);
            this.pnlSeleccionCitaEsp.setVisible(true);
        }
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void pnlSeleccionCitaGenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSeleccionCitaGenMouseClicked
        boolean seObtuvoDatos = obtenerDatos("General");
        if(seObtuvoDatos == true){
            cargarTabla(true);
            this.pnlSeleccionCitaGen.setVisible(false);
            this.pnlSeleccionCitaEsp.setVisible(false);
            this.lblSeleccioneHorario.setVisible(true);
            this.scrlpnlTabla.setVisible(true);
            this.btnAgendar.setVisible(true);
        }
        this.pnlSolicitarCita.requestFocus();
    }//GEN-LAST:event_pnlSeleccionCitaGenMouseClicked

    private void pnlSeleccionCitaEspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSeleccionCitaEspMouseClicked
        this.pnlSeleccionCitaGen.setVisible(false);
        this.pnlSeleccionCitaEsp.setVisible(false);
        
        this.lblSelTipoEsp.setVisible(true);
        this.cbxEspecialidad.setVisible(true);
        this.btnContinuarEsp.setVisible(true);
        
    }//GEN-LAST:event_pnlSeleccionCitaEspMouseClicked

    private void btnContinuarEspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinuarEspMouseClicked
        
        String varEspecialidad = this.cbxEspecialidad.getSelectedItem().toString();
        boolean seObtuvoDatos = obtenerDatos(varEspecialidad);
        if(seObtuvoDatos == true){
            cargarTabla(true);
            this.lblSelTipoEsp.setVisible(false);
            this.cbxEspecialidad.setVisible(false);
            this.btnContinuarEsp.setVisible(false);
            this.lblSeleccioneHorario.setVisible(true);
            this.scrlpnlTabla.setVisible(true);
            this.btnAgendar.setVisible(true);
        }
        this.pnlSolicitarCita.requestFocus();
        
    }//GEN-LAST:event_btnContinuarEspMouseClicked
    //</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc="Metodos">
    /**
    *    Se obtiene un Resultset con los datos que resultan útiles y necesarios para agendar una cita.
    **/
    private boolean obtenerDatos(String prmEspecialidad){               
        ResultSet rs;
        try {
            rs = daoHorario.obtenerTabla(prmEspecialidad);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentran horarios disponibles.\nPor favor intente mas tarde.", "Info", JOptionPane.INFORMATION_MESSAGE);
            Logger.getLogger(viewSolicitarCita.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        rsDatosObtenidosDB = rs;
        if(rsDatosObtenidosDB == null){
            JOptionPane.showMessageDialog(null, "No se encuentran horarios disponibles para el tipo de cita solicitado.\nPor favor intente mas tarde.", "Info", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
        
    }
    
    /**
    *    Se cargan los datos del ResultSet al JTable. Unicamente los datos que se desean mostrar al usuario.
    **/
    public void cargarTabla(boolean prmEsCitaGeneral){
        DefaultTableModel varModeloTabla = new DefaultTableModel(); 
        // se agregan columnas al JTable
        if(prmEsCitaGeneral == true){
            varModeloTabla.setColumnIdentifiers(new Object[]{"Id", "Fecha", "Hora", "Medico"});
            try {
                while (rsDatosObtenidosDB.next()) {
                    // añade los resultados al modelo de tabla
                    varModeloTabla.addRow(new Object[]{rsDatosObtenidosDB.getString("idEA"), rsDatosObtenidosDB.getString("Fecha"), rsDatosObtenidosDB.getString("Hora"), rsDatosObtenidosDB.getString("Medico")});
                }            
                // asigna el modelo a la tabla
                tblEspaciosDispnbls.setModel(varModeloTabla);            
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        else{
            varModeloTabla.setColumnIdentifiers(new Object[]{"Id", "Fecha", "Hora", "Medico", "Especialidad"});
            try {
                while (rsDatosObtenidosDB.next()) {
                    // añade los resultados al modelo de tabla
                    varModeloTabla.addRow(new Object[]{rsDatosObtenidosDB.getString("idEA"), rsDatosObtenidosDB.getString("Fecha"), rsDatosObtenidosDB.getString("Hora"), rsDatosObtenidosDB.getString("Medico"), rsDatosObtenidosDB.getString("Especialidad")});
                }            
                // asigna el modelo a la tabla
                tblEspaciosDispnbls.setModel(varModeloTabla);            
            } catch (Exception e) {
                System.out.println(e);
            }   
        }  
    }
    //</editor-fold> 

    //<editor-fold defaultstate="collapsed" desc="Starter">
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewSolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewSolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewSolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewSolicitarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewSolicitarCita().setVisible(true);
            }
        });
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Componentes Swing">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnContinuarEsp;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cbxEspecialidad;
    private javax.swing.JLabel lblSelTipoEsp;
    private javax.swing.JLabel lblSeleccionCitaEsp;
    private javax.swing.JLabel lblSeleccionCitaGen;
    private javax.swing.JLabel lblSeleccioneHorario;
    private javax.swing.JLabel lblTituloSoliCita;
    private java.awt.Panel panel1;
    private javax.swing.JPanel pnlSeleccionCitaEsp;
    private javax.swing.JPanel pnlSeleccionCitaGen;
    private java.awt.Panel pnlSolicitarCita;
    private javax.swing.JPanel pnlTituloAgCi;
    private javax.swing.JScrollPane scrlpnlTabla;
    private javax.swing.JTable tblEspaciosDispnbls;
    // End of variables declaration//GEN-END:variables
    //</editor-fold> 

}
