package com.company;

public class Dog {

//domyslny kwantyfikator dostepu to teaki ze dostepny tylko w danym pakiecie - czyli coś mniej niz public
    public String name;
    private int numberOfLegs;
    // static cos co jest dla całej klasy, nie musze miec obiektu by ja wywołać



    public void szczekanie (){
        System.out.println("Hau hau hau");
    }

    public Dog(String name){
        this();// wywołanie konstruktora bez parametru
        this.name = name;
    }

    public Dog(String name, int numberOfLegs){
        this(name);
        this.numberOfLegs = 4;
    }

    public static void sayHau(){
        System.out.println("hau");
    }

//konstruktor nie tworzy obiektu tylko wstrzykuje wartości - obiekt tworzt słówko new
    public Dog(){
        this.numberOfLegs = 4;
    }


    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }





}
