/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author Gonzalo
 */
public class CalcularFactorial {
    int numero;
    int factorial;
    /**Metodo que calcula los factoriales
     * 
     * @param numero 
     * @param factorial 
     */
    
    public void calculoFactorial(int numero, int factorial){
    this.numero = 8;    

    int contador;
    if (this.numero == 0)
        this.factorial = 1;
    else
   {
        this.factorial = 1;
        for (contador = this.numero; contador >= 1; contador--)
        {
            this.factorial = this.factorial * contador;
        }
   }    
  
}
    
    
    
}
