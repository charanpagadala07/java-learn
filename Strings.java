public class Strings {
    public static void main(String[] args) {
        //Strings

        //concatenate
        String name = "Charan";
        String name1= "Pagadala";
        String name2 = name + " and " + name1;
        System.out.println(name2);

        //charAt
        System.out.println(name.charAt(3));

        //length
        System.out.println(name.length());

        //replace
        String name5 = name.replace('a','b');
        System.out.println(name5);

        //substring
        String fullName = "Charan Pagadala";
        System.out.println(fullName.substring(0,7));
    }
}
