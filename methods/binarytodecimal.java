import java.util.Scanner;

public class binarytodecimal {
    public static int bintodeci(int n){
        int decimal=0, power=0;
        while(n!=0){
            int reminder=n%10;
            decimal+=reminder* Math.pow(2, power);
            n/=10;
            power++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Binary number: ");
        int n=sc.nextInt();
        System.out.print("Decimal number : "+bintodeci(n));
        bintodeci(n);
        
    }
}
