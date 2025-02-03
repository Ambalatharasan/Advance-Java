public class methodArgs {
    // public static void getname(String name) {// for access single parameter value
    //     System.out.println(name);
    // }
    public static void getname(String... name) {//for access multiple parameter in single variable. it act as array by[string...]
        for(String a:name)
            System.out.println(a);
    }
    public static void main(String[] args) {
        getname("Ram","Sam","Tom","Yack","Jack");
    }
}
