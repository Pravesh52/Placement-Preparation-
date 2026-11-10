// package oops.Polymorphism;


// Method overloading : 
//  Same method name different parameter.

class calculator{
     void add(int a,int b){
        System.out.println(a+b);
     }

     void add(int a,int b, int c){
        System.out.println(a+b+c);
     }

     void add(double a, double b){
        System.out.println(a+b);
     }
}

public class compiletime {
    public static void main(String[] args) {
        calculator c=new calculator();
        c.add(3,4);
        c.add(3, 4, 5);
        c.add(3, 4);
    }
}
