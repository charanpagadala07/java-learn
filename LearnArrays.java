import java.util.Arrays;

public class LearnArrays {
    public static void main(String[] args) {
        //arrays creation
        int[] marks = new int[3];
        marks[0] = 45;
        marks[1] = 64;
        marks[2] = 32;
        System.out.println(marks[2]);

        //length
        System.out.println(marks.length);

        //sort
        Arrays.sort(marks);
        System.out.println(marks[2]);

        int[] marks2 = {97, 98, 95}; //when the elements to be stored are already known no need to use new keyword
        


        // 2-D ARRAYs
        int[][] finalmarks = {{32,45,54}, {54,34,56}, {87,97,87}};
        System.out.println(finalmarks[0][0]);

        int[][] finalmarks2 = new int[3][3];
        finalmarks2[0][0] = 65;
        System.out.println(finalmarks2[1][1]);
    }
}
