package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Dog piesel1 = new Dog();
        piesel1.name = "Piesiełek";
        System.out.println(piesel1.name);
        System.out.println(piesel1.getNumberOfLegs());
        piesel1.szczekanie();

        Dog piesel2 = new Dog("Reksio");
        System.out.println(piesel2.name);
        System.out.println(piesel2.getNumberOfLegs());
        piesel2.setNumberOfLegs(9);
        System.out.println(piesel2.getNumberOfLegs());
        Dog.sayHau(); // wywołanie statycznej metody, nazwa klasy i metoda
        //piesel1.sayHau();
*/
       //Osoba osoba1 = new Osoba("Kasia", "Kowalska", 123453);
        //System.out.println(osoba1.imie);
//        while(true) {
////            Dicer.losuj2();
////        }


//        String a = new String("Java");// ze tu musi stworzyć nowy obiekt
//        String b = new String("Java");
//        String c = "Java"; // tu mi pomyśli ze to moze to samo
//        String d = "Java";
//        System.out.println(a.equals(b));

        Osoba osoba = new Osoba("Kasia", "Szmulewicz", Gender.FEMALE);
        Osoba osoba2 = new Osoba("Kasia", "Szmulewicz", Gender.FEMALE);
        System.out.println(osoba.toString());
        System.out.println(osoba.equals(osoba2));

    }
}
