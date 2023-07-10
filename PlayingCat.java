public class PlayingCat {
   public static boolean isCatPlaying(boolean summer, int temperature){
       if (temperature >= 25) {
            if (((summer == false) && (temperature <= 35)) || ((summer == true) && (temperature <= 45))) {
                return true;
            } else return false;
       } else return false;
   }
}