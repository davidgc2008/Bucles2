/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package jdgc.proyect_1;

import java.util.Scanner;

/**
 *
 * @author usuariom
 */
public class Proyect_1 {

    public static void main(String[] args) {
        testingSwitch();
        testingSwitch2();
// Voy a la discoteca y si soy mayor de 18 años. Si tengo dinero me pido una Coca Cola
// Ponen a DJ Tiesto  y me pongo a bailar. SI NO soy mayor, me voy al cine.
// Si esta Resident Evil la veo y SINO, me voy a la bolera. Antes de irme del cine,
// me tomo un helado   
    }

    public static void testingSwitch() {
        //Pedimos un numero y lo convertimos a dia de la semana correspondiente
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type a number between 1-7ñ");
        number = keyboard.nextInt();
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thrusday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");

        }

    }

    public static void testingSwitch2() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please type a number between 1-7");
        int number = keyboard.nextInt();

        switch (number) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thrusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Wrong day");

        }
    }
}
