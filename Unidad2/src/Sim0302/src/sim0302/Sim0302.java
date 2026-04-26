package sim0302;
/**
 *
 * @author Joha
 */
public class Sim0302 {

    public static void main(String[] args) {
      
        
        long seed = 1001;
        int nDigitos = 4;
        int nIter = 10;
        long x = seed;
        



long divisorCentro = (long) Math.pow(10, nDigitos/2);
long moduloCentro = (long) Math.pow(10, nDigitos);

 System.out.println("Generando " + nIter + "numeros usano cuadrado medio");

            for(int i=0; i < nIter; i++){

               long cua = x*x;
                   

                   x = Math.floorDiv(cua, divisorCentro) % moduloCentro;

                    double u = x/ Math.pow(10, nDigitos);
                    
                System.out.printf("Iter %d :  Semilla extraida   =   %d   |   Numero U  =  %.4f%n ", (i+1), x , u);    

            }
        
        
  



        
    }
    
}
