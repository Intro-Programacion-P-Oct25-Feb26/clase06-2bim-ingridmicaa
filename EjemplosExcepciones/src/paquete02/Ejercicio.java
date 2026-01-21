/*
  // valor tipo entero qe liegp llame  auna fincion que sume esos 
    // para los valores ingresados por teclado debe haber una excepcion
    //que solo valores pares´positivos puedan ser ingresados
 */
package paquete02;

import java.util.Scanner;

public class Ejercicio {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int valor1 = ingresarValor();
        int valor2 = ingresarValor();
        int suma = obtenerSuma(valor1, valor2);

        imprimir(valor1, valor2, suma);

    }

    public static int ingresarValor() {
        boolean bandera = true;
        int valor1 = 0;
        while (bandera) {
            try {

                System.out.println("Ingrese valor:");
                valor1 = entrada.nextInt();

                if (valor1 % 2 != 0) {
                    throw new Exception("No números impares");
                }
                if (valor1 < 0) {
                    throw new Exception("No números impares");
                }
                bandera = false;

            } catch (Exception e) {
                System.out.printf("Valor no permitido Error: %s", e);
            }

        }
        return valor1;
    }

    public static int obtenerSuma(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static void imprimir(int a, int b, int c) {
        System.out.printf("La suma de %s y %s es de:", a, b, c);
    }

}
