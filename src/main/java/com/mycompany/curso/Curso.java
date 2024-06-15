/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso;

import com.mycompany.alumno.Alumno;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author leo-progra
 */
public class Curso implements Serializable {
    public int idCurso;
    public String nombre;
    public String seccion;
    public String fechaInicio;
    public String fechaFin;
    public String horaIncio;
    public String horaFin; 
    public String nombreProfesor;
    public ArrayList<Alumno> alumnosCurso = new ArrayList<>();
    
    
    public void eliminarAlumno(String carne) {
        alumnosCurso.removeIf(alumnoIterado -> alumnoIterado.carne.equals(carne));
    }
    

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(String horaIncio) {
        this.horaIncio = horaIncio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public ArrayList<Alumno> getAlumnosCurso() {
        return alumnosCurso;
    }

    public void setAlumnoCurso(Alumno alumnosCurso) {
        this.alumnosCurso.add(alumnosCurso);
    }
    
}