/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.profesor;

import com.mycompany.alumno.Alumno;
import com.mycompany.curso.Curso;
import com.mycompany.loginpro.LoginPro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leo-progra
 */
public class ConsultaCursos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCursos
     */
    Profesor profesor = LoginPro.profesorLogueado;
    public ConsultaCursos() {
        initComponents();
        this.setTitle("Tus cursos");
        DefaultTableModel ModeloCursos = new DefaultTableModel(
                new String[]{"#","Id Curso","Nombre Curso","Seccion","Fecha Inicio", "Fecha Fin"},
                profesor.cursoProfesor.size());
        jTable1.setModel(ModeloCursos);
        int row= 0;
        for (Curso c : profesor.cursoProfesor) {
            jTable1.setValueAt(row+1, row, 0);
            jTable1.setValueAt(c.idCurso, row, 1);
            jTable1.setValueAt(c.nombre, row, 2);
            jTable1.setValueAt(c.seccion, row, 3);
            jTable1.setValueAt(c.fechaInicio, row, 4);
            jTable1.setValueAt(c.fechaFin, row, 5);
            row ++;
        }
    }
    
    public void ejemplo(){
    /*
        Mate            pro1
        Progra          pro20
        Fisica          pro40
        
        --ProfesorLogueado 
            mi nombre
            mi password
            mi apellido
            mi usuario

    */
        for (Curso curso : LoginPro.cursos) {
            if (curso.nombreProfesor.equals(profesor.usuario)) {
                double notas = 0;
                int contadorEstudiantes = 0;
                for (Alumno alumno : curso.alumnosCurso) { //50 0 100
                    if (alumno.nota >0) {
                        notas += alumno.nota;
                        contadorEstudiantes++;
                    }
                }
                double promedio = notas/contadorEstudiantes;
            }
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
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Buscar Alumnos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Los cursos en los que eres profesor:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Alumnos del curso:");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Asignar Nota");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BienvenidaProfesor bp = new BienvenidaProfesor();
        bp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int posicion = jTable1.getSelectedRow();
        if(posicion >=0){
            String idcurso =jTable1.getValueAt(posicion, 1).toString();
            for (Curso c : LoginPro.cursos) {
                if (c.idCurso == Integer.parseInt(idcurso)) {
                    DefaultTableModel ModelAlmunos = new DefaultTableModel(
                    new String[]{"#","Nombre", "Apellido", "Carne", "Nota"}, c.alumnosCurso.size());
                    jTable3.setModel(ModelAlmunos);
                    int t = 0;
                    for (Alumno alumno : c.alumnosCurso) {
                        jTable3.setValueAt(t+1, t, 0);
                        jTable3.setValueAt(alumno.nombre, t, 1);
                        jTable3.setValueAt(alumno.apellido, t, 2);
                        jTable3.setValueAt(alumno.carne, t, 3);
                        jTable3.setValueAt(alumno.nota, t, 4);
                        t++;
                    }
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe elegir un curso");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int posicionAlumno=jTable3.getSelectedRow();
        int posicionCurso=jTable1.getSelectedRow();
        if(posicionAlumno>=0 && posicionCurso>=0){
            String idcurso=jTable1.getValueAt(posicionCurso, 1).toString();
            String carneAlumno = jTable3.getValueAt(posicionAlumno, 3).toString();
            String nota = JOptionPane.showInputDialog("Ingrese la nota para el alumno: "+carneAlumno);
            for (Curso cu : LoginPro.cursos) {
                System.out.println("Evaluando curso con id: " + cu.idCurso);
                if (cu.idCurso == Integer.parseInt(idcurso)) {
                    System.out.println("Curso encontrado con id: " + cu.idCurso);
                    for (Alumno al : cu.alumnosCurso) {
                        System.out.println("Evaluando alumno con carne: " + al.carne);
                        if (al.carne.equals(carneAlumno)) {
                            System.out.println("Alumno encontrado con carne: " + al.carne + " en curso: " + cu.idCurso);
                            al.nota = Double.parseDouble(nota);
                            System.out.println("Nota asignada: " + al.nota);
                            break;
                        }
                    }
                    break;
                }
            }
            //Validando el cambio
            for (Curso curso : LoginPro.cursos) {
                System.out.println("El curso "+curso.nombre+" "+curso.nombreProfesor+" "+curso.idCurso);
                for (Alumno alumno : curso.alumnosCurso) {
                    System.out.println("tiene el alumno "+alumno.nombre);
                    System.out.println("tiene la nota "+alumno.nota);
                }
            }
            int posicion = jTable1.getSelectedRow();
            if(posicion >=0){
                for (Curso c : LoginPro.cursos) {
                    if (c.idCurso == Integer.parseInt(idcurso)) {
                        DefaultTableModel ModelAlmunos = new DefaultTableModel(
                        new String[]{"#","Nombre", "Apellido", "Carne", "Nota"}, c.alumnosCurso.size());
                        jTable3.setModel(ModelAlmunos);
                        int t = 0;
                        for (Alumno alumno : c.alumnosCurso) {
                            jTable3.setValueAt(t+1, t, 0);
                            jTable3.setValueAt(alumno.nombre, t, 1);
                            jTable3.setValueAt(alumno.apellido, t, 2);
                            jTable3.setValueAt(alumno.carne, t, 3);
                            jTable3.setValueAt(alumno.nota, t, 4);
                            t++;
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe elegir un curso");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe elegir un alumno");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}