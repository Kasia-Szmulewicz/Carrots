package com.company;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args){
       // int a = 12;
       /* if (a > 0 && a < 5){
            System.out.println("Jest podzielna przez 2");
        }else if(a > 5 && a < 10){
            System.out.println("Nie podzielna przez 2");
        }else{
            System.out.println("Nie podzielna przez 2");
        }
        */

       //instrukcja wyboru
      /* switch (a){
           case 1:
               System.out.println("1");
               break;
           case 2:
               System.out.println("2");
               break;
           case 3:
               System.out.println("3");
               break;
           default:
               System.out.println("nie pasuje");
       }

       while (a < 10){
               System.out.println(a);
               a++;
       }
        */

//      do{
//          System.out.println(a);
//          a++;
//      }while (a<10);

//    while(true) {
//    System.out.println("Daj liczbe:");
//    Scanner scanner = new Scanner(System.in);
//    int liczba = scanner.nextInt();
//    System.out.println("Podaj dzielnik");
//    int dzielnik = scanner.nextInt();
//
//    while (dzielnik == 0) {
//
//        System.out.println("Pamiętaj nie dziel przez zero!");
//        System.out.println("Podaj dzielnik jeszcze raz");
//        dzielnik = scanner.nextInt();
//    }
//
//    double wynik = (double) liczba / dzielnik;
//    System.out.println("Wynik to:  " + wynik);

        String[] tab = {"A", "B", "C", "D", "E"};
        int wynik = 0;
        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
            wynik += tab[i].length();
//.toLower.Case()
            }
        System.out.println("Suma liter: " + wynik+ "\n");
        System.out.println("foreach");
        for (String x:tab) {
            System.out.println(x);
        }

    }
}
