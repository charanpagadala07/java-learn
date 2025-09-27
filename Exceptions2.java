public class Exceptions2 {
    public static void main(String[] args) {
        int[] marks = {97, 98, 54};
        try{
            System.out.println(marks[5]);
        } catch( Exception e){
            System.out.println("Limit Exceed ho raha re BKL");
        }
    }
}
