/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitnessclub;

import java.awt.Color;
import javax.swing.JOptionPane;
import metodos.met;
import metodos.traerdatos;

/**
 *
 * @author xifoi
 */
public class Chat_Club extends javax.swing.JFrame {

    /**
     * Creates new form Chat_Club
     */
    met meto2= new met();
    traerdatos traer = new traerdatos();
    public Chat_Club() {
        initComponents();
        String nom_club=traer.getNom_club2();
        String nom_admin=traer.getNom_admin();
        int id_admin=traer.getId_admin();
        int id=traer.getId_usu();
        if (id_admin!=id){
            eliminar.setVisible(false);
            editar.setVisible(false);
        }else{
         salirclu.setVisible(false);}
        nom_club1.setText(nom_club);
        nom_admin1.setText(nom_admin);
        setLocationRelativeTo(null);
        meto2.tabla_mensajes(0, null, men);
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
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        msj = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pn_btt_salir = new javax.swing.JPanel();
        lb_salir = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nom_club1 = new javax.swing.JLabel();
        nom_admin1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        men = new javax.swing.JTable();
        eliminar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salirclu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        editar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1500, 40));

        jPanel4.setBackground(new java.awt.Color(255, 117, 158));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1480, 10));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 140, 1560, -1));

        msj.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        msj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                msjMouseClicked(evt);
            }
        });
        msj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msjActionPerformed(evt);
            }
        });
        jPanel1.add(msj, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 780, 40));

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("enviar");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(10, 0, 80, 34);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 100, 40));

        jPanel6.setBackground(new java.awt.Color(252, 252, 252));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel6MouseDragged(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });
        jPanel6.setLayout(null);

        pn_btt_salir.setBackground(new java.awt.Color(252, 252, 252));
        pn_btt_salir.setForeground(new java.awt.Color(255, 255, 255));
        pn_btt_salir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_salir.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        lb_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_salir.setText("X ");
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
        pn_btt_salir.add(lb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        jPanel6.add(pn_btt_salir);
        pn_btt_salir.setBounds(1100, 0, 40, 30);

        jLabel4.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("nombre club:");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(260, 0, 150, 34);

        jLabel2.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("nombre admin");
        jPanel6.add(jLabel2);
        jLabel2.setBounds(670, 0, 190, 34);

        jPanel7.setBackground(new java.awt.Color(255, 117, 158));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("volver");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel7);
        jPanel7.setBounds(1000, 0, 89, 30);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-220, 0, 1140, 30));

        nom_club1.setFont(new java.awt.Font("Eras Demi ITC", 0, 28)); // NOI18N
        jPanel1.add(nom_club1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 390, 40));

        nom_admin1.setFont(new java.awt.Font("Eras Demi ITC", 0, 28)); // NOI18N
        jPanel1.add(nom_admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 430, 40));

        jScrollPane2.setBorder(null);

        men.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        men.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        men.setRowHeight(50);
        jScrollPane2.setViewportView(men);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 780, 370));

        eliminar.setBackground(new java.awt.Color(255, 153, 0));
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });
        eliminar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eliminar");
        eliminar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Club");
        eliminar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 170, 110, 70));

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eliminar");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 0, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("mensaje");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 110, 50));

        salirclu.setBackground(new java.awt.Color(255, 153, 0));
        salirclu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salircluMouseClicked(evt);
            }
        });
        salirclu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salir de ");
        salirclu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Club");
        salirclu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 36, -1, 21));

        jPanel1.add(salirclu, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, 110, 70));

        editar.setBackground(new java.awt.Color(255, 153, 0));
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });
        editar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Editar");
        editar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Club");
        editar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel1.add(editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 110, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jPanel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        int xmouse = 0;
        int ymouse = 0;
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_jPanel6MouseDragged

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        // TODO add your handling code here:
        int xmouse = evt.getX();
        int ymouse = evt.getY();
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        String mensaje= msj.getText();
        meto2.enviarmsj(mensaje);
        msj.setText("");
        meto2.tabla_mensajes(0, null, men);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void msjMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_msjMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_msjMouseClicked

    private void msjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msjActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_msjActionPerformed

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        // TODO add your handling code here:
        usuario a= new usuario();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        // TODO add your handling code here:
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿ Esta seguro de elimanar este grupo ?");
        if(confirmacion == JOptionPane.YES_OPTION){
            meto2.eliminarClub();
            traer.setNom_club(null);
            usuario u = new usuario();
            u.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Eliminacion cancelada");
        }
        
        
    }//GEN-LAST:event_eliminarMouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        String mensa =(String) men.getValueAt(men.getSelectedRow(), 0);
        meto2.eliminarMen(mensa);
        meto2.tabla_mensajes(0, null, men);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void salircluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salircluMouseClicked
        // TODO add your handling code here:
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿ Esta seguro de salir de este grupo ?");
        if(confirmacion == JOptionPane.YES_OPTION){
            meto2.eliminartm();
            usuario u = new usuario();
            u.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_salircluMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        // TODO add your handling code here:}
        editar_club e=new editar_club();
        e.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editarMouseClicked

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
            java.util.logging.Logger.getLogger(Chat_Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chat_Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chat_Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chat_Club.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chat_Club().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel editar;
    private javax.swing.JPanel eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_salir;
    private javax.swing.JTable men;
    private javax.swing.JTextField msj;
    private javax.swing.JLabel nom_admin1;
    private javax.swing.JLabel nom_club1;
    private javax.swing.JPanel pn_btt_salir;
    private javax.swing.JPanel salirclu;
    // End of variables declaration//GEN-END:variables
}
