/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sic115;

import contGeneral.Cuenta;
import contGeneral.ListaLibroDiario;
import contGeneral.SubCuenta;
import contGeneral.libroDiario;
import contGeneral.transaccionesOperaciones;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import otros.conexionBD;
import java.lang.String;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import jdk.nashorn.internal.codegen.CompilerConstants;
import otros.TModeloAgregarTransaccion;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import otros.allFrames;

/**
 *
 * @author sic
 */
public class ingTransacciones extends javax.swing.JFrame {

    conexionBD connect = new conexionBD();
    TModeloAgregarTransaccion modeloAgregar = new TModeloAgregarTransaccion();
    ListaLibroDiario list = new ListaLibroDiario();
    libroDiario libroactual = list.getActivoActual();

    /**
     * Creates new form ingTransacciones
     */
    public ingTransacciones() {
        initComponents();
        allFrames.aplicarTema(this);
        new allFrames().CargarIcono(this);
        llenarCombo();
        inicializarColumnas();
        this.setLocationRelativeTo(null);
        this.setTitle("Ingresar transacciones");
        this.setResizable(false);
        this.btnEnviar.setEnabled(false);
        this.periodo.setText("Periodo contable:" + libroactual.getFechainicio() + " hasta " + libroactual.getFechafin());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTransaccion = new javax.swing.JTextField();
        comboSub = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtDebe = new javax.swing.JTextField();
        txtHaber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnIngreso = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAgregar = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        btnVerificar = new javax.swing.JButton();
        btnEnviar = new javax.swing.JButton();
        jfecha = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        periodo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Transacci??n");

        comboSub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSubActionPerformed(evt);
            }
        });

        jLabel2.setText("Subcuenta");

        txtDebe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDebeKeyTyped(evt);
            }
        });

        txtHaber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHaberKeyTyped(evt);
            }
        });

        jLabel4.setText("Debe");

        jLabel5.setText("Haber");

        btnIngreso.setText("Agregar");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        tablaAgregar.setModel(modeloAgregar);
        jScrollPane1.setViewportView(tablaAgregar);

        btnLimpiar.setText("Limpiar Tabla");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        btnEnviar.setText("Enviar Transaccion");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha");

        periodo.setText("Periodo contable");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(periodo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(31, 31, 31)
                                .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnIngreso))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnLimpiar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnVerificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnviar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(periodo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtTransaccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtHaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnIngreso))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnVerificar)
                    .addComponent(btnEnviar))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSubActionPerformed


    }//GEN-LAST:event_comboSubActionPerformed

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        if (this.txtDebe.getText().toString().isEmpty() && this.txtHaber.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese algun valor en el debe o haber", "Intente de nuevo", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!this.txtDebe.getText().toString().isEmpty() && !this.txtHaber.getText().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Solo debe de haber un valor en el debe o haber", "Intente de nuevo", JOptionPane.ERROR_MESSAGE);

            } else {
                if (this.txtDebe.getText().toString().isEmpty()) {
                    SubCuenta aux;
                    aux = (SubCuenta) this.comboSub.getSelectedItem();
                    SubCuenta auxenviado = new SubCuenta();
                    auxenviado.setNombre(aux.getNombre());
                    auxenviado.setDebe_cuenta(0);
                    auxenviado.setHaber_cuenta(Float.valueOf(this.txtHaber.getText().toString()));
                    auxenviado.setIdsubcuenta(aux.getIdsubcuenta());

                    this.modeloAgregar.scuentas.add(auxenviado);
                    this.modeloAgregar.fireTableDataChanged();
                } else {
                    if (this.txtHaber.getText().toString().isEmpty()) {
                        SubCuenta aux;
                        aux = (SubCuenta) this.comboSub.getSelectedItem();
                        SubCuenta auxenviado = new SubCuenta();
                        auxenviado.setNombre(aux.getNombre());
                        auxenviado.setDebe_cuenta(Float.valueOf(this.txtDebe.getText().toString()));
                        auxenviado.setHaber_cuenta(0);
                        auxenviado.setIdsubcuenta(aux.getIdsubcuenta());

                        this.modeloAgregar.scuentas.add(auxenviado);
                        this.modeloAgregar.fireTableDataChanged();
                    }

                }

            }
        }

        this.txtDebe.setText("");
        txtHaber.setText("");
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        this.modeloAgregar.scuentas.clear();
        this.modeloAgregar.fireTableDataChanged();

        /*if(!(libroactual.getFechainicio().after(this.jfecha.getDate())&&libroactual.getFechafin().before(this.jfecha.getDate())))

         {  
         System.out.print("Dentro de la fecha");
         }
         */
        System.out.println(this.jfecha.getDate());
        try {
            PreparedStatement pre = this.connect.getConexion().prepareStatement("insert into librodiario(id,fechainicio,fechafin,cerrado) values(5,?,?,true");
            pre.setString(1, "01/02/17");

            pre.setString(2, "01/02/18");
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        boolean valido;
        valido = comprobarDualidad();
        if (this.jfecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "No hay ninguna fecha introducida");
        } else {
            if (txtTransaccion.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe tener un nombre la transaccion");
            } else {
                if (valido) {
                    JOptionPane.showMessageDialog(this, "Dualidad cumplida");
                    this.btnEnviar.setEnabled(valido);
                    this.btnIngreso.setEnabled(false);
                    this.btnLimpiar.setEnabled(false);

                    this.txtTransaccion.setEditable(false);

                } else {
                    JOptionPane.showMessageDialog(this, "No se ha cumplido dualidad");
                    this.modeloAgregar.scuentas.clear();
                    this.modeloAgregar.fireTableDataChanged();
                }
            }
        }
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void txtDebeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDebeKeyTyped

        int k = (int) evt.getKeyChar();
        //Primer if no permite el ingreso de letras y otros s??mbolos
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
        }
        //Segundo if no permite el ingreso de "??" ," ??" ni "/"
        if (k == 241 || k == 209 || k == 47) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
        }

    }//GEN-LAST:event_txtDebeKeyTyped

    private void txtHaberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHaberKeyTyped

        int k = (int) evt.getKeyChar();
        //Primer if no permite el ingreso de letras y otros s??mbolos
        if ((k >= 32 && k <= 45) || (k >= 58 && k <= 126)) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
        }
        //Segundo if no permite el ingreso de "??" ," ??" ni "/"
        if (k == 241 || k == 209 || k == 47) {
            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            evt.consume();
        }


    }//GEN-LAST:event_txtHaberKeyTyped

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        if (libroactual.getFechainicio().after(this.jfecha.getDate())) {

            JOptionPane.showMessageDialog(this, "Fecha es fuera del rango del periodo contable");
        } else {
            if (libroactual.getFechafin().before(this.jfecha.getDate())) {
                JOptionPane.showMessageDialog(this, "Fecha es fuera del rango del periodo contable");
            } else {

                transaccionesOperaciones operacion = new transaccionesOperaciones();
                operacion.guardarTransaccion(libroactual.getId(), this.txtTransaccion.getText().toString(), this.jfecha.getDate());
                operacion.guardarSaldos((ArrayList<SubCuenta>) this.modeloAgregar.scuentas);
                this.modeloAgregar.scuentas.clear();
                this.tablaAgregar.repaint();
                this.btnIngreso.setEnabled(true);
                this.btnEnviar.setEnabled(false);
                this.btnIngreso.setEnabled(true);
                this.btnLimpiar.setEnabled(true);
                this.txtTransaccion.setEditable(true);
                this.jfecha.setDate(null);
                JOptionPane.showMessageDialog(this, "Transaccion realizada con exito");

            }

        }


    }//GEN-LAST:event_btnEnviarActionPerformed

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
            java.util.logging.Logger.getLogger(ingTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ingTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ingTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ingTransacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingTransacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVerificar;
    private javax.swing.JComboBox comboSub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jfecha;
    private javax.swing.JLabel periodo;
    private javax.swing.JTable tablaAgregar;
    private javax.swing.JTextField txtDebe;
    private javax.swing.JTextField txtHaber;
    private javax.swing.JTextField txtTransaccion;
    // End of variables declaration//GEN-END:variables

    private void llenarCombo() {
        DefaultComboBoxModel value;
        this.comboSub.removeAllItems();
        try {
            comboSub.removeAllItems();
            String sqlGeneral = "select *from subcuenta order by idcuenta";
            PreparedStatement declaracion1;
            declaracion1 = null;
            declaracion1 = this.connect.getConexion().prepareCall(sqlGeneral);
            ResultSet resultado1 = declaracion1.executeQuery();
            value = new DefaultComboBoxModel();
            comboSub.setModel(value);
            while (resultado1.next()) {
                SubCuenta aux = new SubCuenta();
                aux.setIdcuenta(resultado1.getInt("idcuenta"));
                aux.setIdsubcuenta(resultado1.getInt("idsubcuenta"));
                aux.setNombre(resultado1.getString("nombre"));
                value.addElement(aux);

            }
        } catch (SQLException ex) {

        }

    }

    private void inicializarColumnas() {

        TableColumnModel tColumnModel = new DefaultTableColumnModel();
        for (int i = 0; i < 4; i++) {
            TableColumn col = new TableColumn(i);
            switch (i) {
                case 0:
                    col.setHeaderValue("id");
                    break;
                case 1:
                    col.setHeaderValue("Cuenta");
                    break;
                case 2:
                    col.setHeaderValue("DEBE");
                    break;
                case 3:
                    col.setHeaderValue("HABER");
                    break;
            }
            tColumnModel.addColumn(col);
        }
        this.tablaAgregar.setColumnModel(tColumnModel);

    }
//continuare aqui 

    private boolean comprobarDualidad() {
        boolean x = false;
        float sumdebe, sumhaber;
        sumdebe = 0;
        sumhaber = 0;

        for (SubCuenta s : modeloAgregar.scuentas) {
            if (s.getHaber_cuenta() == 0) {
                sumdebe = sumdebe + s.getDebe_cuenta();
            } else {
                sumhaber = sumhaber + s.getHaber_cuenta();
            }
        }
        if (sumhaber != 0 && sumdebe != 0) {
            if (sumhaber == sumdebe) {
                x = true;
            }
        }
        return x;
    }

}
