package ru.mirea.pr1;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Dog d1=new Dog("Alberto",49);
        Dog d2=new Dog("Valera");
        Dog d3=new Dog(56);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        d1.IntoHumanAge();
        d2.IntoHumanAge();
        d3.IntoHumanAge();
    }
}
