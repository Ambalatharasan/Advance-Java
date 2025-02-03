class copy{
    private int real,imaginary;
    copy(){
        this.real=2;
        this.imaginary=4;
    }
    copy(int r, int m){
        this.real=r;
        this.imaginary=m;
    }
    copy(copy c1){//copy constructor- it copy the value of object in the external class
        this.real=c1.real;
        this.imaginary=c1.imaginary;
    }
    public String toString(){
        return "(" + real + "+" +imaginary +"i)";
    }
}

public class copyconstructor {
    public static void main(String[] args) {
        copy c=new copy();
        System.out.println("Object 1: "+c);

        copy c1=new copy(5,7);
        System.out.println("Object 2: "+c1);

        copy c2=new copy(c1);//assign c1 object value to c2 object
        System.out.println("Object 3: "+c2);
    }
}
