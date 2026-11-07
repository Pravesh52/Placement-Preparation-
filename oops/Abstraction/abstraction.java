// package oops.Abstraction;

abstract class Animal{

    // abstract method
    abstract void sound();

    void eat(){
        System.out.println("Animal eating..");
    }
}

class dog extends Animal{
    void sound(){
        System.out.println("dog barking..");
    }
}
public class abstraction {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.sound();
    }
    
}
