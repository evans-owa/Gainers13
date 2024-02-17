import java.util.Arrays;
import java.util.Scanner;

public class MeSr6 {
    public static void main(String[] args) {
// Accepting number from use the doing the sot
        System.out.print("insert number: ");
        Scanner number = new Scanner(System.in);

        int[] kwetu = new int[7];
        kwetu[0]= number.nextInt();
        kwetu[1]= number.nextInt();
        kwetu[2]= number.nextInt();
        kwetu[3]= number.nextInt();
        kwetu[4]= number.nextInt();
        kwetu[5]= number.nextInt();
        kwetu[6]= number.nextInt();

        int searchElement = 5;
        Arrays.sort(kwetu);
        System.out.println(Arrays.toString(kwetu));

        System.out.print("the number is at:");
        System.out.println((Arrays.binarySearch(kwetu, 4)));



    }
}
