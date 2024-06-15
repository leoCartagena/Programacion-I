/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.funciones;
/**
 *
 * @author leo-progra
 */
public class ValidacionPassword {
    public boolean MenuValPass(String password){
        System.out.println("Estoy validando "+password);
        String expresionRegular = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=.*[^\\w\\d\\s]).{8,}$";
        return password.matches(expresionRegular);
    }
}