/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funciones;

import com.mycompany.alumno.Alumno;
import com.mycompany.curso.Curso;
import com.mycompany.loginpro.LoginPro;
import com.mycompany.profesor.Profesor;
import java.util.ArrayList;

/**
 *
 * @author ClaroII
 */
public class ReglaAsignaciones {
    
    ArrayList<Curso> cursos = LoginPro.cursos;
    
    public boolean reglaAlumnoCarne(String carne){ //Cantidad maxima de cursos que puede tener un alumno
        int maxNumeroCursos = 5;
        int cantidadAsignada = 0;
        boolean respuesta = false;
        for (Curso c : cursos) {
            for (Alumno alumno : c.getAlumnosCurso()) {
                if (alumno.carne.equals(carne)) {
                    cantidadAsignada = cantidadAsignada+1;
                }
            }
        }
        if (cantidadAsignada < maxNumeroCursos) {
            respuesta = true;
        }
        return respuesta;
    }
    
    
    public boolean cantidadDeAlumnosEnCurso(int idCurso){ //valida la cantidad de alumnos que puede tener un curso
        boolean respuesta = false;
        int maxNumeroAlumnos = 10;
        int cantidadDeAlumnos =0;
        for (Curso c : cursos) {
            if (c.idCurso == idCurso) {
                cantidadDeAlumnos = c.alumnosCurso.size();
            }
        }
        if (cantidadDeAlumnos < maxNumeroAlumnos) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public boolean reglaProfesor(String idProfesor){
        boolean respuesta = false;
        int cantidadCursos = 0;
        int cantidadMaximaCursos = 5;
        for (Profesor profe : LoginPro.profesores) {
            if (profe.usuario.equals(idProfesor)) {
                cantidadCursos = profe.cursoProfesor.size();
            }
        }
        if (cantidadCursos < cantidadMaximaCursos) {
            respuesta = true;
        }
        return respuesta;
    }
    
    
}
