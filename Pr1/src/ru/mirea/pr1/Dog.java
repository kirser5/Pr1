package ru.mirea.pr1;
import java.lang.*;
public class Dog {
    private String name;
    private int age;
public Dog(String n, int a){
  name=n;
  age=a;
}
public Dog(String n){
    name=n;
    age=14;
}
public Dog(int a){
    name="Fanfurik";
    age=a;
}
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void IntoHumanAge(){
    System.out.println(name+"'s age into human age: "+age/7+" years ");
    }
}