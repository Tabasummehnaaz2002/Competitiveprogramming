import java.util.Arrays;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("19MIS7056_Shaik.Mehnaaz Tabasum..");
        System.out.println("---Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("----Enter number of modifcations needed? :");
        int k = sc.nextInt();
        System.out.println("Enter array 1st array elements: ");
        int[] a=new int[n];
        int[] b=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array 2nd array elements: ");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int incr = k * 2;
        int pro = 1, pro1=1;
        int[] array = new int[n];
        int[] array2=new int[n];


        for (int i = 0; i < n; i++) {
            pro = ((a[i] + incr) * b[i]);
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    pro = (a[j] * b[j]) + pro;
                }
                array[i] = pro;
            }
        }
         Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            pro1 = ((a[i] - incr) * b[i]);
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    pro1 = (a[j] * b[j]) + pro1;
                }
                array2[i] = pro1;
            }
        }
        Arrays.sort(array2);
        Arrays.sort(array);

       int result=Math.min(array[0],array2[0]);
        System.out.println("Minimum product of the summation obtained is  : "+result);
    }

}

//        int[] a = {1, 2, -3};
//        int[] b = {-2, 3, -5};
//        int n=5;
//        int k=3;
//        int[] a={2 ,3 ,4 ,5 ,4};
//        int[] b={ 3 ,4, 2, 3, 2};

