import java.util.Arrays;
import java.util.Scanner;

public class returnarraySort {
    public static int[] sort(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        Arrays.sort(a);
        return a;
    }
    public static void main(String[] args) {
        int arr[]=sort();
        for(int b:arr)
            System.out.println(b);
    }
}
