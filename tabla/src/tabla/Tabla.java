/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;
import java.util.Scanner;
/**
 *
 * @author crist
 */
public class Tabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
       ordenamiento info = new ordenamiento();
       descendente infor = new descendente();
       Scanner entrada = new Scanner(System.in);
       int num;
       double datos[];
       
       System.out.println("Ingrese la cantidad de valores a evaluar:");
       num = entrada.nextInt();
       
       datos = new double [num];
       
       for(int i=0;i<num;i++)
       {
          System.out.println("numero "+(i+1)+" :");
          datos[i]= entrada.nextDouble();
       }
       
        System.out.println("El resultado es: ");
         info.ordenar(datos);
         infor.orden(datos);
     }
    
}
