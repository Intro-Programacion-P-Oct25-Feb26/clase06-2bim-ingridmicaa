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
        imprimir();
        obtenerSuma();

    }

    public static int ingresarValor() {
        boolean bandera = true;
        while (bandera) {
            try {
                int valor1;
                int valor2;
                System.out.println("Ingrese valor 1:");
                valor1 = entrada.nextInt();
                System.out.println("Ingrese valor 2:");
                valor2 = entrada.nextInt();
                
                if (valor1 % 2 == 0 || valor2 % 2 == 0) {
                    
                }
                bandera= false;
                }

            }
        return 
        }

    

    

    

    public static void imprimir() {

    }

    public static int obtenerSuma() {

    }
