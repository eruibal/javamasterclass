public class Main {
    public static void main(String[] args) {
        System.out.println("sum of digits = " + sumDigits(227));
    }
    public static int sumDigits(int number) {
        int n = number;
        int extractDigit = 0;

        if (number < 0) {
            return -1;
        }
        while (n > 0) {
            extractDigit += (n % 10);
            n = (n / 10);
        } return extractDigit;
    }
}
