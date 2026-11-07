// package oops;

class students{
    private String name;
    private int age;

    // set name
    public void setname(String name){
        this.name=name;
    }
    // get name

    public String getname(){
        return name;
    }

    // set age

    public void setage(int age){
        this.age=age;
    }
    

    // get age

    public int getage(){
        return age;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        students s=new students();
        s.setname("Pravesh");
        s.setage(22);

        System.out.println(s.getname());
        System.out.println(s.getage());


    }
}
