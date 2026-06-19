public class duplicate_elements{
    public static int duplicate(int[] arr){
        int j=0;
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]!=arr[j]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3};
        int k=duplicate(arr);
        for(int i=0;i<=arr.length-1;i++){
            if(i<k){
                System.out.print(arr[i]+" ");
            }
            else{
                System.out.print('_'+" ");
            }
        }
    }
}
