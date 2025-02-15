//the method overloading is appear when the function names are same, but different parameter and return type[int,double,float,...]
class addition{
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double x,double y){
        return x+y;
    }
    public static double add(double i, int j){
        return i+j;
    }
    public static int add(int h){
        return h+h;
    }
}
public class methodoverloading {
    public static void main(String[] args) {
        System.out.println("Addition of 2 integer: "+addition.add(5,6));
        System.out.println("Addition of 2 Double: "+addition.add(5.5,6.1));
        System.out.println("Addition of integer and double: "+addition.add(5.1,6));
        System.out.println("Addition of 2 integer: "+addition.add(2));
    }

}
