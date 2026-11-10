// package oops.Inheritance;


class Animal{
    void sound(){
        System.out.println("Animal sound..");
    }
}

class dog extends  Animal{
    void bark(){
        System.out.println("dog barking...");
    }
}

class cat extends Animal{
    void eat(){
        System.out.println("Cat eating..");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        dog d=new dog();
        d.sound();
        d.bark();

        cat c=new cat();
        c.eat();
        c.sound();
    }
}
