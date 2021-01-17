public class sum3challenge {

    public static void main(String[] args) {
        int sum=0;
        int count=0;


        for (int i=1; i<=1000;i++){
            if (i%3==0 || i%5==0){
                if (count==5){
                    break;
                }
                sum=sum+i;
                count++;
                System.out.println("The Numbers that can be divided by both 3 & 5 are "+i);
            }
        }
        System.out.println("The sum of the numbers that meets the above condition is " + sum);
    }
}
