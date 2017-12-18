
package factorial;


public class Factorial {

/**
 * En la main llamaremos a los metodos mediante un objeto que creamos
 * y sacamos por pantalla el resultado
 * @param args 
 */
    public static void main(String[] args) {
        CalcularFactorial obx = new CalcularFactorial();
        obx.calculoFactorial(obx.numero, obx.factorial);
 
        System.out.println(obx.factorial); 


    }
    
}
