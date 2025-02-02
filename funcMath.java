import java.util.Scanner;

public class funcMath {
    void add(int a,int b){
        int sum=a+b;
        System.out.println("Addition: "+sum);
    }
    void sub(int a,int b){
        int sum=a-b;
        System.out.println("Subtraction: "+ sum);
    }
    void mult(int a,int b){
        int sum=a*b;
        System.out.println("Multiplication: "+ sum);
    }
    void div(int a,int b){
        int sum=a/b;
        System.out.println("Division: "+ sum);
    }
    public static void main(String[] args) {
        funcMath obj=new funcMath();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.add(a, b);
        obj.sub(a, b);
        obj.mult(a, b);
        obj.div(a, b);
    }

}
