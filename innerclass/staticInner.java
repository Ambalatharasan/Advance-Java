//Static Inner Class
class outer{
    static int a=10;
    static int b=20;
    static class inner{
        void display(){
            System.out.println("A: "+a);
            System.out.println("B: "+b);
        }
    }
}
public class staticInner {
    public static void main(String[] args) {
        outer.inner i=new outer.inner();
        i.display();
    }
}
