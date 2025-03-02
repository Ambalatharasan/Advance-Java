// anonymous inner class
abstract class sample{
    abstract void display();
}
class outer{
    void Output(){
        sample s=new sample() {//for access abstract class/interface in the other class is called anonymous class
            @Override
            void display(){
                System.out.println("Anonymous Class");
            }
        };
        s.display();
    }
}
public class anonymous {
    public static void main(String[] args) {
        outer o=new outer();
        o.Output();
    }
}
