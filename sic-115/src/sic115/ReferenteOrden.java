/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic115;

import otros.allFrames;
import contMateriaPrima.Asignacion_MP;
import contMateriaPrima.ConsultaProductoTerminado;
import contMateriaPrima.ManejoProducto;
import contPlanilla.Asignacion_Orden;
import contPlanilla.CIF;
import contPlanilla.IngresaOrden;
import contPlanilla.Planilla_Orden;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Zoila Villatoro
 */
public class ReferenteOrden extends javax.swing.JFrame {

    /**
     * Creates new form ReferenteOrden
     */
    public ReferenteOrden() {
        initComponents();
        allFrames.aplicarTema(this);
        new allFrames().CargarIcono(this);
        this.setLocationRelativeTo(null);
        this.setTitle("Menu Principal para Manejo de Ordenes");
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AsignacionMateriaPrima = new javax.swing.JButton();
        AsignacionManoDeObra = new javax.swing.JButton();
        AsignacionMP = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        productoTerminado = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        AsignacionMateriaPrima.setText("Asignación de Prima");
        AsignacionMateriaPrima.setMargin(new java.awt.Insets(12, 14, 12, 14));
        AsignacionMateriaPrima.setMaximumSize(new java.awt.Dimension(145, 23));
        AsignacionMateriaPrima.setMinimumSize(new java.awt.Dimension(145, 23));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AsignacionManoDeObra.setText("Asignación de Mano de Obra");
        AsignacionManoDeObra.setMargin(new java.awt.Insets(12, 14, 12, 14));
        AsignacionManoDeObra.setMaximumSize(new java.awt.Dimension(145, 23));
        AsignacionManoDeObra.setMinimumSize(new java.awt.Dimension(145, 23));
        AsignacionManoDeObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionManoDeObraActionPerformed(evt);
            }
        });

        AsignacionMP.setText("Asignación de Materia  Prima");
        AsignacionMP.setMargin(new java.awt.Insets(12, 14, 12, 14));
        AsignacionMP.setMaximumSize(new java.awt.Dimension(145, 23));
        AsignacionMP.setMinimumSize(new java.awt.Dimension(145, 23));
        AsignacionMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignacionMPActionPerformed(evt);
            }
        });

        jButton1.setText("Creación de Orden");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Manejo de Planilla por Orden");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        productoTerminado.setText("Manejo de Producto Terminado");
        productoTerminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoTerminadoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Ordenes");

        jButton3.setText("Consulta Producto Terminado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cambiar CIF");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(AsignacionMP, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(AsignacionManoDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AsignacionMP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AsignacionManoDeObra, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(productoTerminado, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsignacionMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionMPActionPerformed
        Asignacion_MP materia = new Asignacion_MP();
        setVisible(false);
        materia.setVisible(true);

        materia.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });

    }//GEN-LAST:event_AsignacionMPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        IngresaOrden orden = new IngresaOrden();
        setVisible(false);
        orden.setVisible(true);

        orden.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });

    }//GEN-LAST:event_jButton1ActionPerformed

    private void AsignacionManoDeObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignacionManoDeObraActionPerformed
        Asignacion_Orden orden2 = new Asignacion_Orden();
        setVisible(false);
        orden2.setVisible(true);

        orden2.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_AsignacionManoDeObraActionPerformed

    private void productoTerminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoTerminadoActionPerformed
        ManejoProducto producto = new ManejoProducto();
        setVisible(false);
        producto.setVisible(true);

        producto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_productoTerminadoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Planilla_Orden orden3 = new Planilla_Orden();
        setVisible(false);
        orden3.setVisible(true);

        orden3.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ConsultaProductoTerminado consulta = new ConsultaProductoTerminado();
        setVisible(false);
        consulta.setVisible(true);

        consulta.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        CIF cif = new CIF();
        setVisible(false);
        cif.setVisible(true);

        cif.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {

                setVisible(true);
            }

        });
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(ReferenteOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReferenteOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReferenteOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReferenteOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReferenteOrden().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignacionMP;
    private javax.swing.JButton AsignacionManoDeObra;
    private javax.swing.JButton AsignacionMateriaPrima;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton productoTerminado;
    // End of variables declaration//GEN-END:variables
}
