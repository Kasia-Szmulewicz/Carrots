package com.company;
import java.util.Scanner;
import java.util.Random;

public class Dicer {

    private int iloscKostek;

    public int getIloscKostek() {
        return iloscKostek;
    }

    public void setIloscKostek(int iloscKostek) {
        this.iloscKostek = iloscKostek;
    }

    public Dicer(int iloscKostek) {
        this.iloscKostek = iloscKostek;
    }

    public static void losuj(){
        System.out.println("Podaj liczbę kostek: ");
        Scanner scanner = new Scanner(System.in);
         int iloscKostek = scanner.nextInt();
         int suma = 0;
        int wynik;

       // StringBuilder stringBuilder = new StringBuilder("{");
        for(int i = 0; i < iloscKostek; i++){
            int max = 6;
            int min = 1;
            wynik = (int)(Math.random()*((max-min)+1))+min;
            suma += wynik;
            System.out.println(wynik);
    }
        System.out.println("Suma wyrzuconych kostek to: " + suma);
    }

    public static void losuj2(){
        Random random = new Random();
        System.out.println("Podaj liczbę kostek: ");
        Scanner scanner = new Scanner(System.in);
        int iloscKostek = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder("{");
        for(int i = 0; i < iloscKostek; i++){
            stringBuilder.append(random.nextInt(6)+1).append(",");
        }
        stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.length());
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
}
