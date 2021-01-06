public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }


    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {

            int finalkb = kiloBytes % 1024;
            int finalmb = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB" + " = " + finalmb + " MB " + "and " + finalkb + " KB");
        }
    }

}
