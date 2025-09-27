public class Exceptions {
    public static void main(String[] args) {
        int i=1;
        try{
            int j = i/0;
            System.out.println("its fine");
        } catch (Exception e ) {
            System.out.println("Divided by Zero Exception : BKL kaisa karta thu ");
        } finally {
            System.out.println("koi farak nahi padtha : ye toh run ho hi jaata");
        }
    }
}
