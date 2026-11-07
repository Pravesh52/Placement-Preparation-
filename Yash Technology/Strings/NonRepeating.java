// package Yash Technology.Strings;

public class NonRepeating {
    public static void main(String[] args) {
        String str="aabbcde";
        
        
        for(int i=0;i<str.length();i++){
            boolean isrepeat=false;

            for(int j=0;j<str.length();j++){

                if(i!=j && str.charAt(i)==str.charAt(j)){
                    isrepeat=true;
                    break;
                }
            }
            if(!isrepeat){
                System.out.println(str.charAt(i));
                break;
            }
        }



    }
}
