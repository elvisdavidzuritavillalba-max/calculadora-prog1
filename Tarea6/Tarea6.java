package tarea6;
import java.util.Scanner;

public class Tarea6 {
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void descomponerEnDigitos() {
        int numTemp = numero;
        System.out.print("Digitos de derecha a izquierda: ");
        while (numTemp > 0) {
            int digito = numTemp % 10;
            System.out.print(digito + " ");
            numTemp = numTemp / 10;
        }
        System.out.println();
    }

    public void obtenerFactoresPrimos() {
        int numTemp = numero;
        System.out.print("Factores primos: ");
        for (int i = 2; i <= numTemp; i++) {
            while (numTemp % i == 0) {
                System.out.print(i + " ");
                numTemp = numTemp / i;
            }
        }
        System.out.println();
    }

    public int sumarDigitos() {
        int suma = 0;
        int numTemp = numero;
        while (numTemp > 0) {
            suma = suma + (numTemp % 10);
            numTemp = numTemp / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarea6 obj = new Tarea6();
        int opcion;

        System.out.print(" numero entero positivo: ");
        obj.setNumero(sc.nextInt());

        do {
            System.out.println("\n=== MENU DESCOMPONEDOR NUMERICO ===");
            System.out.println("Numero actual: " + obj.getNumero( ));
            System.out.println("1. Descomponer en digitos");
            System.out.println("2. Obtener factores primos");
            System.out.println("3. Sumar digitos");
            System.out.println("0. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    obj.descomponerEnDigitos();
                    break;
                case 2:
                    obj.obtenerFactoresPrimos();
                    break;
                case 3:
                    System.out.println("La suma de los digitos es: " + obj.sumarDigitos());
                    break;
                case 0:
                    System.out.println("Saliendo. chau panita...");
                    break;
                default:
                    System.out.println("NO hay choquito");
            }
        } while (opcion != 0);

        sc.close();
    }
}
