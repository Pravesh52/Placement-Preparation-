// package DSA.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="Nitin";
        str=str.toLowerCase();

        boolean Palindrome=true;

        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                Palindrome=false;
                break;
            }
        }
       
        if(Palindrome){
            System.out.println("String is Palindrome..");
        }else{
            System.out.println("Not a Palindrome..");
        }
    }
}
