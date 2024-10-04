package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public static void ejercicio1(){
        Scanner entrada=new Scanner(System.in); //Asignamos entrada como nuestro metodo Scanner para leer valores por consola
        int n=0;    //Asignamos valor 0 a n para que entre al bucle while donde comprobaremos que solo sale un entero con try-catch
        while (n==0)
        try {
            System.out.println("Introduce un número");
            n = entrada.nextInt();

        }
        catch (NumberFormatException | InputMismatchException e){
            System.out.println("ERROR. Introduce un valor válido...");
            entrada.next();
        }

        if (n>=0){                      //Si el numero es positivo lo mostraremos ya que ese es el absoluto en cambio si es negativo lo nultiplicaremos por -1 antes de mostrarlo.
            System.out.println("El número absoluto es "+n);
        }
        else{
            n=n*-1;
            System.out.println("El número absoluto es "+n);
        }
    }
    public static void ejercicio2(){
        Scanner entrada=new Scanner(System.in); //(explicado en ejercicio anterior)

        System.out.println("Introduce el ancho de la pared");
        int apared = entrada.nextInt();
        System.out.println("Introduce el largo de la pared");
        int lpared = entrada.nextInt();
        System.out.println("Introduce el ancho del azulejo");
        int aazu = entrada.nextInt();
        System.out.println("Introduce el largo del azulejo");
        int lazu = entrada.nextInt();

        if (aazu == lazu){      // Despues de pedir los valores comparamos el ancho y largo del azulejo para comprobar que es rectangular
            System.out.println("El azulejo no puede ser cuadrado");
        }
        else {                  // Una vez sabes que es rectangular comprobamos que la pared no sea mas pequeña que el azulejo
            int totalpared;
            totalpared = apared * lpared;

            int totalazu;
            totalazu = aazu * lazu;
                                        // Si todo se cumple correctamente haremos una division entre el tamaño de la pared y los azulejos que nos devuelve la menor cantidad de azulejos necesarios
            if (totalazu>totalpared){
                System.out.println("El azulejo no puede ser mayor que la pared");
            }
            else {
                int azulejos = totalpared / totalazu;

                System.out.println("Necesitaremos un total de: " + azulejos + " azulejos");
            }
        }
    }
}
