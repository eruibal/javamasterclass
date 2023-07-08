public class SpeedConverter {
 

    public static long toMilesPerHour(double kilometersPerHour){

        if (kilometersPerHour < 0){
            return Math.round(-1d);
        } else return Math.round(kilometersPerHour*1/1.609);   // write your code here
        
    }
    
    public static void printConversion (double kilometersPerHour) {
    if (kilometersPerHour < 0) {
        System.out.println("Invalid Value");
    } else {
        System.out.println(kilometersPerHour+" km/h = "+
                            toMilesPerHour(kilometersPerHour)+" mi/h");
        }
    }
}