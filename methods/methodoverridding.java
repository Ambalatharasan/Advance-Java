class user{//base class
    String name;
    int age;
    user(String n,int a){
        this.name=n;
        this.age=a;
    }
    void output(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class company extends user{//derive class
    String companyname;
    company(String n, int a, String c){
        super(n, a);
        this.companyname=c;
    }
    
    void output(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Company Name: "+companyname);
    }
}
public class methodoverridding {
    public static void main(String[] args) {
        company u=new company("Val", 21,"ABC");
        u.output();
    }
}
