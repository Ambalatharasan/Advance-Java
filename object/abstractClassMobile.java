abstract class mobile{
    void call(){
        System.out.println("Can access voice call.");
    }
    abstract void camera();//these abstract functions are compulsory to call on its inherit classes 
    abstract void display();
    abstract void charger();
}
class samsung extends mobile{
    void camera(){
        System.out.println("24 Mega Pixel.");
    }
    void display(){
        System.out.println("LED display.");
    }
    void charger(){
        System.out.println("Fast Charger.");
    }
}
class realme extends mobile{
    void camera(){
        System.out.println("32 Mega Pixel.");
    }
    void display(){
        System.out.println("QLED display.");
    }
    void charger(){
        System.out.println("Super Fast Charger.");
    }
}
public class abstractClassMobile {
    public static void main(String[] args) {
        samsung s=new samsung();
        System.out.println("Samsung->");
        s.call();
        s.camera();
        s.charger();
        s.display();
        System.out.println();

        System.out.println("Realme->");
        realme r=new realme();
        r.call();
        r.camera();
        r.charger();
        r.display();
    }
}
