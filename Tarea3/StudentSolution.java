package examen;

// NOTA: Consulte ENUNCIADO.txt para ver las instrucciones y reglas detalladas.
public class StudentSolution {

    // Constantes de identificacion (NO MODIFICAR)
    public static final String STUDENT_ID = "59";
    public static final String STUDENT_NAME = "ZURITA VILLALBA ELVIS DAVID";
    public static final String EXAM_CODE = "206C645A41";
    public static final String SIGNATURE = "585B81CFC1AB";
    public static final String Q1_ID = "P1Q1_005";
    public static final String Q2_ID = "P1Q2_013";
    public static final String Q3_ID = "P1Q3_010";

    // Constantes asignadas a su examen
    public static final int K1 = 5;
    public static final int K2 = 7;
    public static final int K3 = 8;
    public static final int BASE_EVEN = 14;

    // =========================================================================
    // PREGUNTA 1: Calculo de formula matematica
    // =========================================================================
    public static double p1_calcular(double a, double b) {
        // Tu codigo aqui:
        double Numerador  = K1 * a * a + K2 *b ;
        double Resultado = Numerador / K3 ;
        return Resultado;
         }

    // =========================================================================
    // PREGUNTA 2: Clasificacion de numero entero
    // =========================================================================
    public static String p2_analizarNumero(int n) {
        // Tu codigo aqui:
        String Tipo;
        String Signo;
        if (n % 2 == 0) {
            Tipo = "par";
        }       else { 
                  Tipo = "impar";
        }
        
        if (n>0){
           Signo = "positivo";}
                 else if (n < 0){
                   Signo = "negativo";}
                      else{ 
                       Signo="cero";}
        return Tipo +"-"+ Signo;
    }

    // =========================================================================
    // PREGUNTA 3: Generacion de serie de numeros pares
    // =========================================================================
    public static String p3_seriePares(int N) {
        // Tu codigo aqui:
        String serie = "";
        int actual = BASE_EVEN;
        
        for (int i = 0 ; i < N; i++) {
                serie = serie + actual;
                   if (i < N - 1 ){
                    serie = serie + ", ";
                   }
                   actual = actual + 2;
                           
 }
        return serie;
    }

    // =========================================================================
    // ZONA DE PRUEBA RAPIDA (Shift+F6 en NetBeans para ejecutar este archivo)
    // =========================================================================
    public static void main(String[] args) {
        System.out.println("=== PRUEBA RAPIDA DE TUS SOLUCIONES ===");
        System.out.println("P1 (calcular con 2.0 y 3.0)  : " + p1_calcular(2.0, 3.0));
        System.out.println("P2 (analizar numero 8)        : " + p2_analizarNumero(8));
        System.out.println("P3 (serie de 4 pares)         : " + p3_seriePares(4));
    }
}
