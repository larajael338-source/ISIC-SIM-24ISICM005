//johanny jael fuentes lara 24isicm005
package ejerciciod;


public class EjercicioD {

  
    public static void main(String[] args) {
   
        
      final int A = 22695477;   
        final int C = 5;  
        final int M = 40;  
        int x = 10;         
       

        System.out.println("Iter\tXn\tmod 40\tUn+1");
        for (int i = 0; i < 6; i++) {
            double u = (double) x / M;
            int next = (A * x + C) % M;
            System.out.printf("%d\t%d\t%d\t%.4f%n", i, x, next, u);
            x = next;
            }  
        
        
        
        
        
      
 
    }
}

