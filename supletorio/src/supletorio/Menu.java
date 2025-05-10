/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supletorio;

/**
 *
 * @author pedro
 */
import java.util.Scanner;

public class Menu {
    static String[] array = new String[15];
    static int[][] matriz = new int[6][6];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Calcular Area de un Rectangulo");
            System.out.println("2. Ingresar Datos Array");
            System.out.println("3. Listar Datos Array");
            System.out.println("4. Listar Datos Array en la posicion 5 y 10");
            System.out.println("5. Ingresar Datos Matriz");
            System.out.println("6. Listar Datos de la Matriz");
            System.out.println("7. Calcular la sumatoria de la diagonal principal");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> calcularAreaRectangulo();
                case 2 -> ingresarDatosArray();
                case 3 -> listarDatosArray();
                case 4 -> listarArrayPosiciones();
                case 5 -> ingresarDatosMatriz();
                case 6 -> listarDatosMatriz();
                case 7 -> sumarDiagonalPrincipal();
                case 8 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion invalida.");
            }

        } while (opcion != 8);
    }

    public static void calcularAreaRectangulo() {
        System.out.print("Ingrese la base del rectangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("El área del rectangulo es: " + area);
    }

    public static void ingresarDatosArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese el dato para la posicion " + i + ": ");
            array[i] = scanner.nextLine();
        }
    }

    public static void listarDatosArray() {
        System.out.println("Datos del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posición " + i + ": " + array[i]);
        }
    }

    public static void listarArrayPosiciones() {
        if (array.length > 10) {
            System.out.println("Posicion 5: " + array[5]);
            System.out.println("Posicion 10: " + array[10]);
        } else {
            System.out.println("El array no tiene suficientes elementos.");
        }
    }

    public static void ingresarDatosMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el dato para la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.nextLine(); // Limpiar buffer
    }

    public static void listarDatosMatriz() {
        System.out.println("Datos de la matriz:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    public static void sumarDiagonalPrincipal() {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        System.out.println("La suma de la diagonal principal es: " + suma);
    }
}
