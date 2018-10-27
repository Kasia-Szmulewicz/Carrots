package com.company;

public class HelloWorld {
    public static void main(String[] args){
        //typy proste
        int i;  //deklaracja zmiennej
        i = 9; //inicjalizacja
        long l = 12345678998765432L; //L na koncu by wiedział ze to L
        System.out.println(l);
        //domyslnie jest double
        float a = 3.4f;
        double d = 2.2345678;
        char ch = 'A';
        boolean b = false;

        //rzutowanie
        int y = 5;
        int x = 9;
        //int z = x/y;
        double w = (double)x/y;
        System.out.println(w);

        //typy złożone
        String name = "Kasia";
        System.out.println(name);

        //Tablica

        double [] tab = new double[10];
        int tab2[] = {1,2,3,4,5};
        tab[0] = 1.2;
        tab[1] = 2.5;
        System.out.println(tab2[3]);
        int [][]tabwielo = new int[3][];
        tabwielo[2] = new int[3];
        tabwielo[1] = new int[2];
        tabwielo[0] = new int [2];
        tabwielo[0][0] = 3;

        System.out.println(tabwielo[0][0]);

        //System.out.println("Witaj świecie");

        //operatory logiczne
        // ==
        // !=
        // <= >=
        // and &&
        //or ||
        // zaprzeczenie !



    }
}
