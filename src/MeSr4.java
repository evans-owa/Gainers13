import java.awt.*;
import java.util.Arrays;

public class MeSr4 {
    public static void main(String[] args) {

        //  filling array objects
        String[] str1 = new String[4]; {}

        Arrays.fill(str1,"evanns");

        System.out.println(Arrays.toString(str1));  // printing array

        for (int i = 0; i <= str1.length-1; i++)  // printing array
            System.out.print(str1[i] + " ");


        // filling array objects
        Point[] point = new Point[3];
        Arrays.fill(point, 0 ,2, new Point(1,2));

        System.out.println(Arrays.toString(point));


        for (int i = 0; i<=point.length-1; i++)  // for printing an array
            System.out.print(point[i] + " ");
    }
}
