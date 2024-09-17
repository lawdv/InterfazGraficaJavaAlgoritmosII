/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author lawdv
 */

class Variables {
    String input; //tomara la entrada del usuario
    int numero; // Almacenara o guardara el numero ingresado
    int numero2; // Almacenara o guardara el numero ingresado
}
public class InterfazGraficaAlgoritmos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //uso mi clase declarada, la uso por organizacion asi.
        Variables variables = new Variables();
        //Input para el usuario con JOptiionPane se debe importar
        variables.input = JOptionPane.showInputDialog(null, "Ingresar numero:");
        // Conversion del numero ingresado a entero con integer.parseint
        try
        {
            variables.numero = Integer.parseInt(variables.input);
        }
        // Si falla la conversion la manejo aqui en este Cath
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Por favor ingresar numero valido u o entero");
            return; // Finalizo la interaccion si no es correcta
        }
        
         variables.input = JOptionPane.showInputDialog(null, "Ingresar numero2:");
        // Conversion del numero ingresado a entero con integer.parseint
        try
        {
            variables.numero2 = Integer.parseInt(variables.input);
        }
        // Si falla la conversion la manejo aqui en este Cath
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Por favor ingresar numero valido u o entero");
            return; // Finalizo la interaccion si no es correcta
        }
        
        //Acciones a realizar como usar operadores matematicos
        int resultadodoble = variables.numero * 2;
        int resultadoresta = variables.numero - 1;
        
        // Acciones avanzadas reutilizandoe el valor ingresado
        
        int resultadoavdoblesuma = variables.numero + variables.numero2;
        int resultadoavdobleresta = variables.numero - variables.numero2;
        int resultadoavdoblemultiplicar = variables.numero * variables.numero2;
        
        //Salida o resultado con dialogo
        JOptionPane.showMessageDialog(null, "El doble * 2 del numero ingresado inicial que fue " + variables.numero + " es: " + resultadodoble);
        JOptionPane.showMessageDialog(null, "En la resta - 1 del numero ingresado que fue " + variables.numero + " es: " + resultadoresta);
        JOptionPane.showMessageDialog(null, "En la suma de los dos numeros ingresados, " + variables.numero + " y " + variables.numero2 + " guardados es " + resultadoavdoblesuma);
        JOptionPane.showMessageDialog(null, "En la resta de los dos numeros ingresados, " + variables.numero + " y " + variables.numero2 + " guardados es " + resultadoavdobleresta);
        JOptionPane.showMessageDialog(null, "En la multiplicacion de los dos numeros ingresados, " + variables.numero + " y " + variables.numero2 + " guardados es " + resultadoavdoblemultiplicar);

    }
    
}
