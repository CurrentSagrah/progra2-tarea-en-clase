package com.torres;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random; 
*/
import java.util.Scanner;

/*
Estudiante: Anthony Torres
Materia: Programacion II
Fecha: 13-05-2026
*/

public class Main {
    public static void main(String[] args) {

        String[][] bingo;
        bingo = new String[5][];

        Scanner sc = new Scanner(System.in);
        int min = 3;
        int max = 5;

        for (int i = 0; i < bingo.length; i++) {
            int randomNum = (int)(Math.random() * (max - min +1)) + min;
            bingo[i] = new String[randomNum];
            for (int j = 0; j < bingo[i].length; j++) {
                int aux = (int) (Math.random() * 100);
                bingo[i][j] = String.valueOf(aux);

            }
        }


        for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }

            System.out.println();
        }

      
            System.out.println("Ingrese número: ");
            String numero = sc.nextLine();
            for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo[i].length; j++) {
                if (bingo[i][j] == numero) {
                    bingo[i][j] = "x";
                } else {
                    System.out.println("no hay ese numero");
                }
            }

            System.out.println();
        }


            for (int i = 0; i < bingo.length; i++) {

            for (int j = 0; j < bingo[i].length; j++) {
                System.out.print(bingo[i][j] + "\t");
            }

            System.out.println();
        

        

    
    }

    }
}