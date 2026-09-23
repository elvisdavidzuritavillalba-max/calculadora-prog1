/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String profesion;

    public Persona(String nombre, int edad, String profesion) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public void mostrarInformacion() {
        System.out.println("--- Datos de la Persona ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Profesión: " + profesion);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Registro de informacion personal ===");
        
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese la profesión: ");
        String profesion = sc.nextLine();

        Persona p1 = new Persona(nombre, edad, profesion);

        System.out.println();
        p1.mostrarInformacion();

        System.out.println();
        if (p1.esMayorDeEdad()) {
            System.out.println("Resultado: Es mayor de edad si ");
        } else {
            System.out.println("Resultado: Es menor de edad no");
        }

        sc.close();
    }
}
        
