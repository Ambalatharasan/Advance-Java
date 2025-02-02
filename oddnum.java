import java.util.Scanner;

public class oddnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                count++;
                // System.out.println(i);
            }
        }
        System.out.println("Odd count "+count);
    }
}
