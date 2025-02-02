import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if((n%3)==0 && (n%5)==0)
        System.out.println("The given number is divisible by 3 and 5");
    else
        System.out.println("The given number is not divisible by 3 and 5");
}
}