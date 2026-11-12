// package Basic Interview.Strings;

public class reverseword {
    public static void main(String[] args) {
        String str="I love Programming";

        char arr[]=str.toCharArray();
        // using split

        // String words[]=str.split(" ");

        // for(int i=0;i<words.length;i++){
        //     String word=words[i];

        //     for(int j=word.length()-1;j>=0;j--){
        //         System.out.print(word.charAt(j));
        //     }

        //     System.out.print(" ");
        // }

        int start=0;

        for(int end=0;end<=arr.length;end++){
            if(end==arr.length|| arr[end] ==' '){
                int left=start;
                int right=end-1;

                while(left<right){
                    char temp=arr[left];
                    arr[left]=arr[right];
                    arr[right]=temp;
                    left++;
                    right--;

                }

                start=end+1;


            }
        }

        System.out.println(new String(arr));
    }
}
