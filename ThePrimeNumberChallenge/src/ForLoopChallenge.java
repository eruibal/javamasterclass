public class ForLoopChallenge {
    public static void main(String[] args) {
        int primeCounter = 0;
        for ( int i = 1; i <= 1000; i++) {
            if (primeCounter < 3) {
                if (isPrime(i)) {
                    primeCounter++;
                    System.out.println("The prime number found is "+i);
                }
            } else {
                System.out.println("The value of counter is "+primeCounter);
                break;
            }
        }
    }
    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for ( int divisor = 2 ; divisor <= wholeNumber/2; divisor++) {
            if ( wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
