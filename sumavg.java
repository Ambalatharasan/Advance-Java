import java.util.Scanner;

public class sumavg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        System.out.println("Sum "+sum);
        int avg=sum/5;
        System.out.println("average "+avg);
        if(avg<35)
            System.out.println("Additional Class Required");
        else
            System.out.println("You are good to go...");
    }
}
