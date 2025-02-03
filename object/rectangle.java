// package object;
class rect{
    int length, width;
    void value(int x, int y){
        length=x;
        width=y;
    }
    int area(){
        int a=length * width;
        return a;
    }
}

public class rectangle {
    public static void main(String[] args) {
        rect r1=new rect();
        r1.length=10;
        r1.width=20;
        System.out.println("Area of Rectangle 1: "+r1.area());

        rect r2=new rect();
        r2.value(5, 10);
        System.out.println("Area of Rectangle 2: "+r2.area());
    }
}
