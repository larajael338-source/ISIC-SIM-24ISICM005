package parcia2;



public class Parcia2 {

    public static void main(String[] args) {
      
        
        long semilla = 4567;
        int nDigitos = 4;
        int cantidad = 6;
        long x = semilla;
        



long divisorCentro = (long) Math.pow(10, nDigitos/2);
long moduloCentro = (long) Math.pow(10, nDigitos);

 System.out.println("Generando " + cantidad + "EJERCICIO 1: ");

            for(int i=0; i < cantidad; i++){

               long cua = x*x;
                   

                   x = Math.floorDiv(cua, divisorCentro) % moduloCentro;

                    double u = x/ Math.pow(10, nDigitos);
                    
                System.out.printf("Iter %d :  \n  Semilla extraida   =   %d   Numero U  = %.4f%n ", (i+1), x , u);    

            }
      
               
    
        
            

//        
//         final int M = 10000;  
//        int x = 4567; 
//        
//        int nDigitos = 4;
//        int nN = 6;
//        
//       
//
//        System.out.println("Inter\tXn\tXn^2\tmod 10000\tUn");
//        for (int i = 0; i <= 10; i++) {
//            int next = ( x * x);
//            
//            double u = (double) x / M;
//            
//           
//            System.out.printf("%d\t%d\t%d\t%.4f%n", i, x, next, u);
//            x = next;
//        }  
   
   }
    
}
