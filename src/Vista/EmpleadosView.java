/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.DepartamentoCtrl;
import Controlador.EmpleadoCtrl;
import Modelo.Departamento;
import Modelo.Empleado;
import javax.swing.JOptionPane;

/**
 *
 * @author P201
 */
public class EmpleadosView extends javax.swing.JPanel {

    /**
     * Creates new form EmpleadosView
     */
    private EmpleadoCtrl empleadoCtrl;
    private DepartamentoCtrl departamentoCtrl;
    
    public EmpleadosView() {
        initComponents();
        empleadoCtrl = new EmpleadoCtrl();
        departamentoCtrl = new DepartamentoCtrl();
        lstEmpleados.setModel(empleadoCtrl.getModel());
        lstEmpleados.updateUI();
        cmbDepartamentos.setModel(departamentoCtrl.getModeloCombo());
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
        txtCedulaEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSalarioEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdadEmpleado = new javax.swing.JTextField();
        btnNuevoEmpleado = new javax.swing.JButton();
        btnAdicionarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmpleados = new javax.swing.JList<>();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnEditarEmpleado = new javax.swing.JButton();
        btnModificarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        cmbDepartamentos = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jlbInformeArchivo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Cedula: ");

        txtCedulaEmpleado.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        txtNombreEmpleado.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Salario: ");

        txtSalarioEmpleado.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Departamento");

        txtEdadEmpleado.setEnabled(false);

        btnNuevoEmpleado.setText("Nuevo");
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnAdicionarEmpleado.setText("Adicionar");
        btnAdicionarEmpleado.setEnabled(false);
        btnAdicionarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEmpleadoActionPerformed(evt);
            }
        });

        lstEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmpleados);

        btnGuardarEmpleado.setText("Guardar");
        btnGuardarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEmpleadoActionPerformed(evt);
            }
        });

        btnEditarEmpleado.setText("Editar");
        btnEditarEmpleado.setEnabled(false);
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });

        btnModificarEmpleado.setText("Modificar");
        btnModificarEmpleado.setEnabled(false);
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setText("Eliminar");
        btnEliminarEmpleado.setEnabled(false);
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        cmbDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartamentosActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Edad: ");

        jlbInformeArchivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbInformeArchivo.setText("VERIFICACION DE GUARDADO EN EL ARCHIVO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoEmpleado)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdicionarEmpleado)
                                .addGap(36, 36, 36)
                                .addComponent(btnGuardarEmpleado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificarEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarEmpleado))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jlbInformeArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(cmbDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtSalarioEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarEmpleado)
                            .addComponent(btnModificarEmpleado)
                            .addComponent(btnEliminarEmpleado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevoEmpleado)
                        .addComponent(btnAdicionarEmpleado))
                    .addComponent(btnGuardarEmpleado))
                .addGap(52, 52, 52)
                .addComponent(jlbInformeArchivo)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        activarCamposEmpleado(true);
        btnNuevoEmpleado.setEnabled(false);
        btnAdicionarEmpleado.setEnabled(true);
    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnAdicionarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEmpleadoActionPerformed
        String cadena=txtCedulaEmpleado.getText()+txtNombreEmpleado.getText();
        if(validarCampos() && validarTipoDato(cadena)){
            try{
                empleadoCtrl.adicionarEmpleado(txtCedulaEmpleado.getText(), 
                                           txtNombreEmpleado.getText(), 
                                           Double.parseDouble(txtSalarioEmpleado.getText()), 
                                           Integer.parseInt(txtEdadEmpleado.getText()), 
                                           (Departamento) cmbDepartamentos.getSelectedItem());
                JOptionPane.showMessageDialog(this, "Empleado adicionado con exito.");
                limpiarCamposEmpleado();
                activarCamposEmpleado(false);
                listarEmpleados();
                btnAdicionarEmpleado.setEnabled(false);
                btnNuevoEmpleado.setEnabled(true);
            }catch(NumberFormatException nf){
                jlbInformeArchivo.setText("Por favor digite numeros en los campos edad y salario"+nf);
            }
        }    
            
            
    }//GEN-LAST:event_btnAdicionarEmpleadoActionPerformed

    private void btnGuardarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEmpleadoActionPerformed
        empleadoCtrl.guardarEmpleados();
        JOptionPane.showMessageDialog(this, "Empleados Guardados en archivo.");         
    }//GEN-LAST:event_btnGuardarEmpleadoActionPerformed

    private void lstEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEmpleadosMouseClicked
        btnEditarEmpleado.setEnabled(true);
        btnEliminarEmpleado.setEnabled(true);
        txtNombreEmpleado.setText(empleadoCtrl.getEmpleado(lstEmpleados.getSelectedIndex()).getNombre());
        txtCedulaEmpleado.setText(empleadoCtrl.getEmpleado(lstEmpleados.getSelectedIndex()).getCedula());
        txtEdadEmpleado.setText(String.valueOf(empleadoCtrl.getEmpleado(lstEmpleados.getSelectedIndex()).getEdad()));
        txtSalarioEmpleado.setText(String.valueOf(empleadoCtrl.getEmpleado(lstEmpleados.getSelectedIndex()).getSalario()));
    }//GEN-LAST:event_lstEmpleadosMouseClicked

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        activarCamposEmpleado(true);
        btnModificarEmpleado.setEnabled(true);
        btnEditarEmpleado.setEnabled(false);
    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        empleadoCtrl.modificarEmpleado(lstEmpleados.getSelectedIndex(),
                                      txtCedulaEmpleado.getText(),
                                      txtNombreEmpleado.getText(),
                                      Double.parseDouble(txtSalarioEmpleado.getText()),
                                      Integer.parseInt(txtEdadEmpleado.getText()),
                                      (Departamento) cmbDepartamentos.getSelectedItem());
        JOptionPane.showMessageDialog(this, "Empleado modificado con exito, por favor guardar.");
        limpiarCamposEmpleado();
        listarEmpleados();
        activarCamposEmpleado(false);
        btnNuevoEmpleado.setEnabled(true);
        btnModificarEmpleado.setEnabled(false);
        btnEliminarEmpleado.setEnabled(false);
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        empleadoCtrl.eliminarEmpleado(lstEmpleados.getSelectedIndex());
        JOptionPane.showMessageDialog(this, "Empleado eliminado con exito.");
        listarEmpleados();
        limpiarCamposEmpleado();
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void cmbDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentosActionPerformed
        
    }//GEN-LAST:event_cmbDepartamentosActionPerformed

    public void activarCamposEmpleado(boolean bandera){
        txtCedulaEmpleado.setEnabled(bandera);
        txtNombreEmpleado.setEnabled(bandera);
        txtSalarioEmpleado.setEnabled(bandera);
        txtEdadEmpleado.setEnabled(bandera);
    }
    
    public void limpiarCamposEmpleado(){
        txtCedulaEmpleado.setText("");
        txtNombreEmpleado.setText("");
        txtSalarioEmpleado.setText("");
        txtEdadEmpleado.setText("");
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarEmpleado;
    private javax.swing.JButton btnEditarEmpleado;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnGuardarEmpleado;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnNuevoEmpleado;
    private javax.swing.JComboBox<String> cmbDepartamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbInformeArchivo;
    private javax.swing.JList<String> lstEmpleados;
    private javax.swing.JTextField txtCedulaEmpleado;
    private javax.swing.JTextField txtEdadEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtSalarioEmpleado;
    // End of variables declaration//GEN-END:variables

    private void listarEmpleados() {
        lstEmpleados.setModel(empleadoCtrl.getModel());
        lstEmpleados.updateUI();
    }
    
    private boolean validarCampos() {        
            if(txtCedulaEmpleado.equals("") || txtEdadEmpleado.equals("") || txtNombreEmpleado.equals("") || txtSalarioEmpleado.equals("")){                
                JOptionPane.showMessageDialog(this,"Rellene todos los campos","ALERTA",JOptionPane.ERROR_MESSAGE);
                return false;                
            }
            return true;
                   
    }
    
    private boolean validarTipoDato(String cadena){        
        for (int i = 0; i < cadena.length(); i++){		
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int)caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90))
                jlbInformeArchivo.setText("Error de tipo char");
            return false;
        }
        return true;
    }
}


