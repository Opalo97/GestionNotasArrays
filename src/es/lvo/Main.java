package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int opcion, suma = 0, promedio = 0, notamayor = 0, notamenor = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("MENÚ DE OPCIONES: ");
            System.out.println("=====================================");
            System.out.println("1.-(Re)Cargar.");
            System.out.println("2.-Mostrar.");
            System.out.println("3.-Sumar.");
            System.out.println("4.-Promedio.");
            System.out.println("5.-Máximo y mínimo.");
            System.out.println("0.-Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < array1.length; i++) {
                        System.out.print("Dame la nota número " + (i + 1) + ": ");
                        array1[i] = entrada.nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < array1.length; i++) {
                        System.out.println(array1[i] + " ");
                    }
                    break;
                case 3:
                    for (int  i = 0; i < array1.length; i++){
                        suma += array1[i];
                    }
                    System.out.println(suma);
                    break;
                case 4:
                    for (int i = 0; i < array1.length; i++) {
                        promedio = suma / array1[i];
                    }
                    System.out.println(promedio);
                    break;
                case 5:
                     for (int i = 0; i < array1.length; i++) {
                         notamayor = array1[i];
                     }
                     System.out.println("La mayor nota es " + notamayor + " y la nota menor es " + notamenor);
                    break;
                case 0:
                    System.out.println("Programa terminado.");
                    break;
            }

        } while (opcion != 0);
        System.out.println("La opción seleccionada no es válida");

    }
}
