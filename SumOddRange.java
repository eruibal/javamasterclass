public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 != 0) {
                return true;
            } else return false;
        }
        return false;
    }
    public static int sumOdd(int start, int end) {
        int sumTotal = 0;
        if ((end < start) != true ){
            if ( (start <= 0) != true) {
               for (int i=start; i <= end; i++) {
                    if (isOdd(i)) {
                        sumTotal = sumTotal + i;
                    }
                }
            return sumTotal;
            }
        } return -1;
    }
}