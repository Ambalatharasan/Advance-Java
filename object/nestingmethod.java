class nesting{
    private int m,n;
    nesting(int x, int y){
        m=x;
        n=y;
    }
    int large(){//one of the method
        if(m>n)
            return m;
        else
            return n;
    }
    void output(){//one of the method
        int greatest=large();//call one method in another method
        System.out.println("Largest number: "+greatest);
    }
}

public class nestingmethod {
    public static void main(String[] args) {
        nesting n=new nesting(8, 14);
        n.output();
    }
}
