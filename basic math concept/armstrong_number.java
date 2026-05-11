import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int sum=0;
        int count=(int)(Math.log10(m)+1);
        while(m>0){
            int rem=m%10;
            sum=sum+((int)(Math.pow(rem,count)));
            m=m/10;
        }
        if(n==sum){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong ");
        }
         
    }
}
