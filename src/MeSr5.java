public class MeSr5 {

    public static void main(String[] args) {
        int[] numbers = {6,6,8,4,5,6};

        int product = 1;
        int sum = 0;
        double aveg;

//        using for loop

        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
            product *= numbers[i];
        }
        aveg = (double) sum/numbers.length;

        System.out.println("sum:= " + sum + " product:= " + product + " average:= " + aveg);

//        Using methods
        System.out.println(sum(numbers));
        System.out.println(product(numbers));
        System.out.println(average(numbers));
    }

    public static int product(int...number){
        int product = 1;
        for (int i = 0; i<=number.length-1; i++)
            product *= number[i];
        return product;
    }

    public static int sum(int...kitty){
        int sum = 0;
        for (int i = 0; i<=kitty.length-1; i++)
            sum += kitty[i];
        return sum;
    }
    public static double average(int...mean1){
        double aveg = 0;
        for (int i = 0; i<=mean1.length; i++)
            aveg = (double) sum(mean1) / mean1.length-1;
//
        return  aveg;
    }
}
