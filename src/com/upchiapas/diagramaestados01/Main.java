package com.upchiapas.diagramaestados01;
import com.upchiapas.diagramaestados01.models.Formulario;
import com.upchiapas.diagramaestados01.models.Operaciones;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Formulario leer = new Formulario();
        Operaciones operacion = new Operaciones();
        mostraMenu(leer,operacion);
    }

    public static void mostraMenu(Formulario leer,Operaciones operacion){
        byte opcion;
        do {
            opcion=Byte.parseByte(JOptionPane.showInputDialog(null,
                    "***   [1]- Agregar numero   ***\n"
                    +"**    [2]- Sumar numeros     **\n"
                    +"***   [3]- SALIR            ***\n"
                    +"Ingrese una opcion: "));

            switch (opcion){
                case 1:
                    leer.agregarNumeros();
                    break;
                case 2:
                    operacion.calcularSuma(leer.getNumeros());
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion invalida. Intentelo de nuevo...");
            }
        }while (opcion != 3);
    }

}
