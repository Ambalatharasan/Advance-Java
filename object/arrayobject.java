class student{
    int roll_num;
    String name;
    student(int roll_num, String name){
        this.name=name;
        this.roll_num=roll_num;
    }
    void detail(){
        System.out.println("Name: "+name);
        System.out.println("Roll Number: "+roll_num);
        System.out.println("........................................");
    }
}

public class arrayobject {
    public static void main(String[] args) {
        // student s=new student(6, "Ambalatharasan");
        // s.detail();
        student[] arr;//to declare array object for class
        arr=new student[5];//to create instance(initialize size of array)
        arr[0]=new student(1,"a");
        arr[1]=new student(2,"b");
        arr[2]=new student(3,"c");
        arr[3]=new student(4,"d");
        arr[4]=new student(5,"e");
        for(int i=0;i<arr.length;i++)
            arr[i].detail();
    }
}
