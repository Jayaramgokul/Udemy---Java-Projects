import java.util.Scanner;

public class Alphabet {

    static String text;
    static char[] array;
    static int[] k;
    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static String[] conversion = new String[] {"@","8","(", "|)", "3", "#","6","[-]","|", "_|","|<", "1", "[]\\/[]", "[]\\[]", "0","|D","(,)","|Z","$","']['","|_|","\\\\/", "\\\\/\\\\/", "}{", "`/","2"};
    static String[] converted ;
    static int index;

    public static void main(String[] args) {
        conversion();
        ascii();
    }


    public static void conversion() {


        Scanner input = new Scanner(System.in).useDelimiter("\t");
        try {
            System.out.println("Please Enter statement ");
            text = input.nextLine();
        } catch (Exception x) {
            System.out.println("Please enter a numeric value again");
            input.nextLine();
            conversion();
        }
    }

            public static void ascii(){
                Scanner input2 = new Scanner(System.in).useDelimiter("\t");
            array = text.toCharArray();

        for (int i = 0; i < array.length; i++) {
            k = new int[array.length];
            k[i] = Integer.parseInt(String.format("%03d", (int) array[i]));
            while ((k[i] < 32 && k[i] != 9) || k[i] > 126) {
                try {
                    System.out.println("The statement has an ASCII character beyond 32-126 or 9 range");
                    System.out.println("Please Enter statement again");
                    text = input2.nextLine();
                }
                catch (Exception x) {
                    System.out.println("Exception encountered! Please enter the statement again");
                    input2.nextLine();
                    --i;
                    continue;}

                array = text.toCharArray();
                i = 0;
                break;
            }

        }
        converted  = new String [array.length]  ;
        String[] ary = text.split("");
        for (int j = 0; j < array.length; j++){
             index = new String(alphabet).indexOf(Character.toLowerCase(array[j]));
            while(index !=-1) {
                ary[j] = conversion[index];
                break;
            }

        }

        StringBuilder builder = new StringBuilder();
        for (String value : ary) {
            builder.append(value);
        }
        String text = builder.toString();
        System.out.println("The converted string is " + text);
    }
}
