import java.util.Arrays;
import java.util.Scanner;

public class LAB5 {
    public static void main(String[] args) {
        System.out.println("19MIS7056_Shaik.Mehnaaz Tabasum..");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of strings: ");
         int n=sc.nextInt();

        String[] arr =  {"mehnaaz", "tabasum", "shaik ","ammi","sameena"};
        System.out.println( );

        String val=" ";

        for (int i = 0; i < arr.length; i++) {
            System.out.println("The string  "+ arr[i]+  "  Length is :  "+arr[i].length());
        }
        System.out.println("By comparing the string values: ");
        for( int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i].compareTo(arr[j]) < 0) {
                    val = arr[i];
                    arr[i] = arr[j];
                    arr[j] = val;
                }

            }
        }
        System.out.println();
      System.out.println("Largest string  :"+arr[0]);
        System.out.println( );
        System.out.println("Smallest string :"+arr[n-1]);


        }
    }