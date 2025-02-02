public class func1 {
    void iphone(){
        System.out.println("Iphone");
        samsung();
    }
    void samsung(){
        System.out.println("Samsung");
        mi();
    }
    void mi(){
        System.out.println("mi");
        vivo();
    }
    void vivo(){
        System.out.println("vivo");
    }
    public static void main(String[] args) {
        func1 obj=new func1();
        obj.iphone();
    }
}
