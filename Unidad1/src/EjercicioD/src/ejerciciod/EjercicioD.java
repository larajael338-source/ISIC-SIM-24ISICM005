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
        
        
        
        
        
      
 //  ES EL MISMO CODIGO Q EL DE ARRIBA PERO ESTE ESTA DOCUMENTADO     
  
//        final int A = 5;   //multiplicar a
//        final int C = 3;   //incremento c
//        final int M = 16;  //modulo m
//        int x = 4;         //semilla X0
//        
//        //inicializamos los parametros formula Xn+1=(aXn + c) mod m
//
//        System.out.println("Iter\tXn\tmod 16\tUn+1");
//        for (int i = 0; i < 6; i++) {
//            double u = (double) x / M;
//            int next = (A * x + C) % M;
//            System.out.printf("%d\t%d\t%d\t%.4f%n", i, x, next, u);
//            x = next;
//            }

       
        
//-------------------------------------------------------------------------------------------------------------
       
//        int a = 5;
//        int m = 16;
//        int c = 3;
//        int Xn = 4;
//
//        for(int i = 1; i <= 5; i++){
//
//            int xn1 = (a * Xn + c) % m;
//            double Un = (double) xn1 / m;
//
//            System.out.println("Iteracion " + i + "  Xn = " + xn1 + "  Un = " + Un);
//
//            Xn = xn1;
//        
//        
//    }
    


    }
}

