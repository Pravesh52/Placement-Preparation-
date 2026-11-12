// package Basic Interview.Strings;

public class findduplicates {
    public static void main(String[] args) {
        String str="ababcd";

        int freq[]=new int[256];

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            freq[ch]++;
        }

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(freq[ch]>1){
                System.out.println("Duplicates: "+ch);
                freq[ch]=0;
                
            }
        }
    }
}
