import java.util.Random;

public interface randomnum {
    public static void main(String[] args) {
        Random r=new Random();
        int a=0;
        while(a!=6){
            a=r.nextInt(10);
            System.out.println(a);
        }
    }
}
