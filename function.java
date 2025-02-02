public class function {
    void apple(){
        System.out.println("Apple");
        // banana();
    }
    void banana(){
        System.out.println("Banana");
    }
    public static void main(String[] args) {
        function obj=new function();
        obj.apple();
        obj.banana();
    }
}
