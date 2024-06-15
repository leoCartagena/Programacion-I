/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funciones;

import com.mycompany.loginpro.LoginPro;

/**
 *
 * @author leo-progra
 */
public class Funcionalidades {
    
    public int idIngreso(String tipoId){
        int id = 0;
        if (tipoId.equals("profesor")) {
            return LoginPro.profesores.size()+1;
        }else if(tipoId.equals("alumno")){
            int correlativoEstudiante = LoginPro.alumnos.size()+1;
            return Integer.parseInt("319000")+correlativoEstudiante;
        }else if(tipoId.equals("curso")){
            return LoginPro.cursos.size()+1;
        }
        return 0;
    }
}