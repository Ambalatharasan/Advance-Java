import java.util.Scanner;

public class funEvenOdd {
    void find(int num){
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        funEvenOdd obj=new funEvenOdd();
        obj.find(num);
    }
}
