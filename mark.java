import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=35)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}
