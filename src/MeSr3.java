import java.util.Arrays;

public class MeSr3 {
    public static void main(String[] args) {

        // fll(array , value) fill the whole array
        int[]  numbers1 = new int[4];
        Arrays.fill(numbers1, 3);


        for (int i = 0; i<=numbers1.length-1; i++)
            System.out.print(numbers1[i] + " ");

        System.out.println();


        // fill fromIndex to  toIndex  the value
        // fill(array, fromIndex , toIndex, value)

        int[] numbers2 = new int[8];
        Arrays.fill(numbers2,3,7,5);

        for (int i = 0; i<=numbers2.length-1; i++)
            System.out.print(numbers2[i] + " ");
    }
}
