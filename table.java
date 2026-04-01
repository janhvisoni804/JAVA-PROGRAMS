import java.util.Scanner;

public class table {

    public static void table(int a){
        for(int i=1;i<=10;i++){
            System.out.println(a+" "+"x"+" "+i+" "+"="+" "+a*i);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number: ");
        int a=sc.nextInt();
        table(a);
    
    }
}