abstract class bank {
    abstract void intrestRate();  //abstract method
    void openAccount(){  //concrete method
        System.out.println("Account Opened");
    }
}

class sbi extends bank{   //subclass created
    void intrestRate(){
        System.out.println("SBI Intrest Rate is 5%");
    }
}

class hdfc extends bank{  //subclass created
    void intrestRate(){
        System.out.println("HDFC Intrest Rate is 6%");
    }
}
public class oop1 {
    public static void main(String[] args) {
    System.out.println("Hello World");
        bank b1=new sbi();  //object created for subclass upcasting(parent refence to child)
        hdfc b2=new hdfc();  //object created for subclass
        b1.intrestRate();  //method calling
        b2.intrestRate();  //method calling
        b1.openAccount();  //method calling
        b2.openAccount();  //method calling
    }
}
