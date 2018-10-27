package com.company;

import java.util.Objects;

public class Osoba {

    public String imie;
    public String nazwisko;
    private Gender gender;


    public Osoba(String imie) {
        this.imie = imie;
    }
    public Osoba(String imie, String nazwisko, Gender gender){
        this(imie);
        this.nazwisko = nazwisko;
        this.gender = gender;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        Osoba osoba = (Osoba) other; // rzutowanie tego obiektu z parametru na dany typ
        return  this.imie.equals(osoba.imie) &&
                this.nazwisko.equals(osoba.nazwisko) &&
                this.gender == osoba.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, gender);
    }
}
