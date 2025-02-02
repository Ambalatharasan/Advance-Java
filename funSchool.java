import java.util.Scanner;

public class funSchool {
    String passorfail(int mark){
        if(mark>44)
            return "Pass";
        else
            return "Fail";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();
        funSchool obj=new funSchool();
        String result = obj.passorfail(mark);
        System.out.println(result);
    }
}
