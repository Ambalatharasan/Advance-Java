class head{//base class
    void rent(){
        System.out.println("I have a Room.");
    }
}
class branch extends head{//derived class
    void user(){
        System.out.println("I can Rent.");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        branch b=new branch();
        b.rent();
        b.user();
    }
}
