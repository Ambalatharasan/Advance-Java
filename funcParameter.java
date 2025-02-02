import java.util.Scanner;
public class funcParameter {
    void getchoco(int money){
        if(money==10)
            System.err.println("5 Star..");
        else
            System.out.println("Item Not Found");
    }
    void getshop(int money){
        if(money==50)
            System.err.println("Dove..");
        else
            System.out.println("Item Not Found");
    }
    public static void main(String[] args) {
        funcParameter obj=new funcParameter();
        Scanner sc=new Scanner(System.in);
        int money=sc.nextInt();
        obj.getchoco(money);
        obj.getshop(money);
    }
}
