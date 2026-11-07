// package oops.Polymorphism;

// Method overriding: 
// when a child provides is own implementation of a method that is already defined in a parent class.
// that's are run time decided based on the actual object.

class Animal{
    void sound(){
        System.out.println("Animal sound..");
    }
}

class dog extends Animal{
    @Override 

    void sound(){
        System.out.println("dog barking..");
    }
}

class cat extends Animal{

    @Override 

    void sound(){
        System.out.println("cat sound..");
    }
}
public class Runtime {
    public static void main(String[] args) {
        // Animal a=new dog();
        // a.sound();

        // Animal b=new cat();
        // a.sound();

        Animal a;
        a=new dog();
        a.sound();

        a=new cat();
        a.sound();
    }
}
