/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea5program;

import java.util.Scanner;

public class Tarea5program {
    private String nombre;
    private int antiguedadAnios;
    private double sueldoBase;
    private char categoria;
    private int numero;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAntiguedadAnios() {
        return antiguedadAnios;
    }
    public void setAntiguedadAnios(int antiguedadAnios) {
        this.antiguedadAnios = antiguedadAnios;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public char getCategoria() {
        return categoria;
    }
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double obtenerBonoAntiguedad() {
        double bono = 0;
        if (antiguedadAnios < 3) {
            bono = 0;
        } else if (antiguedadAnios >= 3 && antiguedadAnios <= 5) {
            bono = sueldoBase * 0.05;
        } else {
            bono = sueldoBase * 0.10;
        }
        return bono;
    }

    public double obtenerBonoCategoria() {
        double bono;
        switch (categoria) {
            case 'A':
                bono = 500;
                break;
            case 'B':
                bono = 300;
                break;
            case 'C':
                bono = 100;
                break;
            default:
                bono = 0;
                break;
        }
        return bono;
    }

    public void mostrarLiquidacion() {
        double bonoAnt = obtenerBonoAntiguedad();
        double bonoCat = obtenerBonoCategoria();
        double sueldoTotal = sueldoBase + bonoAnt + bonoCat;
        System.out.println("===== LIQUIDACION DE SUELDO ====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Antiguedad: " + antiguedadAnios + " años");
        System.out.println("Categoria: " + categoria);
        System.out.println("Sueldo : " + sueldoBase + " Bs");
        System.out.println("Bono por Antiguedad: " + bonoAnt + " Bs");
        System.out.println("Bono por Categoria: " + bonoCat + " Bs");
        System.out.println("SUELDO TOTAL : " + sueldoTotal + " Bs");
        System.out.println("-----------------------------");
    }

    public long calcularFactorial() {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public int contarDigitos() {
        int contador = 0;
        int numTemp = numero;
        while (numTemp > 0) {
            numTemp = numTemp / 10;
            contador++;
        }
        if (numero == 0) contador = 1;
        return contador;
    }

    public void mostrarTablaMultiplicar() {
        System.out.println("\n--- TABLA DEL " + numero + " ---");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tarea5program obj = new Tarea5program();
        int opcionMenu;

        System.out.println("=== MENU PRINCIPAL ===");
        System.out.println("==1. modulo Empleado==");
        System.out.println("===2. Modulo Analizador Numerico===");
        System.out.print("==Elija una opcion: ");
        opcionMenu = sc.nextInt();
        sc.nextLine();

        if (opcionMenu == 1) {
            System.out.println("=== REGISTRO DE EMPLEADO ===");
            System.out.print("Ingrese nombre: ");
            obj.setNombre(sc.nextLine());
            System.out.print("Ingrese antiguedad en años: ");
            obj.setAntiguedadAnios(sc.nextInt());
            System.out.print("Ingrese sueldo base: ");
            obj.setSueldoBase(sc.nextDouble());
            System.out.print("Ingrese categoria A, B o C: ");
            obj.setCategoria(sc.next().charAt(0));
            obj.mostrarLiquidacion();
        } else if (opcionMenu == 2) {
            int opcion;
            System.out.print("Ingrese un numero entero positivo: ");
            obj.setNumero(sc.nextInt());
            do {
                System.out.println("=== MENU ANALIZADOR NUMERICO ===");
                System.out.println("Numero actual: " + obj.getNumero());
                System.out.println("1. Calcular Factorial");
                System.out.println("2. Contar Digitos");
                System.out.println("3. Mostrar Tabla de Multiplicar");
                System.out.println("0. Salir");
                System.out.print("Elija una opcion: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("El factorial de " + obj.getNumero() + " es: " + obj.calcularFactorial());
                        break;
                    case 2:
                        System.out.println("El numero tiene " + obj.contarDigitos() + " digitos");
                        break;
                    case 3:
                        obj.mostrarTablaMultiplicar();
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                }
            } while (opcion != 0);
        } else {
            System.out.println("Opcion no valida");
        }
        sc.close();
    }
}