public class oop2 {
    class outer{
        static class inner{
            void printer(){
                System.out.println("Hello Guys");
            }
        }
    }
    public static void main(String[] args){
        outer.inner A1=new outer.inner();
        A1.printer();
    }
}
