public class inheriTask1 {
    static class animal{
        String name;
        int age;
        void makesound(){
            System.out.println("Animal makes sound");
        }
    }
    static class dog extends animal {
        String breed;
        @Override //it override the parent class method
        void makesound() {
            System.out.println("Dog Barks");
        }
        void fetch(){
            System.out.println("Dog is fetching");
        }
    }
    static class cat extends animal {
        String color;
        @Override
        void makesound() {
            System.out.println("Cat Meows");
        }
        void climb(){
            System.out.println("Cat is climbing");
        }
    }
    public static void main(String[] args) {
        dog d=new dog();
        d.name="Jack";
        d.age=6;
        d.breed="German Shepherd";
        d.makesound();
        d.fetch();

        cat c=new cat();
        c.name="Tom";
        c.age=4;
        c.color="Orange";
        c.makesound();
        c.climb();
    }
}
