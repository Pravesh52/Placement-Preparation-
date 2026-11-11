
public class MissingXOR {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,4};
        int n=arr.length+1;

        int xor=0;

        for(int i=0;i<=n;i++){
            xor=xor^i;
        }

        // XOR ELEMENT FIND

        for(int i=0;i<arr.length;i++){
             xor=xor^arr[i];
        }

        System.out.println(xor+" ");
    }
}
