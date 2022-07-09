package com.upchiapas.diagramaestados01.models;

import javax.swing.*;
import java.util.ArrayList;

public class Operaciones {
    public void calcularSuma(ArrayList <Double> numeros){
        double sumaTotal = 0;
        for (int i=0; i<numeros.size() && numeros.get(i)!=null; i++){
            sumaTotal += numeros.get(i);
        }
        JOptionPane.showMessageDialog(null,"\nSuma = "+sumaTotal+"\n");
        numeros.clear();
    }
}
