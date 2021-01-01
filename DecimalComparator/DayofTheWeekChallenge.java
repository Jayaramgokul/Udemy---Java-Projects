public class DayofTheWeekChallenge {

    public static void main(String[] args) {
        printdayOfTheWeek(3);

    }

    public static void printdayOfTheWeek(int day){

        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Not any day");
                break;
        }
    }
}
