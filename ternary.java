import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(a>b?"A is Greater":"B is Greater");// if else alternate version

        boolean rain=false;

        System.out.println(rain?"Take an umbrella":"Enjoy the sunlight");
    }
}
