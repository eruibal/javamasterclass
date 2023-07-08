public class LeapYear {
    public static boolean isLeapYear (int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) { // step 2
                    if (year % 400 == 0) { //step 3
                        return true;
                    } else return false;
                }  else return true; // step 4
            } else return false; //step 5
        } else return false;
    }
}