// package DSA.Strings;

public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        // output true;

        boolean anagram=true;

        if(s1.length()!=s2.length()){
            anagram=false;
        }else{

            for(int i=0;i<s1.length();i++){
                boolean found=false;
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                       
                        found=true;
                        break;
                    }
                }
                if(!found){
                   anagram=false;
                   break;
                }
            }
        }
        System.out.println(anagram);


        
    }
}
