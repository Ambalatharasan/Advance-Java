import java.util.Scanner;

public class midarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int mid=a.length/2;
        for(int i=0;i<a.length;i++){
            if(i==mid)
                System.out.println(a[i]);
        }
    }
}
