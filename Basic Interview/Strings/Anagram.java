// package Basic Interview.Strings;

public class Anagram {
    public static void main(String[] args) {
        String str1="Pravesh";
        String str2="raphsev";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        boolean isanagram=true;

        if(str1.length()!=str2.length()){
            isanagram=false;
           
        }else{

            boolean visited[]=new boolean[str2.length()];
            
            for(int i=0;i<str1.length();i++){
                boolean isfound=false;

                for(int j=0;j<str2.length();j++){

                    if(str1.charAt(i)==str2.charAt(j) && !visited[j]){
                        visited[j]=true;
                        isfound=true;
                        break;

                    }
                }

                if(isfound==false){
                    isanagram=false;
                    break;
                }
            }
        }
       

        if(isanagram){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
