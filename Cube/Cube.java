import java.util.*;

public class Cube {

    static int num;
    static String c;
    static char[] array;
    static String s = "";
    static int ori[][] = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    static int l;
    static int flip_s[][] = new int[3][3];
    static int res[][] = new int[3][3];
    static int array2d[][] = new int[3][3];
    static ArrayList<Integer> list = new ArrayList<Integer>();
    static List<Integer> list3 = new ArrayList<Integer>();
    static List<List<Integer>> list_f = new ArrayList<List<Integer>>();
    static int w = 0;

    public static void main(String[] args) {

        input_matrix();
        flip();
    }

    public static void input_matrix() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);


        try {
            System.out.println("Please enter the no of tests");
            num = input.nextInt();
        } catch (Exception x) {

            System.out.println("Please enter a numeric value again");
            input.nextLine();
            input_matrix();
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("Please Input the " + (i + 1) + "st line of the problem");
            c = input2.next();
            while (!c.matches("[*.]*")) {

                System.out.println("Invalid characters found, please retype with * and . only");
                c = input2.next();

            }
            while (c.length() > 3) {

                System.out.println("More than 3 entries present, input only 3 values");
                c = input2.next();

            }
            s = s + c;

        }
        System.out.println(s);
        s = s.replace('*', '1').replace('.', '0');
        array = s.toCharArray();
        System.out.println(array);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2d[i][j] = Character.getNumericValue(array[(i * 3) + j]);
                System.out.println(array2d[i][j]);
            }
        }


    }

    public static void flip() {


        for(int i =0; i<9;i++)
            list.add(i);
        int flip[][][] = new int[][][]{{{1, 1, 0}, {1, 0, 0}, {0, 0, 0}}, {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}}, {{0, 1, 1}, {0, 0, 1}, {0, 0, 0}}, {{1, 0, 0}, {1, 1, 0}, {1, 0, 0}}, {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}}, {{0, 0, 1}, {0, 1, 1}, {0, 0, 1}}, {{0, 0, 0}, {1, 0, 0}, {1, 1, 0}}, {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}}, {{0, 0, 0}, {0, 0, 1}, {0, 1, 1}}};

        System.out.println("The original matrix is " + Arrays.deepToString(ori));
        System.out.println("We have to bring it to " + Arrays.deepToString(array2d));
        System.out.println("Begining...");


        list_f = permutation();
        for (int v =0; v< list_f.size(); v++ )
        {
        if(res != array2d) {


            for (int e : list_f.get(v)) {


                System.out.println("We are choosing Flip No" + e);
                for (int c = 0; c < 3; c++) {
                    for (int d = 0; d < 3; d++) {
                        flip_s[c][d] = flip[e][c][d];
                    }
                }
                System.out.println("This flip is " + Arrays.deepToString(flip_s));
                System.out.println("The Ori " + Arrays.deepToString(ori));
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        res[j][k] = flip_s[j][k] ^ ori[j][k];
                    }
                }
                System.out.println("The result after the flip is " + Arrays.deepToString(res));
                    }
                }

        else{
            System.out.println("Solution reached");
            break;
        }

    }
        System.out.println("No Solution");
    }


        public static List<List<Integer>> permutation() {
            Cube pa = new Cube();
            int[] arr= {0, 1, 2, 3,4,5,6,7,8};
            List<List<Integer>> permute = pa.permute(arr);
           return permute;


        }
        public List<List<Integer>> permute(int[] arr) {
            List<List<Integer>> list = new ArrayList<>();
            permuteHelper(list, new ArrayList<>(), arr);
            return list;
        }

        private void permuteHelper(List<List<Integer>> list, List<Integer> resultList, int [] arr){

            // Base case
            if(resultList.size() == arr.length){
                list.add(new ArrayList<>(resultList));
            }
            else{
                for(int i = 0; i < arr.length; i++){

                    if(resultList.contains(arr[i]))
                    {
                        // If element already exists in the list then skip
                        continue;
                    }
                    // Choose element
                    resultList.add(arr[i]);
                    // Explore
                    permuteHelper(list, resultList, arr);
                    // Unchoose element
                    resultList.remove(resultList.size() - 1);
                }
            }
        }

    }