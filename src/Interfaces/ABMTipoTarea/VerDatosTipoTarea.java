/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.ABMTipoTarea;

import Interfaces.ABMSector.*;
import DTO.DTOsSector.DTOSector;
import DTO.DTOTipoTarea;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author leand
 */
public class VerDatosTipoTarea extends javax.swing.JFrame {

    /**
     * Creates new form VerDatos
     */
    public VerDatosTipoTarea(DTOTipoTarea dtoTipoTarea) {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Datos Tipo Tarea");
        verCodTipoTarea.setForeground(Color.black);
        verNombTipoTarea.setForeground(Color.black);
        verDescTipoTarea.setForeground(Color.black);
        verCodTipoTarea.setText(Integer.toString(dtoTipoTarea.getCodTipoTarea()));
        verNombTipoTarea.setText(dtoTipoTarea.getNombreTipoTarea());
        verDescTipoTarea.setText(dtoTipoTarea.getDescripcionTipoTarea());
        if(dtoTipoTarea.getFechaHoraFinVigenciaTipoTarea() == null){
            verFechaFinTipoTarea.setText("vigente");
        }else{
            DateFormat df = new SimpleDateFormat();
            Date fecha = dtoTipoTarea.getFechaHoraFinVigenciaTipoTarea();
            String fechaString = df.format(fecha);
            verFechaFinTipoTarea.setText(fechaString);
        }
    }
    private VerDatosTipoTarea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labeldescver = new javax.swing.JLabel();
        botonContinuar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelTituloMostrar = new javax.swing.JLabel();
        labelcodver = new javax.swing.JLabel();
        verCodTipoTarea = new javax.swing.JTextField();
        labelnombver = new javax.swing.JLabel();
        verNombTipoTarea = new javax.swing.JTextField();
        labelFechaFinver = new javax.swing.JLabel();
        verFechaFinTipoTarea = new javax.swing.JTextField();
        verDescTipoTarea = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        labeldescver.setBackground(new java.awt.Color(0, 0, 0));
        labeldescver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labeldescver.setText("Descripción Tipo Tarea:");

        botonContinuar.setBackground(new java.awt.Color(204, 204, 204));
        botonContinuar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonContinuar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/baseline_arrow_back_black_18dp.png"))); // NOI18N
        botonContinuar.setMnemonic('v');
        botonContinuar.setText("Volver");
        botonContinuar.setBorder(null);
        botonContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonContinuar.setPreferredSize(new java.awt.Dimension(120, 36));
        botonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContinuarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(119, 148, 166));

        labelTituloMostrar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTituloMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ojonegro.png"))); // NOI18N
        labelTituloMostrar.setText("DATOS TIPO TAREA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(labelTituloMostrar)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelTituloMostrar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        labelcodver.setBackground(new java.awt.Color(0, 0, 0));
        labelcodver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelcodver.setText("Cod. Tipo Tarea:");

        verCodTipoTarea.setEditable(false);
        verCodTipoTarea.setBackground(new java.awt.Color(153, 153, 153));
        verCodTipoTarea.setBorder(null);
        verCodTipoTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCodTipoTareaActionPerformed(evt);
            }
        });
        verCodTipoTarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verCodTipoTareaKeyTyped(evt);
            }
        });

        labelnombver.setBackground(new java.awt.Color(0, 0, 0));
        labelnombver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelnombver.setText("Nombre Tipo Tarea:");

        verNombTipoTarea.setEditable(false);
        verNombTipoTarea.setBackground(new java.awt.Color(153, 153, 153));
        verNombTipoTarea.setBorder(null);
        verNombTipoTarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verNombTipoTareaKeyTyped(evt);
            }
        });

        labelFechaFinver.setBackground(new java.awt.Color(0, 0, 0));
        labelFechaFinver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelFechaFinver.setText("Fecha Fin Vigencia :");

        verFechaFinTipoTarea.setEditable(false);
        verFechaFinTipoTarea.setBackground(new java.awt.Color(153, 153, 153));
        verFechaFinTipoTarea.setBorder(null);
        verFechaFinTipoTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verFechaFinTipoTareaActionPerformed(evt);
            }
        });
        verFechaFinTipoTarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verFechaFinTipoTareaKeyTyped(evt);
            }
        });

        verDescTipoTarea.setBackground(new java.awt.Color(153, 153, 153));
        verDescTipoTarea.setBorder(null);
        verDescTipoTarea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                verDescTipoTareaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelnombver)
                            .addComponent(verNombTipoTarea, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(labeldescver)
                            .addComponent(verDescTipoTarea)
                            .addComponent(labelcodver)
                            .addComponent(verFechaFinTipoTarea)
                            .addComponent(labelFechaFinver)
                            .addComponent(verCodTipoTarea)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(labelcodver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verCodTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelnombver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verNombTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labeldescver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verDescTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelFechaFinver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verFechaFinTipoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(botonContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContinuarActionPerformed
        //Botón para volver al menú de sector
       ABMTipoTarea ambtt = new ABMTipoTarea();
       ambtt.setVisible(false);
       this.setVisible(false);
       //VerDatosTipoTarea a = new VerDatosTipoTarea();
       // ambtt.setVisible(true);
       //this.setVisible(false);
    }//GEN-LAST:event_botonContinuarActionPerformed

    private void verCodTipoTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCodTipoTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verCodTipoTareaActionPerformed

    private void verCodTipoTareaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verCodTipoTareaKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < '0' || car > '9') && (car != (char) KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "Por favor el campo solo admite numeros", "Mensaje de Error Codigo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verCodTipoTareaKeyTyped

    private void verNombTipoTareaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verNombTipoTareaKeyTyped

        //Declaramos una variable y asignamos un evento
        char car = evt.getKeyChar();

        //Condicion
        if ((car < 'a'||  car > 'z') && (car < 'A' ||  car > 'Z') && (car < '0' || car > '9') && (car == (char) KeyEvent.VK_BACK_SPACE) && (car == (char) KeyEvent.VK_SPACE) ) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El campo no admite caracteres especiales", "Mensaje de Error Nombre", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_verNombTipoTareaKeyTyped

    private void verFechaFinTipoTareaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verFechaFinTipoTareaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinTipoTareaKeyTyped

    private void verDescTipoTareaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_verDescTipoTareaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_verDescTipoTareaKeyTyped

    private void verFechaFinTipoTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verFechaFinTipoTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verFechaFinTipoTareaActionPerformed

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
            java.util.logging.Logger.getLogger(VerDatosTipoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerDatosTipoTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerDatosTipoTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContinuar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFechaFinver;
    private javax.swing.JLabel labelTituloMostrar;
    private javax.swing.JLabel labelcodver;
    private javax.swing.JLabel labeldescver;
    private javax.swing.JLabel labelnombver;
    private javax.swing.JTextField verCodTipoTarea;
    private javax.swing.JTextField verDescTipoTarea;
    private javax.swing.JTextField verFechaFinTipoTarea;
    private javax.swing.JTextField verNombTipoTarea;
    // End of variables declaration//GEN-END:variables
}