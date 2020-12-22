import java.util.Arrays;
import java.util.Scanner;

public class Alice {

    static int _case;
    static int _trip;

    public static void main(String[] args) {
        chktestcases_trips();
        chk_trips();

    }


    public static void chktestcases_trips() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try{System.out.print("Please enter total number of cases: ");
        _case = input.nextInt();}
        catch(Exception x)
        {
            System.out.println("Please enter a numeric value again");
            input.nextLine();
            chktestcases_trips();}

        while (_case > 50) {
            System.out.println("Error ! Please enter  Test cases value less than or equal to 50");
            _case = input.nextInt();
        }
        }

    public static void chk_trips(){
        Scanner input2 = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try{System.out.print("Please enter total number of Trips: ");
        _trip = input2.nextInt();}
        catch(Exception x)
        {
            System.out.println("Please enter a numeric value again");
            input2.nextLine();
            chk_trips();}
        while (_trip > 100) {
            System.out.println("Error ! Please enter  Trips  value less than or equal to 100");
            _trip = input2.nextInt();
        }
        String[][] place = new String[_case][_trip];
        String[] unique = new String[_case];
        int [] length = new int [_case];
        for (int j = 0; j < _case; j++) {
            System.out.println("Test case " + (j + 1));

            for (int i = 0; i < _trip; i++) {
                System.out.println("Enter place: " + (i + 1));

                    place[j][i] = scanner.nextLine();

                while (place[j][i].matches(".*\\d+.*") || !place[j][i].equals(place[j][i].toLowerCase()) || place[j][i].length() <= 0 || place[j][i].length() > 20 || place[j][i].contains(" ")) {
                    System.out.println("The entered place is not a simple place ; it should only contain lowercase letters, have at least one letter, and do not contain spaces ");
                    place[j][i] = scanner.nextLine();
                }


            }
            unique = Arrays.stream(place[j]).distinct().toArray(String[]::new);
            length [j] = unique.length;
        }

        input2.close();

        System.out.println("The Unique Values of places entered in each test cases are");
        for (int k : length){
            System.out.println(k);
        }



    }



}