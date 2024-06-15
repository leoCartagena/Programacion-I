/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginpro;

import com.mycompany.profesor.Profesor;
import com.mycompany.alumno.Alumno;
import com.mycompany.curso.Curso;
import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author leo-progra
 */
public class LoginPro {
    //Bases de datos estaticas
    public static ArrayList<Profesor> profesores = new ArrayList<>(); //Base de datos de profesores
    public static ArrayList<Curso> cursos = new ArrayList<>();        //Base de datos de cursos
    public static ArrayList<Alumno> alumnos = new ArrayList<>();      //Base de datos de alumnos
    
    public static Profesor profesorLogueado = new Profesor();
    public static Alumno alumnoLogueado = new Alumno();
    
    public static void main (String[] args) {
        
        profesores = (ArrayList<Profesor>) leerObjeto("Profesores.dat");
        if (profesores == null){
            System.out.println("no pude cargar el archivo .dat");
            profesores = new ArrayList<>();
        }else{
            System.out.println("Cargue el archivo profesores");
        }
        cursos = (ArrayList<Curso>) leerObjeto("Cursos.dat");
        if (cursos == null){
            System.out.println("no pude cargar el archivo .dat");
            cursos = new ArrayList<>();
        }
        alumnos = (ArrayList<Alumno>) leerObjeto("Alumnos.dat");
        if (alumnos == null){
            System.out.println("no pude cargar el archivo .dat");
            alumnos = new ArrayList<>();
        }
        Login login = new Login();
        login.setVisible(true);
    }
    
    public static void guardarInformacion(){
        guardarObjeto("Profesores.dat", profesores);
        guardarObjeto("Cursos.dat", cursos);
        guardarObjeto("Alumnos.dat", alumnos);
    }
    
    public static void guardarObjeto(String rutaConNombre,Object o){
        try{
            FileOutputStream fis = new FileOutputStream(rutaConNombre);
            ObjectOutputStream archivo = new ObjectOutputStream(fis);
            archivo.writeObject(o);
            fis.close();
            archivo.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    public static Object leerObjeto(String rutaConNombre){
        try (FileInputStream fis = new FileInputStream(rutaConNombre);
            ObjectInputStream archivo = new ObjectInputStream(fis)) {
           return archivo.readObject();
        } catch (Exception e) {
           e.printStackTrace();
        }
        return null;
    }
}