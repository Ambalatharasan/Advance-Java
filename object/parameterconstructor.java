class overload{//constructor overloading- it have multiple constructor with or without parameter
    int length,width;
    overload(int x, int y){//parameter constructor
        length=x;
        width=y;
    }
    overload(int x){//single parameter constructor
        length=width=x;
    }
    overload(){//default constructor
        length=3;
        width=6;
    }
    int area(){
        return length * width;
    }
}

public class parameterconstructor {
    public static void main(String[] args) {
        overload o=new overload(4,6);
        System.out.println("Area: "+o.area());

        overload o1=new overload(6);
        System.out.println("Area: "+o1.area());

        overload o2=new overload();
        System.out.println("Area: "+o2.area());
    }
}
