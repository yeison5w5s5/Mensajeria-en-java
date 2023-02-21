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
import javax.swing.plaf.metal.MetalLookAndFeel;
import metodos.met;

/**
 *
 * @author Propietario
 */
public class inicio extends javax.swing.JFrame {
    
    met meto1= new met();
    
    int xmouse, ymouse;
    public inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        ocultar.setVisible(false);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pn_btt_salir = new javax.swing.JPanel();
        lb_salir = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paswor = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        ver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ocultar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 200));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 100, 40));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("_________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 320, 30));

        usuario.setBackground(new java.awt.Color(252, 252, 252));
        usuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 240, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("_________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 320, 30));

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 70, 40));

        paswor.setBackground(new java.awt.Color(252, 252, 252));
        paswor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        paswor.setBorder(null);
        jPanel1.add(paswor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 210, 50));

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
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, -80, 650, 30));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Iniciar");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 80, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 140, 40));

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("No estás registrado?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 160, 40));

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registrarse");
        jPanel7.add(jLabel10);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 140, 40));

        jLabel18.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 117, 158));
        jLabel18.setText("C");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 30, 40));

        jLabel19.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 0));
        jLabel19.setText("S");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 30, 40));

        jLabel20.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("I");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 30, 40));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 204, 255));
        jLabel21.setText("B");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 40, 40));

        jLabel22.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 153, 0));
        jLabel22.setText("F");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 30, 40));

        jLabel23.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 153, 0));
        jLabel23.setText("U");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 40, 40));

        jLabel24.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 204, 255));
        jLabel24.setText("T");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 30, 40));

        jLabel25.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 117, 158));
        jLabel25.setText("N");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 40, 40));

        jLabel26.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 153, 0));
        jLabel26.setText("E");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 30, 40));

        jLabel27.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 153, 0));
        jLabel27.setText("L");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, 40));

        jLabel28.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 204, 255));
        jLabel28.setText("S");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 40, 40));

        ver.setBackground(new java.awt.Color(255, 117, 158));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ver");
        ver.add(jLabel2);

        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 50, 30));

        ocultar.setBackground(new java.awt.Color(255, 153, 0));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ocultar");
        ocultar.add(jLabel4);

        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 649, 750));

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

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usuarioMouseClicked

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

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        registro a= new registro();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        String usu = usuario.getText();
        String pas = paswor.getText();
        
        
        meto1.inciar(usu, pas,this);
        meto1.MostrarUsuario();
        meto1.MostrarClub();
    }//GEN-LAST:event_jPanel6MouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        ver.setVisible(false);
        ocultar.setVisible(true);
        paswor.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        
        ocultar.setVisible(false);
        ver.setVisible(true);
        paswor.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lb_salir;
    private javax.swing.JPanel ocultar;
    private javax.swing.JPasswordField paswor;
    private javax.swing.JPanel pn_btt_salir;
    private javax.swing.JTextField usuario;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
