public class EqualSumChecker {
    public static void main(String[] args) {
        boolean jaya = hasEqualSum(1,1,1);
        System.out.println(jaya);
    }


    public static boolean hasEqualSum(int a, int b, int c) {
        if ((a + b) == c) {
            return true;
        } else {
            return false;
        }
    }
}
