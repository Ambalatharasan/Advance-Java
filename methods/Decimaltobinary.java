import java.util.Scanner;

public class Decimaltobinary {
    public static void decitobin(int n){
        int binary[]=new int[n];
        int i=0;
        while(n>0){
            binary[i]=n%2;
            n/=2;
            i++;
        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Decimal number: ");
        int n=sc.nextInt();
        System.out.print("Binary number : ");
        decitobin(n);
        
    }
}
