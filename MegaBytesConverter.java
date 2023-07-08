public class MegaBytesConverter {
  
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        
        int QtyMb = kiloBytes / 1024;    
        int remMb = kiloBytes % 1024;
        
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
        System.out.println(kiloBytes+" KB = "+QtyMb+" MB and "+
                                        remMb+" KB");
        }
    }
}