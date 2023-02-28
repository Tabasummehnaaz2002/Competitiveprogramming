import java.util.Arrays;
import java.util.Scanner;

public class LAB3 {
    public static void main(String[] args) {

        System.out.println("19MIS7056-Shaik.Mehnaaz Tabasum..");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter your array elements : ");
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println();
        System.out.println("-----HIGHEST SUM & PRODUCT OF THE ARRAY ELEMENTS  -----");

        int Hsum=0,Ssum=0;
        int Hprod=1,Sprod=1;

        for(int i=0;i<n;i++){
            Hsum+=a[i];
            Hprod*=a[i];
        }
        System.out.println("Highest product : "+ Hprod);
        System.out.println("Highest sum : "+Hsum);

        System.out.println("------------------------------------------");
        System.out.println("-----SMALLEST  SUM & PRODUCT OF THE ARRAY  -----");

        for(int i=0;i<2;i++){
            Ssum+=a[i];
            Sprod*=a[i];
        }
        System.out.println("Smallest product : "+Sprod);
        System.out.println("Smallest sum : "+Ssum);
    }
}
