public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81, 153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int div=1;
        int ndiv=0;
        if (first < 10 || second < 10)
            return -1;
        else {
            if (first >= second) {
                for (int i = 2; i <= second; i++) {
                    if (first % i == 0 && second % i == 0)
                        ndiv=i;
                }
                if(ndiv>div)
                    return ndiv;
                else
                    return div;
            }
            else {
                for (int i = 2; i <= first; i++) {
                    if (first % i == 0 && second % i == 0)
                        ndiv=i;
                }
                if(ndiv>div)
                    return ndiv;
                else
                    return div;


                }

            }

        }

    }

