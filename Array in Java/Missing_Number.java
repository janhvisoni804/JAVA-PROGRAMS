public class Missing_Number{
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        int n=arr.length+1;
        int XOR1=0;
        int XOR2=0;
        for(int i=0;i<=arr.length-1;i++){
            XOR2=XOR2^arr[i];
            XOR1=XOR1^(i+1);
        }
        XOR1=XOR1^n;
        System.out.println(XOR1^XOR2);
    }
}
