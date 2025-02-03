abstract class shape{//while provide abstract variable, the class also be in abstract class
    abstract void draw();//abstract class can be not have body.
    void message(){
        System.out.println("Message from Shape.");
    }
}
class rectangle extends shape {
    void draw(){//while the abstract class is not have a body, so the object need to be override by another class.
        System.out.println("Drawing a rectangle.");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.message();
        r.draw();
    }
}
