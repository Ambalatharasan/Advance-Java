public class returnarray {

    public static int[] array(){
        return new int[]{1,2,3};
    }
    public static void main(String[] args) {
        int a[]=array();
        for(int b:a){
            System.out.println(b);
        }
    }
}
