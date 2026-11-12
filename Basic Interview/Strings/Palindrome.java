// package Basic Interview.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="Madam";
        str=str.toLowerCase();

        boolean ispalindrome=true;

        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                ispalindrome=false;
                break;
            }
            start++;
            end--;
        }

        if(ispalindrome){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
