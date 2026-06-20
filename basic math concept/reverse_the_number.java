import java.util.Scanner;
public class reverse_the_number{
    public static int reverse(int n){
        if(n<=0){
            return 0;
        }
        else{
            int rev_no=0;
            while(n>0){
                int rem=n%10;
                rev_no=(rev_no*10)+rem;
                n=n/10;
            }
            return rev_no;
        }
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int ans=reverse(n);
         if(ans==0){
            System.out.println("no less than 1");
         }
         else{
            System.out.println(ans);
         }
    }
}
