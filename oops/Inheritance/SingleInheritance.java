// package oops.Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal Eating..");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("dog barking...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
       dog d=new dog();
        d.eat();
        d.bark();
    }
}
