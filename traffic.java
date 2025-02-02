import java.util.Scanner;

public class traffic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        if(a.equals("red"))
            System.out.println("Stop");
        else if(a.equals("yellow"))
            System.out.println("Get Ready");
        else if(a.equals("green"))
            System.out.println("Go");
        else
            System.out.println("Invalid Input");
        
    }
}
