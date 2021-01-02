public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2462));
    }


    public static int getEvenDigitSum(int number){
        int even=0;
        int sum=0;
        if (number<0)
            return -1;
        else {
            for(int i=0;number!=0;i++){
                if((number%10)%2==0){
                    sum=sum+(number%10);
                }
            number=number/10;
            }
            return sum;

        }
    }
}
