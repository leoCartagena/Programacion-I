/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.alumno;

import com.mycompany.alumno.Alumno;
import com.mycompany.loginpro.Administrador;
import com.mycompany.loginpro.LoginPro;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leo-progra
 */
public class ConsultaAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaAlumnos
     */
    public ConsultaAlumnos() {
        initComponents();
        this.setTitle("Consulta Alumnos");
        DefaultTableModel datos = new DefaultTableModel( new String[]{"#", "Carne", "Nombre", "Apellido","Nota"}, LoginPro.alumnos.size());
        jTable1.setModel(datos);
        
        int row = 0;
        
        for (Alumno a : LoginPro.alumnos) {
            jTable1.setValueAt(row+1, row, 0);
            jTable1.setValueAt(a.carne, row, 1);
            jTable1.setValueAt(a.nombre, row, 2);
            jTable1.setValueAt(a.apellido, row, 3);
            jTable1.setValueAt(a.nota, row, 4);
            row ++;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtnRegresar.setText("Regresar");
        jBtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnRegresar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnRegresar)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRegresarActionPerformed
        Administrador a = new Administrador();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBtnRegresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}