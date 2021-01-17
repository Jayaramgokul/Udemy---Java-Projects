public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(404));
    }


public static boolean isPalindrome(int number){
    double reverse=0;
    int orig=number;
    int num=number;
    int dig=0;
    int len=0;
    double temp=0;

    for (int i=0; num!=0; i++) {
        len++;
        num = num / 10;
    }

    for (int i=0; number!=0; i++)
    {
        dig=number%10;
        temp=Math.pow(10,(len-(i+1)));
        reverse=reverse+(temp*dig);
        number=number/10;
    }

    if (orig==reverse)
        return true;
    else
        return false;
}

}
