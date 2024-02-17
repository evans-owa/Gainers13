import java.util.Scanner;
public class MeSr7 {
    public static void main(String[] args) {

        System.out.print("insert number: ");
        Scanner number = new Scanner(System.in);

        int[] kwetu = new int[7];
        kwetu[0] = number.nextInt();
        kwetu[1] = number.nextInt();
        kwetu[2] = number.nextInt();
        kwetu[3] = number.nextInt();
        kwetu[4] = number.nextInt();
        kwetu[5] = number.nextInt();
        kwetu[6] = number.nextInt();

        int searchElement = 3;
        System.out.println(" the occurrence is "+ getOccurrence(kwetu,searchElement) + " times");

    }

    public static int getOccurrence(int[] numbers, int searchElement) {
        int occ = 0;
        for (int i= 0; i<=numbers.length-1; i++)
            if (numbers[i] == searchElement)
                occ++;
        return occ;
    }
}
