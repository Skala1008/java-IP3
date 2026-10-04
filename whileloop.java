
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        int num_rev=0;
        while(num>0){
            int digit=num%10;
            num_rev=num_rev*10+digit;
            num/=10;
        }
         System.out.println(num_rev);
    }
}
