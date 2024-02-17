import java.util.Arrays;

public class MeSr1 {
    public static void main(String[] args) {

        String[] ourNames = new String[4];

        ourNames[0] = "omena";
        ourNames[1] = "juliet";
        ourNames[2] = "markos";
        ourNames[3] = "keshi";



        System.out.println();
        Arrays.sort(ourNames)
        ;

        System.out.println(Arrays.binarySearch(ourNames, "keshi"));

        for (int i = 0; i<=ourNames.length-1; i++)
            System.out.print(ourNames[i] + " ");
    }
}
