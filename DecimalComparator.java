public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double testNum1, double testNum2) {
        if ((int)(testNum1*1000) == (int)(testNum2*1000)) {
            return true;
        } else return false;
    }
}