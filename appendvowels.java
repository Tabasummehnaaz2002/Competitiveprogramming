import java.util.Scanner;

public class LAB6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("19MIS7056_Shaik.Mehnaaz Tabasum");
        System.out.println("Enter your string you want : ");
        String s = sc.nextLine();
        char[] array = s.toCharArray();

StringBuffer sb=new StringBuffer();

        for (int i = 0; i < s.length(); i++) {
            if (array[i] == 'a' || array[i] == 'e' || array[i] == 'i' || array[i] == 'o' || array[i] == 'u'||
                    array[i] == 'A' || array[i] == 'E' || array[i] == 'I' || array[i] == 'O' || array[i] == 'U') {
                continue;
            } else {
               sb.append(array[i]);

            }
        }
        System.out.println(sb);
    }
}

