import java.util.Scanner;
public class p3old {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.println("------Student Marksheet------");
        System.out.print("Enter the student name:");
        String studentName = st.nextLine();
        
        System.out.print("Enter the subject name:");
        String subjectName1 = st.nextLine();
        System.out.print("Enter the subject name:");
        String subjectName2 = st.nextLine();
        System.out.print("Enter the subject name:");
        String subjectName3 = st.nextLine();
        System.out.print("Enter the subject name:");
        String subjectName4 = st.nextLine();
        System.out.println("------Enter Marks for Subjects------");
        System.out.print("Enter the marks for " + subjectName1 + ":");
        int marks1 = st.nextInt();
        st.nextLine(); // Consume the newline character
        System.out.print("Enter the marks for " + subjectName2 + ":");
        int marks2 = st.nextInt();
        st.nextLine(); // Consume the newline character
        System.out.print("Enter the marks for " + subjectName3 + ":");
        int marks3 = st.nextInt();
        st.nextLine(); // Consume the newline character
        System.out.print("Enter the marks for " + subjectName4 + ":");
        int marks4 = st.nextInt();
        st.nextLine(); // Consume the newline character
        System.out.println("------Marksheet------");
        System.out.println("Student Name: " + studentName);
        System.out.println(subjectName1 + ": " + marks1);
        System.out.println(subjectName2 + ": " + marks2);
        System.out.println(subjectName3 + ": " + marks3);
        System.out.println(subjectName4 + ": " + marks4);
        st.close();
    }
}

