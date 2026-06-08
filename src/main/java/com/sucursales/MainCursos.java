package com.sucursales;

import java.util.ArrayList;

public class MainCursos {
    public static void main(String[] args) {

        
        ArrayList<Curso> sucursalA = new ArrayList<>();
        sucursalA.add(new Curso("Matemáticas", 18));
        sucursalA.add(new Curso("Física", 25));
        sucursalA.add(new Curso("Química", 20));

        ArrayList<Curso> sucursalB = new ArrayList<>();
        sucursalB.add(new Curso("Matemáticas", 32));
        sucursalB.add(new Curso("Física", 15));
        sucursalB.add(new Curso("Química", 28));
        sucursalB.add(new Curso("Biología", 32));
        sucursalB.add(new Curso("Historia", 32));
        sucursalB.add(new Curso("Geografía", 32));
        ArrayList<Curso> sucursalC = new ArrayList<>();
        sucursalC.add(new Curso("Literatura", 18));
        sucursalC.add(new Curso("Artes", 25));
        sucursalC.add(new Curso("Botánica", 20));
        sucursalC.add(new Curso("Programación", 34));

        
        ArrayList<ArrayList<Curso>> sucursales = new ArrayList<>();
        sucursales.add(sucursalA);
        sucursales.add(sucursalB);
        sucursales.add(sucursalC);

        
        int i = 0;
        for (ArrayList<Curso> sucursal : sucursales) {
            System.out.println("Sucursal " + (char)('A' + i));
            for (Curso curso : sucursal) {
                System.out.println(curso);
            }
            System.out.println();
            i++;
        }
    }
}
