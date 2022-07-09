package com.upchiapas.diagramaestados01.models;

import javax.swing.*;
import java.util.ArrayList;

public class Formulario {
    double numero;
    ArrayList <Double> numeros = new ArrayList<>(); //int[] numeros = new int[]

    public void agregarNumeros(){
        numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce numero: "));
        numeros.add(numero);
        mostrarNumeros();
    }
    public void mostrarNumeros(){
        for (Double aDouble : numeros) {
            JOptionPane.showMessageDialog(null, aDouble + "\t");
        }
    }
    public ArrayList<Double> getNumeros() {
        return numeros;
    }
}
