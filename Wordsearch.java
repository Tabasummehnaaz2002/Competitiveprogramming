import java.util.Scanner;
public class Wordsearch {
    public static void main(String[] args) {
        System.out.println("19MIS7056--SHAIK.MEHNAAZ TABASUM..");
        Scanner sc=new Scanner(System.in);
        String[] res = {"AXE", "DOG", "BED", "CAT", "BASE"};
        System.out.println("Enter the values of the matrix: ");
        char[][] arr =new char[3][4];
//                {{'A', 'B', 'C', 'E'}, {'E', 'F', 'S', 'C'}, {'X', 'D', 'E', 'E'}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr [i][j]=sc.next().charAt(0);

            } }
        int r = 0;
        String m = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                m = m + arr[i][j];
            }
        }
        for (int k = 0; k < res.length; k++) {
            for (int p = 0; p < res[k].length(); p++) {
                char val = res[k].charAt(p);
                int number = m.indexOf(val);
                if (number == -1) {
                    r = 0;
                } else {
                    r = 1;
                }
            }

            if (r == 1) {
                System.out.println(res[k] +"--"+ "1");
            } else {
                System.out.println(res[k] +"--"+ "0");
            }
        }

    }
}