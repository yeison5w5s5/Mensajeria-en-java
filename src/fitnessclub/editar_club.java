/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub;





import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.plaf.metal.MetalLookAndFeel;

import metodos.conexion;
import metodos.met;


/**
 *
 * @author Propietario
 */
public class editar_club extends javax.swing.JFrame {

    met meto1= new met();
    
    conexion c = new conexion();
    Connection con = c.conectar(); // conexion base de datos

    
    int xmouse, ymouse;
    public editar_club() {
        initComponents();
        this.setLocationRelativeTo(null);
        meto1.mostrar(nombre1,descri,nivel1,canti,dapor);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pn_btt_salir = new javax.swing.JPanel();
        lb_salir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombre1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        descri = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        crear = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        nivelbox = new javax.swing.JComboBox<>();
        nivel1 = new javax.swing.JLabel();
        valor = new javax.swing.JSlider();
        canti = new javax.swing.JLabel();
        combo_dp = new javax.swing.JComboBox<>();
        dapor = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 200));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_btt_salir.setBackground(new java.awt.Color(252, 252, 252));
        pn_btt_salir.setForeground(new java.awt.Color(255, 255, 255));
        pn_btt_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_salir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lb_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_salir.setText("X");
        lb_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lb_salirMousePressed(evt);
            }
        });
        pn_btt_salir.add(lb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel1.add(pn_btt_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 10, 830));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 20, 840));

        jPanel4.setBackground(new java.awt.Color(255, 117, 158));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 10, 830));

        jPanel5.setBackground(new java.awt.Color(252, 252, 252));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 30));

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 117, 158));
        jLabel5.setText("L");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 30, 40));

        jLabel6.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nombre de el club");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 230, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("_________________________________");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 320, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("_________________________________");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 320, 30));

        nombre1.setBackground(new java.awt.Color(252, 252, 252));
        nombre1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        nombre1.setForeground(new java.awt.Color(102, 102, 102));
        nombre1.setBorder(null);
        nombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombre1MouseClicked(evt);
            }
        });
        nombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre1ActionPerformed(evt);
            }
        });
        jPanel1.add(nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 240, 40));

        jLabel11.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Deporte");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 230, 40));

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Descripción");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 230, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("_________________________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 320, 30));

        descri.setBackground(new java.awt.Color(252, 252, 252));
        descri.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        descri.setForeground(new java.awt.Color(102, 102, 102));
        descri.setBorder(null);
        descri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descriMouseClicked(evt);
            }
        });
        descri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriActionPerformed(evt);
            }
        });
        jPanel1.add(descri, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 270, 50));

        jLabel14.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Nivel de juego");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 230, 40));

        jLabel16.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Cantidad máxima de miembros");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 270, 40));

        crear.setBackground(new java.awt.Color(0, 204, 255));
        crear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearMouseClicked(evt);
            }
        });
        crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Guardar");
        crear.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jPanel1.add(crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 120, 50));

        jLabel20.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("A");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 30, 40));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("B");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 40, 40));

        jLabel22.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 204, 255));
        jLabel22.setText("C");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 30, 40));

        jLabel23.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("E");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 30, 40));

        jLabel24.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 0));
        jLabel24.setText("D");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 30, 40));

        jLabel25.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 204, 255));
        jLabel25.setText("I");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 30, 40));

        jLabel26.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 117, 158));
        jLabel26.setText("T");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 30, 40));

        jLabel27.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 153, 0));
        jLabel27.setText("R");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 40, 40));

        jLabel28.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 153, 0));
        jLabel28.setText("U");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 40, 40));

        nivelbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basico", "Intermedio", "Avanzado" }));
        nivelbox.setSelectedIndex(-1);
        nivelbox.setToolTipText("");
        nivelbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nivelboxItemStateChanged(evt);
            }
        });
        jPanel1.add(nivelbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 180, 40));
        jPanel1.add(nivel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 100, 40));

        valor.setMajorTickSpacing(1);
        valor.setMinimum(5);
        valor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                valorStateChanged(evt);
            }
        });
        jPanel1.add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        canti.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        canti.setForeground(new java.awt.Color(102, 102, 102));
        canti.setText("50");
        jPanel1.add(canti, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 40, 40));

        combo_dp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VoleyBall", "BasquetBall", "Futbol", "Natacion", "Golf", "Badminton", "Tenis", "Futsal", "MicroFutbol", "Atletismo", "Senderismo", "Siclismo", "Patinage", "Motocros", "BMX", "Skate" }));
        combo_dp.setSelectedIndex(-1);
        combo_dp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_dpItemStateChanged(evt);
            }
        });
        jPanel1.add(combo_dp, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 200, 40));
        jPanel1.add(dapor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 150, 40));

        jPanel7.setBackground(new java.awt.Color(255, 117, 158));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("volver");
        jPanel7.add(jLabel29);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 660, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 649, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMousePressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_lb_salirMousePressed

    private void lb_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMouseExited
        // TODO add your handling code here:
        
        pn_btt_salir.setBackground(Color.WHITE);
        lb_salir.setForeground(Color.BLACK);
        
        
       
    }//GEN-LAST:event_lb_salirMouseExited

    private void lb_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMouseEntered
        // TODO add your handling code here:
        
        pn_btt_salir.setBackground(new Color(255,117,158));
        lb_salir.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_lb_salirMouseEntered

    private void lb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lb_salirMouseClicked

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
    xmouse=evt.getX();
    ymouse=evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
        // TODO add your handling code here:
    int x=evt.getXOnScreen();
    int y=evt.getYOnScreen();
    this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel5MouseDragged

    private void nombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_nombre1MouseClicked

    private void nombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre1ActionPerformed

    private void descriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descriMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_descriMouseClicked

    private void descriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriActionPerformed

    private void valorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_valorStateChanged
        // TODO add your handling code here:
        canti.setText(""+valor.getValue());
    }//GEN-LAST:event_valorStateChanged

    private void combo_dpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_dpItemStateChanged
        String selec=(String) combo_dp.getSelectedItem();
        dapor.setText(selec);
    }//GEN-LAST:event_combo_dpItemStateChanged

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        Chat_Club a= new Chat_Club();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void crearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearMouseClicked
        String nombre = nombre1.getText();
        String deporte= dapor.getText();
        String descripcion = descri.getText();
        String nivel=nivel1.getText();
        int cantidad=valor.getValue();
        meto1.editarClub(nombre, deporte, descripcion, nivel, cantidad,this);
        
        meto1.MostrarClub();
        
    }//GEN-LAST:event_crearMouseClicked

    private void nivelboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nivelboxItemStateChanged
        // TODO add your handling code here:
        
        String selec=(String) nivelbox.getSelectedItem();
        nivel1.setText(selec);
        
    }//GEN-LAST:event_nivelboxItemStateChanged

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
            java.util.logging.Logger.getLogger(editar_club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new editar_club().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel canti;
    private javax.swing.JComboBox<String> combo_dp;
    private javax.swing.JPanel crear;
    private javax.swing.JLabel dapor;
    private javax.swing.JTextField descri;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lb_salir;
    private javax.swing.JLabel nivel1;
    private javax.swing.JComboBox<String> nivelbox;
    private javax.swing.JTextField nombre1;
    private javax.swing.JPanel pn_btt_salir;
    private javax.swing.JSlider valor;
    // End of variables declaration//GEN-END:variables
}