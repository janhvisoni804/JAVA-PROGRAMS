public class zeros_at_end{
    public static void main(String[] args) {
        int arr[]={1,0,2,3,2,0,0,4,5,1};
        int first_zero=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                first_zero=i;
                break;
            }
        }
        if(first_zero==-1){
            System.out.println("no zero elements");
        }
        else{
            for(int i=first_zero+1;i<=arr.length-1;i++){
                if(arr[i]!=0){
                    int temp=arr[i];
                    arr[i]=arr[first_zero];
                    arr[first_zero]=temp;
                    first_zero++;
                }
            }
            for(int i=0;i<=arr.length-1;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
