public class funcSum {
        int a=10;
        int b=20;
    void sum(){
        int sum=a+b;
        System.out.println("Sum="+sum);
    }
    public static void main(String[] args) {
        funcSum obj=new funcSum();
        obj.sum();
    }
}

// import java.util.Scanner;

// public class FunctionSum {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter first number: ");
//         int a = scanner.nextInt();

//         System.out.print("Enter second number: ");
//         int b = scanner.nextInt();

//         sum(a, b);
//     }

//     public static void sum(int a, int b) {
//         int sum = a + b;
//         System.out.println("Sum = " + sum);
//     }
// }