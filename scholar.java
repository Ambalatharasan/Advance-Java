import java.util.Scanner;

public class scholar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary=sc.nextInt();
        if(salary>=7000)
            System.out.println("ScholarShip Available");
        else
            System.out.println("Not Eligible for Scholarship");
    }
}
