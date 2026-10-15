/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.bucles2;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class Bucles2 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        cajonSimulacro();
        
    }

    public static void mostrarNegativos() {
        //Pedir numeros al usuario hasta que teclee 0 y mostramos positivos y negativos
        System.out.println("Teclea un numero (0 sale)");
        int number = keyboard.nextInt();
        while (number != 0) {
            if (number < 0) {
                System.out.println(number + " ");
            }
            System.out.println("Introduce otro numero");
            number = keyboard.nextInt();
        }
    }

    public static void mostrarNegPosMultiCinco() {
        //igual que el anterior, pero contando el numero de positivos, el numero de negativos, y los multiplos de cinco
        //Pido los numeros primero
        System.out.println("Teclea un numero");
        int number = keyboard.nextInt();
        while (number != 0) {
            if (number < 0) {
                System.out.println(number + " negative ");  
            } else {
                System.out.println(number + " positive ");            
            }if (number % 5 == 0) {
                System.out.println(number + " multiple de 5 ");
            }
            System.out.println("Introduce 0 para terminar");
            number = keyboard.nextInt();
                    
        }
        System.out.println("Programa Acabado");
    }
    
    public static void cajonSimulacro(){
        System.out.println("Introduce un nº");
        System.out.println("1. Hello");
        System.out.println("2. Goodbye");
        System.out.println("3.Finish");
        int number = keyboard.nextInt();
        switch (number){
        case 1 -> System.out.println("Hello");
        case 2 -> System.out.println("Goodbay");
        case 3 -> System.out.println("Finish");
        default -> System.out.println("Wrong value, select between 1-3");
    }
//Es con bucle       
    } 
    }

