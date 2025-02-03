class school{
    void building(){
        System.out.println("Provide schooling environment.");
    }
}
class hod extends school{
    void supervision(){
        System.out.println("Supervise teachers task.");
    }
}
class teacher extends school{
    void teaching(){
        System.out.println("Educate students.");
    }
}
class students extends school{
    void exam(){
        System.out.println("Write public exam.");
    }
}
public class hierarchicalInheritance {
    public static void main(String[] args) {
        students s=new students();
        System.out.println("Student Task:");
        s.building();
        s.exam();

        teacher t=new teacher();
        System.out.println("Teachers Task:");
        t.building();
        t.teaching();
    }
}
