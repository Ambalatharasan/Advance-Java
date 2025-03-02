//local inner class
class outer{
    void Output(){//create class in method, that can be access by that belonging methods
        class inner{
            void display(){
                System.out.println("Local Inner Class...");
            }
        }
        inner i=new inner();
        i.display();
    }
}
public class local {
    public static void main(String[] args) {
        outer o=new outer();
        o.Output();
    }
}
