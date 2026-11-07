public class frequencycount {
    public static void main(String[] args) {
        String str="aabccba";

        for(int i=0;i<str.length();i++){
            boolean alreadycount=false;
            int count=0;

            for(int k=0;k<i;k++){
                if(str.charAt(i)==str.charAt(k)){
                    alreadycount=true;
                    break;
                }
            }

            if(alreadycount){
                continue;
            }

            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            System.out.println(str.charAt(i)+" "+count);
        }
    }
}
