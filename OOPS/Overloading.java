class Student{
    String name;
    String name2;

    public void printinfo(String name){
        System.out.println(name);
    }

    public void printinfo(String name, String name2){
        System.out.print(name);
        System.out.print(name2);
    }

}

public abstract class Overloading {
    public static void main(String[] args) {
        Student s = new Student();
        s.printinfo("Charan");
        s.printinfo("Charan", "Pagadala");
    }
}
