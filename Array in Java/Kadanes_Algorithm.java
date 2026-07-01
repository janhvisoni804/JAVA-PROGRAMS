public class Kadanes_Algorithm {
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int start=-1,AnsStart=-1,AnsEnd=-1;
        for(int i=0;i<=arr.length-1;i++){
            if(sum==0){
                start=i;
            }
            sum=sum+arr[i];
            if(sum>max_sum){
                max_sum=sum;
                AnsStart=start;
                AnsEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max_sum);
        for(int i=AnsStart;i<=AnsEnd;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
