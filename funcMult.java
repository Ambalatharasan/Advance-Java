public class funcMult {
    int apple_price=20;
    int apple_count=10;
    void multiple(){
        int total_price=apple_price*apple_count;
        System.out.println("Total price of apples is: "+total_price);
    }
    public static void main(String[] args) {
        funcMult obj=new funcMult();
        obj.multiple();
    }
    
}
