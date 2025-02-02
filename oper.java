import java.util.Scanner;

public class oper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        float score=sc.nextFloat();// put decimal in float add f/F in the end for compile time input
        String dept=sc.next();// string-" "  char-' ';
        System.out.println("Name: "+name);
        System.out.println("Score "+score/10+"/10");
        System.out.println("Department "+dept);
    }
}