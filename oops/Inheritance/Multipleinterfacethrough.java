// package oops.Inheritance;

interface father{
    void height();
}

interface mother{
    void color();
}

class child implements father,mother{
    public void height(){
        System.out.println("father height");
    }

    public void color(){
        System.out.println("Mother color..");
    }
}

public class Multipleinterfacethrough {
    public static void main(String[] args) {
        
        child c=new child();
        c.height();
        c.color();
    }
}
