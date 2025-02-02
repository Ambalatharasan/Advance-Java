import java.util.*;
public class funcDatatype {
    int number(int a,int b){
        return a+b;
    }
    float point(int a,int b){
        return (float)a/(float)b;
    }
    int phone(){
        return 123456798;
    }
    String name(){
        return "Hello";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int ph=sc.nextInt();
        funcDatatype obj=new funcDatatype();
        // obj.number(a, b);
        int phone = obj.phone();
        System.out.println(phone);
        // obj.point(a, b);
        String name= obj.name();
        System.out.println(name);
        System.out.println(obj.number(a, b));
        System.out.println(obj.point(a, b));

    }
}
