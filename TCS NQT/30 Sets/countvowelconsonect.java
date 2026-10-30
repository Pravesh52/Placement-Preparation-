import java.util.Scanner;

public class countvowelconsonect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int countvowel=0;
        int countconso=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch=(char)(ch+32);
            }
            
            if(ch>='a'&& ch<='z'){

                if(ch=='a' || ch=='e'|| ch=='i' || ch=='o'|| ch=='u'){
                    countvowel++;
                }else{
                    countconso++;
                }
            }
        }
        System.out.println(countvowel);
        System.out.println(countconso);
    }
}
