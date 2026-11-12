// package Basic Interview.Strings;

public class removeduplicates {
    public static void main(String[] args) {
        String str="ababcd";

        int freq[]=new int[256];

        String ans="";
        // boolean duplicates=;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            freq[ch]++;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(freq[ch]!=0){
                ans+=ch;
                freq[ch]=0;
            }

        }
        System.out.println(ans);


    }
}
