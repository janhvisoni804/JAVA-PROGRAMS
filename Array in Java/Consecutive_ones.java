public class Consecutive_ones {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,1,1};
        int count=0;
        int maximum=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==1){
                count++;
                maximum=Math.max(maximum, count);
            }
            else{
                count=0;
            }
        }
        System.out.println(maximum);
    }
}
