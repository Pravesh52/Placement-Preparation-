// package Basic Interview.Strings;

public class countvowerconso {
    public static void main(String[] args) {
        String str="Pravesh";
        str=str.toLowerCase();
        int countvowel=0;
        int countconso=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
                countvowel++;
            }else{
                countconso++;
            }
        }

        System.out.println("Vowel: "+countvowel);
        System.out.println("Conso: "+countconso);
    }
}
