/*Universidad Nacional Experimental de Guayana
 * 
 * 
 *
 */
package javaapplication1;

public class JavaApplication1 {
    
    private int contador;

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        JavaApplication1 jp1 = new JavaApplication1();
        
        jp1.contador = 2;
        
        
        for (jp1.contador = 0; jp1.contador< 10; jp1.contador++) {
            System.out.println("Imprimimos: " +jp1.contador);
            
                
        }

    }

}
