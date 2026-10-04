public class method {
    static void say(){ //method creation
        System.out.println("Hello Guys");
    }
    static void greet(String name){
        System.out.println("Hello " +name);
    }
    static int sum(int a,int b){
        return a+b;
        
    }
    public static void main(String[] args) {
        say();//method calling
        greet("Sayam"); //method calling parameter
        int Sum1=0;
        Sum1 = sum(10,20);
        System.out.println(Sum1);
    }
}
