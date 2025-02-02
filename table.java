import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of Table:");
        int n=sc.nextInt();
        System.out.print("Enter the multiple of Table:");
        int table=sc.nextInt();
        for(int i=1;i<=n;i++)
            System.out.println(table+"x"+i+"="+i*table);
    }
}
