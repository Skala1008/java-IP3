import java.util.Scanner;
public class do_while {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pin=1234;
        int i=0;
        boolean flag=false;
        do { 
            System.out.println("pleses enter the pin");
            int ping=sc.nextInt();
            i++;
            if(ping==pin)
                {System.out.println("pin Matched");
                flag=true;
                break;}
            else
                {System.out.println("pin Invalid");}
        } while (i<3);
        if(!flag){
            System.out.println("card blocked");
        };
        
    }
}
