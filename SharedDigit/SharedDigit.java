public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(72,99));
    }


    public static boolean hasSharedDigit(int num1, int num2){
        if (num1>=10 && num1<=99 && num2>=10 && num2<=99){
            int orig=num2;

          for(int i=0; num1!=0;i++)
          {
              for (int j=0; num2!=0;j++){
              if(num1%10==num2%10)
                  return true;
              num2=num2/10;
              }
              num2=orig;
              num1=num1/10;
        }
        return false;
        }
        return false;
    }
}
