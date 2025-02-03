class base{
    void employee(){
        System.out.println("I can complete task.");
    }
}
class derive1 extends base{
    void manager(){
        System.out.println("I can assign task");
    }
}
class derive2 extends derive1{
    void owner(){
        System.out.println("I own company.");
    }
}
public class multilevelInheritance {
    public static void main(String[] args) {
        derive2 d=new derive2();
        d.owner();
        d.manager();
        d.employee();
    }
}
