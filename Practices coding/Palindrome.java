public class Palindrome {
    public static void main(String[] args) {
        String str="Madam";
        str=str.toLowerCase();

        int left=0;
        int right=str.length()-1;

        boolean ispalindrome=true;

        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                ispalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(ispalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
