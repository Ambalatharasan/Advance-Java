class addition{
    public void add(){
        int a=10;
        int b=20;
        System.out.println("Addition: "+(a+b));
    }
    public void sub(int x,int y){
        System.out.println("Subtraction: "+(x-y));
    }
}
public class noReturn {
    public static void main(String[] args) {
        addition obj=new addition();
        obj.add();
        obj.sub(56, 10);
    }
}
