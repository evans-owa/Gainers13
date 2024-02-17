public class Main {
    public static void main(String[] args) {
        // recap
        printPrime(2,19);
    }

    public static boolean isPrime(int x){
        for (int i = 2; i<=x/2; i++)
            if (x % i == 0 )
                return false;
        return true;
    }

    public static void printPrime(int q, int r){
        for (int j= q; j<=r; j++)
            if (isPrime(j))
                System.out.print(j + " ");
    }

}