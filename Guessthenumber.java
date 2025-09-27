import java.util.Scanner;

public class Guessthenumber {
    public static void main(String[] args) {
        int mynumber = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int yournumber = 0;

        do { 
            System.out.println("guess my number");
            yournumber = sc.nextInt();
            if(yournumber > mynumber) {
                System.out.println("sorry your guess greater than my number");
            } else if ( yournumber == mynumber ) {
                System.out.println("you are correct");
                break;
            } else {
                System.out.println("sorry your guess is lesser than my number");
            }            
        } while (true);
    }
}
