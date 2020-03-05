/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

/**
 *
 * @author crist
 */
public class ordenamiento 
{
    public void ordenar(double[] datos)
            {
                
                int posicion;
                double aux;
                 for(int i=0;i<datos.length;i++)
                {
                   posicion=i;
                   aux = datos[i];
                   while(posicion>0 && (datos[posicion-1]>aux))
                   {
                      datos[posicion] = datos[posicion-1];
                      posicion--;
                   }
                   datos[posicion]=aux;
                }
        
                 
                 for(int i=0;i<datos.length;i++)
                   {
                     System.out.println(datos[i]);
                     
                   }
                      System.out.println("");
                     
            }
    
    
}
