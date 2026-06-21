public class Majority_Element {
    public static void main(String[] args){
        int arr[]={7,0,0,1,7,7,2,7,7};
        int count=0;
        int element=0;
        for(int i=0;i<=arr.length-1;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }
            else if(element==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==element){
                count1++;
            }
            if(count1>(arr.length)/2)
            {
                System.out.println(element);
            }
        }
    }
}
