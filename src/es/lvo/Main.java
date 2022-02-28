package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
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
        } while (opcion != 0);

    }
}
