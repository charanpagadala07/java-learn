import java.util.Scanner;

public class Loopsbasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do { 
            System.out.println("enter a number");
            number = sc.nextInt();
            System.out.println("your number is");
            System.out.println(number);

        } while (number>=0);

        System.out.println("THE END");
    }
}
