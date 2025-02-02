public class ClassandObject {
    int a=10;//initialized in class not in main function
    int b=20;
    public static void main(String[] args) {
        ClassandObject obj=new ClassandObject();//it create a object for a class
        System.out.println(obj.a);//call the value using object
    }
}
