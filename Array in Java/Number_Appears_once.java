public class Number_Appears_once{
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        int xor=0;
        for(int i=0;i<=arr.length-1;i++){
            xor=xor^arr[i];
        }
        System.out.println(xor);
    }
}
