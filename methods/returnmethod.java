class maths{
    public int mul(){
        int a=10;
        int b=15;
        return a*b;
    }
    public int div(int x, int y){
        return x/y;
    }
}

public class returnmethod {
    public static void main(String[] args) {
        maths obj=new maths();
        
        System.out.println("Multiple: "+obj.mul());
        System.out.println("Division: "+obj.div(50,5));
    }
}
