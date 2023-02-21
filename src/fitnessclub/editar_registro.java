
package fitnessclub;


import metodos.ProvinciaDAO;
import metodos.DepartamentoDAO;
import  metodos.conexion;
import java.awt.Color;
import java.sql.*;

import metodos.DepartamentoVO;
import metodos.ProvinciaVO;
import metodos.Teclado;
import metodos.met;



public class editar_registro extends javax.swing.JFrame {

    met metolo= new met();
    Teclado t=new Teclado();
    conexion c = new conexion();
    Connection con = c.conectar();
    DepartamentoDAO de = new DepartamentoDAO();
    ProvinciaDAO pr = new ProvinciaDAO();
   
    int xmouse, ymouse;
    String txtSalida;
    public editar_registro(){
        initComponents();
        this.setLocationRelativeTo(null);
        
        de.listar_departamento(combo_de);
        ocultar.setVisible(false);
        metolo.editarusu1(usuario, correo, area1, tel, pasword);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pn_btt_salir = new javax.swing.JPanel();
        lb_salir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        pasword = new javax.swing.JPasswordField();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        combo_de = new javax.swing.JComboBox<>();
        combo_pr = new javax.swing.JComboBox<>();
        area1 = new javax.swing.JLabel();
        ocultar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel4.setText("FITNESSCLUB");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 200));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
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

        jLabel5.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nombre Completo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 230, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("_________________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 320, 30));

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

        jLabel8.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Correo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 230, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("_________________________________");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 320, 30));

        jLabel10.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Departamento");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 230, 40));

        jLabel12.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Teléfono");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("_________________________________");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 320, 30));

        jLabel14.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Ciudad");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 230, 40));

        jLabel3.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Contraseña");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("_________________________________");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 320, 30));

        usuario.setBackground(new java.awt.Color(252, 252, 252));
        usuario.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
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
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 240, 50));

        correo.setBackground(new java.awt.Color(252, 252, 252));
        correo.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        correo.setBorder(null);
        correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                correoMouseClicked(evt);
            }
        });
        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 240, 50));

        tel.setBackground(new java.awt.Color(252, 252, 252));
        tel.setFont(new java.awt.Font("Eras Demi ITC", 0, 18)); // NOI18N
        tel.setBorder(null);
        tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telMouseClicked(evt);
            }
        });
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 240, 50));

        pasword.setBackground(new java.awt.Color(252, 252, 252));
        pasword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pasword.setBorder(null);
        pasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paswordMouseClicked(evt);
            }
        });
        pasword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paswordActionPerformed(evt);
            }
        });
        jPanel1.add(pasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 210, 50));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Eras Demi ITC", 0, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Guardar");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 30));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 610, 130, 50));

        jLabel20.setFont(new java.awt.Font("Eras Demi ITC", 2, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 117, 158));
        jLabel20.setText("Editar");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 150, 40));

        jLabel21.setFont(new java.awt.Font("Eras Demi ITC", 2, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 204, 255));
        jLabel21.setText("Perfil");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 130, 40));

        jPanel7.setBackground(new java.awt.Color(255, 117, 158));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Eras Demi ITC", 0, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("volver");
        jPanel7.add(jLabel25);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 680, -1, -1));

        combo_de.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_deItemStateChanged(evt);
            }
        });
        combo_de.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_deMouseClicked(evt);
            }
        });
        jPanel1.add(combo_de, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 30));

        combo_pr.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_prItemStateChanged(evt);
            }
        });
        combo_pr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_prMouseClicked(evt);
            }
        });
        jPanel1.add(combo_pr, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 210, 30));

        area1.setText("jLabel2");
        jPanel1.add(area1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 100, 30));

        ocultar.setBackground(new java.awt.Color(255, 153, 0));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ocultar");
        ocultar.add(jLabel7);

        jPanel1.add(ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 80, 30));

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

        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 50, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 649, 825));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void correoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_correoMouseClicked

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void telMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telMouseClicked
        // TODO add your handling code here:
        String email = correo.getText();
        metolo.correo(email);
    }//GEN-LAST:event_telMouseClicked

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        usuario a= new usuario();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked

        
        String nombre = usuario.getText();
        String email = correo.getText();
        String tele = tel.getText();
        String ciudad = area1.getText();
        String paswor = pasword.getText();
        
                        
        metolo.editarusu2(nombre, email, tele,ciudad,paswor,this);
        
        
    }//GEN-LAST:event_jPanel6MouseClicked

    private void paswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paswordActionPerformed

    private void lb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lb_salirMouseClicked

    private void lb_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMouseEntered
        // TODO add your handling code here:

        pn_btt_salir.setBackground(new Color(255,117,158));
        lb_salir.setForeground(Color.WHITE);

    }//GEN-LAST:event_lb_salirMouseEntered

    private void lb_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMouseExited
        // TODO add your handling code here:

        pn_btt_salir.setBackground(Color.WHITE);
        lb_salir.setForeground(Color.BLACK);

    }//GEN-LAST:event_lb_salirMouseExited

    private void lb_salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_salirMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_lb_salirMousePressed

    private void combo_deItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_deItemStateChanged
        DepartamentoVO d_vo = (DepartamentoVO)this.combo_de.getSelectedItem();
        int id_de = d_vo.getId_region();
        String n = d_vo.getDepartamento();
        
        
        pr.listar_provincia(combo_pr, id_de);
    }//GEN-LAST:event_combo_deItemStateChanged

    private void combo_prItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_prItemStateChanged
        ProvinciaVO p_vo = (ProvinciaVO)this.combo_pr.getSelectedItem();
        int id_di = p_vo.getId_ciudades();
        String n = p_vo.getProvincia();
        area1.setText(n);
    }//GEN-LAST:event_combo_prItemStateChanged

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        // TODO add your handling code here:
        t.SoloNumeros(evt);
    }//GEN-LAST:event_telKeyTyped

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked

        ocultar.setVisible(false);
        ver.setVisible(true);
        pasword.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        // TODO add your handling code here:
        ver.setVisible(false);
        ocultar.setVisible(true);
        pasword.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void combo_deMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_deMouseClicked
        String email = correo.getText();
        metolo.correo(email);
    }//GEN-LAST:event_combo_deMouseClicked

    private void combo_prMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_prMouseClicked
        String email = correo.getText();
        metolo.correo(email);
    }//GEN-LAST:event_combo_prMouseClicked

    private void paswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paswordMouseClicked
        String email = correo.getText();
        metolo.correo(email);
    }//GEN-LAST:event_paswordMouseClicked

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        // TODO add your handling code here:
        t.SoloLetras(evt);
    }//GEN-LAST:event_usuarioKeyTyped

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
            java.util.logging.Logger.getLogger(editar_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editar_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editar_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editar_registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            
                new editar_registro().setVisible(true);
                    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel area1;
    private javax.swing.JComboBox<String> combo_de;
    private javax.swing.JComboBox<String> combo_pr;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPasswordField pasword;
    private javax.swing.JPanel pn_btt_salir;
    private javax.swing.JTextField tel;
    private javax.swing.JTextField usuario;
    private javax.swing.JPanel ver;
    // End of variables declaration//GEN-END:variables
}
