
package parcial2.pkg0;


public class Parcial20 {

  
//    public static void main(String[] args) {
      
      public static double[] generarSecuencia(long seed, int cantidad) {

        double[] generarSecuencia = new double[cantidad];
      
 
            
        // Detectar cantidad de dígitos
        int d = String.valueOf(seed).length();

        System.out.println("Generando EJERCICIO 1: ");

            for(int i=0; i < cantidad; i++){

               long cuadrado = seed*seed;
                   
//lllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
            // Completar con ceros
            String numero = String.format("%0" + (d * 2) + "d", cuadrado);

            // Extraer centro
            int inicio = (numero.length() - d) / 2;

            String centro = numero.substring(inicio, inicio + d);

            // Nueva semilla
            seed = Long.parseLong(centro);

            // Numero pseudoaleatorio
            generarSecuencia[i] = seed / Math.pow(10, d);
        }

        return generarSecuencia;
    }

    // Chi-Cuadrado
    
    public static void realizarPruebaChi(double[] secuencia,
            int intervalos, double valorCritico) {

        int n = secuencia.length;

        int[] observados = new int[intervalos];

        // Contar frecuencias observadas
        for (double num : secuencia) {

            int posicion = (int) (num * intervalos);

            if (posicion == intervalos) {
                posicion--;
            }

            observados[posicion]++;
        }

        // Frecuencia esperada
        double esperado = (double) n / intervalos;

        double chi = 0;

        System.out.println("\n=================================");
        System.out.println("CHI-CUADRADO");
        System.out.println("=================================");
        System.out.println("Intervalo\tOi\tEi");

        for (int i = 0; i < intervalos; i++) {

            chi += Math.pow(observados[i] - esperado, 2) / esperado;

            System.out.println(i + "\t\t" +observados[i] + "\t" +esperado);
        }

        System.out.println("\nChi Calculado = " + chi);
        System.out.println("Valor Critico = " + valorCritico);

        // Decision final
        if (chi <= valorCritico) {

            System.out.println("\nH0 ACEPTADA:");
            System.out.println("SE RECHAZA H0. Los números NO se distribuyen de manera uniforme.");

        } else {

            System.out.println("\nH0 ACEPTADA!!!:");
            System.out.println("Distribucion Uniforme :) ");
        }
    }

    public static void main(String[] args) {

        // Semilla
        long semilla = 21435;

        // n
        double[] secuencia = generarSecuencia(semilla, 50);

        // Mostrar primeros 5 valores
        System.out.println("=================================");
        System.out.println("VALORES PRUEBA Y ESTRES");
        System.out.println("=================================");

        for (int i = 0; i < 50; i++) {

            System.out.println("R" + (i + 1) +
                               " = " + secuencia[i]);
        }

        // Prueba Chi-Cuadrado
        realizarPruebaChi(secuencia, 5, 9.488);
    }
}
    
    

