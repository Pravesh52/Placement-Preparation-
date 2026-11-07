// package oops.Abstraction;

interface Payments{
    void pay();
}

class Phonepay implements Payments{
    public void pay(){
        System.out.println("PhonePay payment successful...");
    }
}

class Paytm implements Payments{
    public void pay(){
        System.out.println("Paytm payment successful..");
    }
}

public class interfacethrough {
    public static void main(String[] args) {
        
        Payments p;
        p=new Phonepay();
        p.pay();
    
        p=new Paytm();
        p.pay();
    }
    
}
