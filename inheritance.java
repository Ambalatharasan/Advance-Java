public class inheritance {

    class mobile{
        int price= 20000;
    }
    class smartphone extends mobile{
        String brand="OnePlus";
    }
    public static void main(String[] args) {
        inheritance obj = new inheritance();
        smartphone smartphone = obj.new smartphone();
        System.out.println(smartphone.brand);
    }
}
