/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.profesor;

import com.mycompany.curso.Curso;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author leo-progra
 */
public class Profesor implements Serializable {
    public String nombre;
    public String apellido;
    public String usuario;
    public String password;
    public ArrayList<Curso> cursoProfesor = new ArrayList<>();
}


