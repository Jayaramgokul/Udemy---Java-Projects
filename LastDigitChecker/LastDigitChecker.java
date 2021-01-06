public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12,74,62));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1>=10 && num2>=10 && num3>=10 &&num1<=1000&&num2<=1000&&num3<=1000){
            if ((num1%10)!=(num2%10)&&(num1%10)!=(num3%10)&&(num2%10)!=(num3%10))
                return false;
            else
                return true;
        }
        return false;
    }
}
