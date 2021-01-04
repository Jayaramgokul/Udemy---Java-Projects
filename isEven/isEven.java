public class isEven {

    public static void main(String[] args) {
        int count=0;
        int num1=4;
        int num2=20;

        while (num1<=num2){

            num1++;
            if (!isEvenNumber(num1))
                continue;
            count++;
            System.out.println("Even Num is "+num1);
            System.out.println("The number of even numbers is "+ count);
            if (count==5)
                break;;
        }


    }

    public static boolean isEvenNumber(int num){
        if ((num%2)==0)
            return true;
        else
            return false;
    }
}
