/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnessclub;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import metodos.conexion;
import metodos.met;
import metodos.traerdatos;

/**
 *
 * @author Propietario
 */
public class usuario extends javax.swing.JFrame {
    met meto2= new met();
    int xmouse, ymouse;
    traerdatos traer = new traerdatos();
    public usuario() {
        
        initComponents();
        conexion c = new conexion();
        Connection con = c.conectar();
        String nombre_usu = traer.getNombre_usu();
        String nombre_club = traer.getNom_club();
        setLocationRelativeTo(null);
        nom_usu.setText(nombre_usu);
        nom_club.setText(nombre_club);
        meto2.tabla_clubadd(0, null, clu);
        if(nombre_club!=null){
            jPanel6.setVisible(false);
        }
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
        jPanel5 = new javax.swing.JPanel();
        pn_btt_salir = new javax.swing.JPanel();
        lb_salir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        nom_club2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nom_club = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        nom_club1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        clu = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nom_usu = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 200));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 252, 252));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel5.setLayout(null);

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
        pn_btt_salir.add(lb_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        jPanel5.add(pn_btt_salir);
        pn_btt_salir.setBounds(1080, 0, 30, 30);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 1110, 30));

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 150, 1560, -1));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nom_club2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        nom_club2.setForeground(new java.awt.Color(255, 153, 0));
        nom_club2.setText("Editar Perfil");
        jPanel11.add(nom_club2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, -1));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1500, 50));

        jPanel4.setBackground(new java.awt.Color(255, 117, 158));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1480, 10));

        nom_club.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        nom_club.setForeground(new java.awt.Color(12, 12, 12));
        nom_club.setText("aun no tienes club");
        jPanel1.add(nom_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 500, 50));

        jPanel6.setBackground(new java.awt.Color(51, 204, 255));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear CLub");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(20, 10, 150, 29);

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, 180, 50));

        jPanel7.setBackground(new java.awt.Color(249, 249, 249));
        jPanel7.setLayout(null);

        nom_club1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        nom_club1.setForeground(new java.awt.Color(255, 153, 0));
        nom_club1.setText("Aqui estan los clubs a los que perteneces");
        jPanel7.add(nom_club1);
        nom_club1.setBounds(10, 10, 500, 29);

        clu.setAutoCreateRowSorter(true);
        clu.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        clu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        clu.setGridColor(new java.awt.Color(0, 0, 0));
        clu.setRowHeight(30);
        clu.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(clu);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 720, 390);

        jPanel8.setBackground(new java.awt.Color(51, 204, 255));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Grupos");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);
        jPanel8.setBounds(980, 10, 200, 50);

        jPanel9.setBackground(new java.awt.Color(51, 204, 255));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Entrar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addComponent(jLabel3)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel9);
        jPanel9.setBounds(10, 450, 720, 50);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 1230, 510));

        nom_usu.setFont(new java.awt.Font("Eras Demi ITC", 0, 24)); // NOI18N
        nom_usu.setForeground(new java.awt.Color(12, 12, 12));
        nom_usu.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nom_usuInputMethodTextChanged(evt);
            }
        });
        jPanel1.add(nom_usu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 360, 50));

        jPanel10.setBackground(new java.awt.Color(255, 117, 158));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cerrar Sesion");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1270, 700));

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

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        // TODO add your handling code here:
        crear_club a= new crear_club();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void nom_usuInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nom_usuInputMethodTextChanged
        // TODO add your handling code here:
        
            
        
    }//GEN-LAST:event_nom_usuInputMethodTextChanged

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        buscarGrupos a= new buscarGrupos();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        String club =(String) clu.getValueAt(clu.getSelectedRow(), 0);
        int id_club1 = Integer.parseInt(club);
        
       meto2.datos_chat(id_club1);
        Chat_Club c= new Chat_Club();
        c.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        inicio i=new inicio();
        i.setVisible(true);
        this.setVisible(false);

        traer.setNom_club(null);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
       editar_registro e = new editar_registro();
       e.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_jPanel11MouseClicked

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
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                
                new usuario().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_salir;
    private javax.swing.JLabel nom_club;
    private javax.swing.JLabel nom_club1;
    private javax.swing.JLabel nom_club2;
    private javax.swing.JLabel nom_usu;
    private javax.swing.JPanel pn_btt_salir;
    // End of variables declaration//GEN-END:variables
}
