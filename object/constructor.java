class rectangle{
    int length,width;
    rectangle(){//it overwrite default value instead of '0'
        length=2;
        width=5;
    }
    int area(){//without providing value for length and width, the constructor assign default value as '0'
        int a = length * width;
        return a;
    }
}

public class constructor {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        System.out.println("Rectangle value: "+r.area());
    }
}
