// package oops.Inheritance;


class Animal{
    void eat(){
        System.out.println("Animal eat....");
    }
}
class dog extends  Animal{
    void sound(){
        System.out.println("dog bark....");
    }
}

class puppy extends  dog{
    void bark(){
        System.out.println("Puppy is weeping..");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        puppy p=new puppy();
        p.bark();
        p.sound();
        p.eat();
    }    
}
