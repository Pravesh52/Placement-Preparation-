// package Basic Interview.Strings;

public class nonrepeating {
    public static void main(String[] args) {
        String str="ababcbd";

        int freq[]=new int[256];

        // count frequency

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            freq[ch]++;
        }

        // find first non repeating character

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]==1){
                System.out.println(ch);
                // break;
            }
        }



    }
}
