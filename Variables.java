public class Variables {
    public static void main(String[] args) {
        //primitive
        byte age = 21;
        short marks = 670;
        int salary = 60000;
        long phone = 909128391023983L;
        char grade = 'A';
        boolean isPass = true;
        float pi = 3.14F;
        double pi2 = 3.14159265358979323846;
        System.out.println(salary);


        //Non-Primitive
        String name = "charan"; // reuses object
        String name1 = new String("charan"); //creates new object
        String name2 = new String("charan"); // creates new object
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name);
    }
}
