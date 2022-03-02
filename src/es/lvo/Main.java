package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] notas = new int[5];
        int opcion, suma, promedio, notamayor, notamenor;
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
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print("Dame la nota número " + (i + 1) + ": ");
                        notas[i] = entrada.nextInt();
                    }
                    break;
                case 2:
                    for (int i = 0; i < notas.length; i++) {
                        System.out.print(notas[i] + " ");
                        System.out.println();
                    }
                    break;
                case 3:
                    suma = 0;
                    for (int  i = 0; i < notas.length; i++){
                        suma += notas[i];
                    }
                    System.out.println(suma);
                    break;
                case 4:
                    suma = 0;
                    for (int i = 0; i < notas.length; i++) {
                        suma += notas[i];
                    }
                    promedio = suma / notas.length;
                    System.out.println(promedio);
                    break;
                case 5:
                    notamayor = notas[0];
                    notamenor = notas[0];
                     for (int i = 1; i < notas.length; i++) {
                         if (notas[i] > notamayor) {
                             notamayor = notas[i];
                         }

                         if (notas[i] < notamenor) {
                             notamenor = notas[i];
                         }
                     }
                     System.out.println("La mayor nota es " + notamayor + " y la nota menor es " + notamenor);
                    break;
                case 0:
                    System.out.println("Programa terminado.");
                    break;
                default:
                    System.out.println("La opción seleccionada no es válida");
                    break;
            }
        } while (opcion != 0);

        entrada.close();
    }
}
