/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic115;

import contGeneral.operacionesCierre;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import otros.Usuario;
import otros.allFrames;
import otros.conexionBD;


/**
 *
 * @author Erick
 */
public class menuPrincipal extends javax.swing.JFrame {

    conexionBD conect = new conexionBD();

    /**
     * Creates new form menuPrincipal
     */
    public menuPrincipal() {

        initComponents();
        allFrames.aplicarTema(this);
        new allFrames().CargarIcono(this);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu principal");
        this.setResizable(false);
        regisUser.setVisible(false);
    }

    public menuPrincipal(Usuario usuario) {
        initComponents();
        this.bienvenida.setText("Bienvenido: " + usuario.getNombres());
        new allFrames().CargarIcono(this);
        this.setLocationRelativeTo(null);
        Boolean v = Verificar(usuario.getId());
        System.out.println("id " + v);
        if (v == true) {
            regisUser.setVisible(true);
        } else {
            regisUser.setVisible(false);
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

        label1 = new java.awt.Label();
        btnCatalogo = new javax.swing.JButton();
        btncontg = new javax.swing.JButton();
        btnCostos = new javax.swing.JButton();
        btnCierre = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bienvenida = new javax.swing.JLabel();
        regisUser = new javax.swing.JButton();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCatalogo.setText("Administrador Catalogo de cuentas");
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });

        btncontg.setText("Contabilidad General");
        btncontg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncontgActionPerformed(evt);
            }
        });

        btnCostos.setText("Contabilidad de costos");
        btnCostos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCostosActionPerformed(evt);
            }
        });

        btnCierre.setText("Cierre");
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Bienvenidos a la gestion contable de RedinServe s.a de c.v");

        bienvenida.setText("Bienvenido");

        regisUser.setText("Registrar Nuevo Usuario");
        regisUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regisUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCostos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btncontg, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(btnCierre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(regisUser)
                .addGap(219, 219, 219))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(btncontg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCostos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(regisUser)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        catalogoVista catalogo = new catalogoVista();
        catalogo.setVisible(true);

        setVisible(false);
        catalogo.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btncontgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncontgActionPerformed

        contabilidadGeneral ventanaCongeneral = new contabilidadGeneral();
        setVisible(false);
        ventanaCongeneral.setVisible(true);

        ventanaCongeneral.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });


    }//GEN-LAST:event_btncontgActionPerformed

    private void btnCostosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCostosActionPerformed

        ContabilidadCostos costos = new ContabilidadCostos();
        setVisible(false);
        costos.setVisible(true);
        /* operacionesCierre cierre = new operacionesCierre();
         cierre.cuentasliquidadas();*/
        costos.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });


    }//GEN-LAST:event_btnCostosActionPerformed

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        finalIniPeriodo iniciar = new finalIniPeriodo();
        setVisible(false);
        iniciar.setVisible(true);
        iniciar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });


    }//GEN-LAST:event_btnCierreActionPerformed

    private void regisUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regisUserActionPerformed
        PantallaUsuarios use = new PantallaUsuarios();
        setVisible(false);
        use.setVisible(true);
        use.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_regisUserActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCierre;
    private javax.swing.JButton btnCostos;
    private javax.swing.JButton btncontg;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    private javax.swing.JButton regisUser;
    // End of variables declaration//GEN-END:variables
public Boolean Verificar(String id) {
        boolean v = false;
        String sql1 = "SELECT administrador FROM users WHERE id_usuario =?; ";

        try {
            PreparedStatement declaracion = conect.getConexion().prepareStatement(sql1);
            declaracion.setString(1, id);
            ResultSet resultado1 = declaracion.executeQuery();
            while (resultado1.next()) {
                v = resultado1.getBoolean("administrador");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return v;

    }
}
