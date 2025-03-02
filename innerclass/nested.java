//Nested inner class
class outer{//a class have multiple classes is called nested inner class
    int a=10;
    class inner{
        int b=20;
        void display2(){
            System.out.println("A:"+a);
            System.out.println("B: "+b);
        }
    }
    void display1(){
        inner i= new inner();
        i.display2();
        System.out.println("Direct access of B: "+i.b);
    }
}
public class nested {
    public static void main(String[] args) {
        outer o=new outer();
        o.display1();
        System.out.println("Inner object:");
        outer.inner i=new outer(). new inner();//to access inner class by the outer class object
        i.display2();
    }
}
