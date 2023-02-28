import java.util.Scanner;

public class LAB6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("19MIS7056_Shaik.Mehnaaz Tabasum");
        System.out.println("Enter your string: ");
        String s=sc.next();
        char[] updated=new char[s.length()];
       int m=0;

        for(int i=1;i<s.length();i++){
            updated[m]=s.charAt(i);
            m++;
        }
        updated[s.length()-1]=s.charAt(0);
        System.out.println("The left rotation for your given string is : ");
               for(int i=0;i<s.length();i++){
            System.out.print(updated[i]); }
    }
}

