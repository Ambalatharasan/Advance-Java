///data hiding in classes

class shapeofRectangle{
    private int length, width;
    int getlength(){//getter method is used for get value from the outside of the function, when the class is 'private'
        return length;
    }
    int getwidth(){
        return width;
    }
    void setvalue(int l,int w){//setter method used for set value the object in private class
        if(l>0)
            length=l;
        else
            length=0;
        if(w>0)
            width=w;
        else
            width=0;
    }
    int area(){
        int a=length * width;
        return a;
    }
}

public class GetterandSetter {
    public static void main(String[] args) {
        shapeofRectangle o=new shapeofRectangle();
        o.setvalue(5, 5);
        System.out.println("Length: "+o.getlength());
        System.out.println("Width: "+o.getwidth());
        System.out.println("Rectangle: "+o.area());
    }
}
