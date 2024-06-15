/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.curso;

import com.mycompany.funciones.Funcionalidades;
import com.mycompany.loginpro.Administrador;
import com.mycompany.loginpro.LoginPro;
import com.mycompany.profesor.Profesor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class CargaMasivaCursosJson extends javax.swing.JFrame{
    
    public int leer(String RutaConNombre){
        JSONParser jp = new JSONParser();
        int cnt = 0;
        try {
            FileReader r = new FileReader(RutaConNombre);
            Object obj = jp.parse(r);
            
            JSONArray cursoList = (JSONArray) obj;
            System.out.println("El archivo contiene el siguiente JSON:");
            System.out.println(cursoList);
            
            for (Object cursos : cursoList) {
                
                JSONObject ListaDeCursos = (JSONObject) cursos;
                
                //JSONObject DatosCursos = (JSONObject) ListaDeCursos.get("Lista de Cursos");
                                
                System.out.println("---------------------------------------------------");
                System.out.println("Curso dentro del archivo:");
                
                long IdCurso = (long) ListaDeCursos.get("id");
                String seccion = (String) ListaDeCursos.get("seccion");
                String NombreCurso = (String) ListaDeCursos.get("nombre");
                String FechaInicio = (String) ListaDeCursos.get("fecha_inicio");
                String FechaFin = (String) ListaDeCursos.get("fecha_fin");
                String HoraInicio = (String) ListaDeCursos.get("hora_inicio");
                String HoraFin = (String) ListaDeCursos.get("hora_fin");
                String Profesor = (String) ListaDeCursos.get ("profesor");
                
                System.out.println("IdCurso: " + IdCurso);
                System.out.println("Sección: " + seccion);
                System.out.println("Nombre Curso: " + NombreCurso);
                System.out.println("Fecha Inicio: " + FechaInicio);
                System.out.println("Fecha Fin: " + FechaFin);
                System.out.println("Hora Inicio: " + HoraInicio);
                System.out.println("Hora Fin: " + HoraFin);
                System.out.println("Profesor:" + Profesor);
                
                Curso c = new Curso();
                Funcionalidades f = new Funcionalidades();
                c.idCurso = Integer.parseInt(String.valueOf(IdCurso));
                c.nombre = NombreCurso;
                c.seccion = seccion;
                c.fechaInicio = FechaInicio;
                c.fechaFin = FechaFin;
                c.horaIncio = HoraInicio;
                c.horaFin = HoraFin;
                c.nombreProfesor = Profesor;
                
                for (Profesor p : LoginPro.profesores) {
                    if (p.usuario.equals(Profesor)) {
                        p.cursoProfesor.add(c);
                    }
                }
                LoginPro.cursos.add(c);
                cnt++;
            }
            ConsultaCursos();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cnt;
    }
    
    
    public CargaMasivaCursosJson() {
        initComponents();
        ConsultaCursos();
        this.setTitle("Carga Masiva");
        //escribir("Archivo.json");
        //leer("Archivo.json");
    }
    
    public void ConsultaCursos(){
        DefaultTableModel modeloCursos = new DefaultTableModel(
                new String[]{"#","Nombre Curso","Seccion","Fecha Inicio", "Fecha Fin", "Profesor","Nota"},
                LoginPro.cursos.size());
        jTable1.setModel(modeloCursos);
        int row = 0;
        //MisCursos MisCursosNota = new MisCursos();

        
        for (Curso curso : LoginPro.cursos) {
            jTable1.setValueAt(row+1, row, 0);
            jTable1.setValueAt(curso.nombre, row, 1);
            jTable1.setValueAt(curso.seccion, row, 2);
            jTable1.setValueAt(curso.fechaInicio, row, 3);
            jTable1.setValueAt(curso.fechaFin, row, 4);
            jTable1.setValueAt(curso.nombreProfesor, row, 5);
            //jTable1.setValueAt(curso.equals(row), row, 6);
            row++;
        }
    
    }

    
    public static void escribir(String rutaconNombre) {
        JSONObject Curso1 = new JSONObject();
        //Curso1.put() 
        
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
        jBttnRegresar = new javax.swing.JButton();
        jBttnJson = new javax.swing.JButton();

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

        jBttnRegresar.setText("Regresar");
        jBttnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnRegresarActionPerformed(evt);
            }
        });

        jBttnJson.setText("Carga Masiva Cursos");
        jBttnJson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttnJsonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBttnJson)
                .addGap(18, 18, 18)
                .addComponent(jBttnRegresar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBttnRegresar)
                    .addComponent(jBttnJson))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBttnJsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnJsonActionPerformed
        int cantidadDeCursos = 0;
        JFileChooser archivo = new JFileChooser();
        int ArchivoSeleccionado = archivo.showDialog(this, "Cargar");
        if (ArchivoSeleccionado == JFileChooser.APPROVE_OPTION) {
            String pathJson = archivo.getSelectedFile().getPath();
            cantidadDeCursos = leer(pathJson);
        }
        JOptionPane.showMessageDialog(null, "Se realizo la carga masiva de forma exitosa\n De "+cantidadDeCursos+" Cursos");
    }//GEN-LAST:event_jBttnJsonActionPerformed

    private void jBttnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttnRegresarActionPerformed
        Administrador admin = new Administrador();
        admin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBttnRegresarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttnJson;
    private javax.swing.JButton jBttnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
