

package sim0402;


public class Sim0402 {

   
    public static void main(String[] args) {
        
//  double[] muestra = {
//            0.15, 0.22, 0.89, 0.45, 0.56, 0.78, 0.12, 0.34, 0.90, 0.67,
//            0.44, 0.21, 0.99, 0.81, 0.55, 0.32, 0.11, 0.29, 0.61, 0.73,
//            0.84, 0.92, 0.05, 0.49, 0.51, 0.66, 0.38, 0.19, 0.77, 0.25
//        };

//numerosSesgados
//double[] muestra ={
//             0.04, 0.15, 0.01, 0.45, 0.12, 0.88, 0.07, 0.22, 0.55, 0.11,
//             0.03, 0.34, 0.72, 0.18, 0.09, 0.28, 0.61, 0.05, 0.14, 0.41,
//             0.02, 0.19, 0.81, 0.13, 0.06, 0.25, 0.51, 0.08, 0.31, 0.17
//         };

//Prueba de Sensibilidad (Muestra Personalizada: que los 30 números sean menores a 0.20)
double[] muestra ={
               0.01,0.02,0.03,0.04,0.05,0.06,0.07,0.08,0.09,0.10,
               0.11,0.12,0.13,0.14,0.15,0.16,0.17,0.18,0.19,0.11,
               0.05,0.06,0.07,0.08,0.09,0.11,0.12,0.13,0.14,0.15
           };


  //tamano de la muestra
  int n = muestra.length;
  
  //numero de intervalos
  int k = 5;
  
  //frecuencia esperada por intervalo
  double esperado = (double) n/k;
  
  //vector tipo entero
  int[] observados = new int [k];
  
  //limites (cuantos hay en cada intervalo)
  double[] limites = {0.0,0.2,0.4,0.6,0.8,1.0};
  
  //histograma
  //asegurar que el 1.0 caiga en el ultimo intervalo
  for(double num : muestra){
      int intervalo = (int)(num * k);
      if(intervalo == k){
          intervalo--;
         }
      observados[intervalo]++;
  }
  
        System.out.println("====================================================================");
        System.out.println("EJEMPLO PASO A PASO: PRUEBA DE CHI-CUADRADA DE UNIFORMIDAD(JAVA)");
        System.out.println("====================================================================");
        System.out.println("TOTAL DE NUMEROS EN LA MUESTRA (n): " + n);
        System.out.println("NUMERO DE SUBINTERVALOS (k): " + k);
        System.out.println("FRECUENCIA ESPERADA POR INTERVALOS: " + esperado);
        System.out.println("====================================================================");
        
        //tabla
        System.out.printf("%-15s  |  %-15s  |  %-15s  |  %-20s\n"," INTERVALO"," OBSRVADO (o_i)"," ESPERADO (E_i)"," (o_i - E_i)^2 / E_i");
        System.out.println("====================================================================");
  
  double chiCuadradaCalculada = 0;
  int sumaObservados = 0;
  
  //calculo de cada intervalo con la formula 
  for(int i = 0; i < k;  i++){
      String rango = String.format("[%.1f - %.1f}", limites[i], limites[i+1]);
      int o_i = observados[i];
      
      double calculoParcial = Math.pow(o_i - esperado, 2) / esperado;
      
      chiCuadradaCalculada += calculoParcial;
      sumaObservados += o_i;
      
      //                         d=enteros    f=flotantes
      System.out.printf("%-15s  |  %-15d  |  %-15.1f  |  %-20.4f\n", rango, o_i, esperado, calculoParcial);
  }
  
    System.out.println("====================================================================");
    System.out.printf("%-15s | %-15d | %-15.1f | Estadístico = %.4f\n\n", "TOTAL", sumaObservados, (k * esperado), chiCuadradaCalculada);
   
     // Conclusión con el valor crítico de tablas
        double nivelConfianza = 0.95;
        double alfa = 1 - nivelConfianza;
        int gradosLibertad = k - 1;
        
        // En Java estándar no hay función ppf como en Python.
        // Para este ejercicio educativo (alpha=0.05, gl=4), el valor de tablas fijo es 9.4877
        double valorCritico = 9.4877; 
        System.out.println("Grados de libertad (k - 1): " + gradosLibertad);
        System.out.printf("Nivel de significancia (alpha): %.2f\n", alfa);
        System.out.printf("Valor crítico de tablas (X^2_%.2f,_%d): %.4f\n\n", alfa, gradosLibertad, valorCritico);
        
        System.out.println("CONCLUSIÓN:");
        if (chiCuadradaCalculada <= valorCritico) {
            System.out.printf("Como %.4f <= %.4f:\n", chiCuadradaCalculada, valorCritico);
            System.out.println("-> NO SE RECHAZA H0. Los números se distribuyen de manera uniforme (U(0,1)).");
        } else {
            System.out.printf("Como %.4f > %.4f:\n", chiCuadradaCalculada, valorCritico);
            System.out.println("-> SE RECHAZA H0. Los números NO se distribuyen de manera uniforme.");
  
  
  
  
  
  
  
  }      
        
   
    }
}

