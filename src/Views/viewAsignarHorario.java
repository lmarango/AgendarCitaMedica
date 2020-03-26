
package Views;

import Control.clsHorarioDAO;
import Control.clsHorarioMedico;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class viewAsignarHorario extends javax.swing.JFrame {
    
    private clsHorarioDAO daoHorario = new clsHorarioDAO();

    public viewAsignarHorario() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHorarioMed = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        lblIdPersona = new javax.swing.JLabel();
        txtIdPersona = new javax.swing.JTextField();
        lblIdMedico = new javax.swing.JLabel();
        txtIdMedico = new javax.swing.JTextField();
        lblHoraInicio = new javax.swing.JLabel();
        txtHoraInicio = new javax.swing.JTextField();
        lblHoraSalida = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();
        BtnRegresar = new javax.swing.JButton();
        BtnAsignarHorario = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(390, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHorarioMed.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHorarioMed.setText("       ASIGNAR HORARIO MEDICO");
        getContentPane().add(lblHorarioMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFecha.setText("Fecha:");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 150, -1));

        lblIdPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIdPersona.setText("Id Persona");
        getContentPane().add(lblIdPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, -1, -1));
        getContentPane().add(txtIdPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 151, -1));

        lblIdMedico.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIdMedico.setText("ID Medico:");
        getContentPane().add(lblIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));
        getContentPane().add(txtIdMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 151, -1));

        lblHoraInicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHoraInicio.setText("Hora Inicio:");
        getContentPane().add(lblHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));
        getContentPane().add(txtHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 151, -1));

        lblHoraSalida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHoraSalida.setText("Hora Salida:");
        getContentPane().add(lblHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));
        getContentPane().add(txtHoraSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 151, -1));

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        BtnAsignarHorario.setText("Asignar Horario");
        BtnAsignarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAsignarHorarioActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAsignarHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/AsignarHorarioMedico.jpg"))); // NOI18N
        lblFondo.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(51, 51, 255)));
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnAsignarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAsignarHorarioActionPerformed
        //<editor-fold defaultstate="collapsed" desc="Asignación de variables">
        int varIdHorario = 1;
         try {
             varIdHorario = daoHorario.contarFilas();
         } catch (SQLException ex) {
             Logger.getLogger(viewAsignarHorario.class.getName()).log(Level.SEVERE, null, ex);
         }
        int varIdPersona = Integer.parseInt(txtIdPersona.getText());
        int varIdMedico = Integer.parseInt(txtIdMedico.getText());
        Date tempFecha = txtFecha.getDate();
        DateFormat f= new SimpleDateFormat("yyyy/MM/dd");
        String varFecha = f.format(tempFecha);
        String varHoraEntrada = txtHoraInicio.getText();
        String varHoraSalida = txtHoraSalida.getText();
        String varEstado = "Disponible"; 
        //</editor-fold>
        clsHorarioMedico miHorario = new clsHorarioMedico(varIdHorario, varIdPersona, varIdMedico, varEstado, varFecha, varHoraEntrada, varHoraSalida);
        
        
        boolean varSeAsigno = false;
         try {
             varSeAsigno = daoHorario.asignarHorarioAtencion(miHorario);
         } catch (SQLException ex) {
             Logger.getLogger(viewAsignarHorario.class.getName()).log(Level.SEVERE, null, ex);
         }
        if(varSeAsigno == true)
        {
            JOptionPane.showMessageDialog(null, "Se asigno el horario al medico correctamente.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "No se pudo asignar el horario al medico, por favor verifique los datos.");
        }
        
        
    }//GEN-LAST:event_BtnAsignarHorarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAsignarHorario;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblHoraInicio;
    private javax.swing.JLabel lblHoraSalida;
    private javax.swing.JLabel lblHorarioMed;
    private javax.swing.JLabel lblIdMedico;
    private javax.swing.JLabel lblIdPersona;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtHoraInicio;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtIdMedico;
    private javax.swing.JTextField txtIdPersona;
    // End of variables declaration//GEN-END:variables
}