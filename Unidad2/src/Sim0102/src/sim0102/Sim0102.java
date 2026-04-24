package sim0102;
/**
 *
 * @author Joha
 */
public class Sim0102 {

    
    public static void main(String[] args) {
        
    
        final int A = 22695477;   
        final int C = 1;  
        final int M = 65536;  
        int x = 111;         
       

        System.out.println("Inter\tXn\tmod 65536\tUn");
        for (int i = 0; i <= 10; i++) {
            int next = (A * x ) % M;
            double u = (double) x / M;
           
            System.out.printf("%d\t%d\t%d\t%.4f%n", i, x, next, u);
            x = next;
        }
    }
}

    
    

