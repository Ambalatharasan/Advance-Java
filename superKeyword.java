public class superKeyword {
    static class person {
    String name;
    person(String name){//parameter for parent class
        this.name=name;// 'this' keyword is used to specify which variable can be accessed
    }
    }
    static class employee extends person{
        employee(String name){
            super(name);// 'super' keyword is used to access parent class incase of it implement any parameter to the class
        }
    }
    public static void main(String[] args) {
        employee emp=new employee("Jack");
        System.out.println(emp.name);
    }
}
