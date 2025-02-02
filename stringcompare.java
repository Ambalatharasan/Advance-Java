public class stringcompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";//value store in string pool, it indicate same memory address
        String a = new String("Hello");
        String b = new String("Hello");//value store as object in heep memory, each have different memory address
        System.out.println(a==b);//it check the content of the value
        System.out.println(a.equals(b));//it check the content of the object
        System.out.println(str1==str2);
    }
}
