package class01;
public class Code02_EvenTimesOddTimes {

    private static final int BITS_OF_INT = 32;

    public static void printOddTimesNum1(int[] arr){
        int eor = 0;
        for(int cur: arr){
            eor ^= cur;
        }
        System.out.println(eor);
    }

    public static void printOddTimesNum2(int[] arr){
        int eor = 0;
        for(int cur: arr){
            eor ^= cur;
        }

        // eor == a ^ b
        int rightMostOne = eor & (~eor + 1);
        int numWithRightMostOne = 0;
        for(int cur: arr){
            if ((rightMostOne & cur) == 0) {
                numWithRightMostOne ^= cur;
            }
        }

        System.out.println(numWithRightMostOne + " " + (eor ^ numWithRightMostOne));
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
    }

}