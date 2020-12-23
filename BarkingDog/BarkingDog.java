public class BarkingDog {
    public static void main(String[] args) {
       boolean ans= bark(true,1);
        System.out.println(ans);

    }
    public static boolean bark(boolean barking, int hourOfDay){
        if (hourOfDay>=0 && hourOfDay<=23){
        if (hourOfDay<8 || hourOfDay>22){
            if (barking==true){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
    else {
            return false;
        }
    }
}

