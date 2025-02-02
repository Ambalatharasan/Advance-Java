public class inheriTask2 {
    static class vehicle{
        String brand;
        int year;
        void startEngine(){
            System.out.println("Engine started");
        }
    }
    static class car extends vehicle {
        String fuelType;;
        @Override
        void startEngine() {
            System.out.println("Car engine started");
        }
        void drive(){
            System.out.println("Car is driving");
        }
    }
    static class truck extends vehicle{
        int loadCapacity;
        @Override
        void startEngine() {
            System.out.println("Truck engine started");
        }
        void haul(){
            System.out.println("Truck is hauling");
        }
    }
    public static void main(String[] args) {
        car c=new car();
        c.brand="Toyota";
        c.year=2021;
        c.fuelType="Petrol";
        c.startEngine();
        c.drive();

        truck t=new truck();
        t.brand="Ford";
        t.year=2022;
        t.loadCapacity=5000;
        t.startEngine();
        t.haul();
    }
}
