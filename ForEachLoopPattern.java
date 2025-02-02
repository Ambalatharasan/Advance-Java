public class ForEachLoopPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i:new int[n]){ //for-each loop is only applicable for array
            for(int j:new int[n]){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
