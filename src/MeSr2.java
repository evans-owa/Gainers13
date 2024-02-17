public class MeSr2 {
    public static void main(String[] args) {
        // take an amount of array it exanpandable
        System.out.println(sum(3,2,4,20,90,10,1,100,11,46));
        System.out.println(sum(new int[]{1,5,3,5,6,9}));



    }
    //int...number is a variable length, other parameters comes before it
    //number is like an identifier and the triple dots (...) is an ellipse accept range of number
    // the parameter in the method below is like an array
    public static int sum(int...number ){
        int sum = 0;
        for (int i = 0; i<number.length; i++)
            sum += number[i];
        return sum;
    }
//
//    public static int sumThree(int x, int y, int z){
//        return x + y + z;
//    }
//
//    public static int sumFour(int q,int z, int d, int f){
//        return  q + z + d + f;
//    }
//    public static int sumFive(int r,int h, int m, int n){
//        return  r + h + m + n;
//    }
}
