public class calcFeetAndInchesToCentimetres {

    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
        if (feet>=0 && inches>=0 && inches<=12){
            double c1= 12*2.54*feet;
            double c2= 2.54*inches;
            return (c1+c2);
        }
        else{
            return -1;
        }

    }
    public static double calcFeetAndInchesToCentimetres(int inches){
        if (inches>=0){
            double f1=(int)inches/12;
            double remainingInches = (int) inches%12;
            double c3=calcFeetAndInchesToCentimetres(f1,remainingInches);
            return c3;

        }
        else{
            return  -1;
        }

    }

    public static void main(String[] args) {
       double centi = calcFeetAndInchesToCentimetres(8,4);
        double feet = calcFeetAndInchesToCentimetres(156);
        System.out.println("centmetres : " + centi + " Feet : " + feet);


    }
}
