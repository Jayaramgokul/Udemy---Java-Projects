public class DigitSumChallenge {


    public static void main(String[] args) {

        System.out.println(sumDigits(7));

    }


    public static int sumDigits(int number){
        int sum=0;
        if (number>=10){
            int num=number;
            for (int i=1; num%10!=0;i++){

                num=num/10;
                sum = sum +num;
            }
            return sum;
        }
        else return -1;


    }
}
