// package Basic Interview.Strings;

public class Longestword {
    public static void main(String[] args) {
       String str="I love programming";

    //    String words[]= str.split(" ");

    //    String longest="";
    //    int max=0;


    //    for(int i=0;i<words.length;i++){
    //             if(words[i].length()>max){
    //                 max=words[i].length();
    //                 longest=words[i];
    //             }
    //    }

    //    System.out.println("Longest word: "+longest+", count: "+max);


    String current="";
    String longest="";

    for(int i=0;i<str.length();i++){
        char ch=str.charAt(i);

        if(ch!=' '){
            current+=ch;
        }else{
            if(current.length()>longest.length()){
                longest=current;
            }

            current="";
        }


    }

    if(current.length()>longest.length()){
        longest=current;
    }

    System.out.println("Longest word: "+longest);
        
    }


}
