/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.pkg6;

/**
 *
 * @author Pablo
 */
public class Matriz {
    
    
    
    
    public void armar(){

        int arreglo[][] = {{3,6,9,12},{15,18,21},{24,27,30,33,36},{39,42}};
        
        for (int[] arreglo1 : arreglo) {
            //número de filas
            for (int j = 0; j < arreglo1.length; j++) {
                //número de columnas de cada fila
                if (arreglo1[j] % 2 == 0) {
                    System.out.print(arreglo1[j] + " ");
                }
            }
            System.out.println();
        }


    }
    
}
