import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark<50)
            System.out.println("Need to Improve");
        else if(mark>=50 && mark<=70)
            System.out.println("Good Job!!");
        else
            System.out.println("Excellent Performance");
    }
}
