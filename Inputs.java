import java.util.Scanner; 

public class Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = sc.nextInt();
        System.out.print(age);

        String name = sc.nextLine();
        System.out.println(name);
    }
}
