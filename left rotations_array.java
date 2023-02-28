public class LAB1{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int d=4;
        int n=5;
        int m=1;

        while(d>=m)
        a[0]=a[n-1];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
            m++;
            System.out.println(a[i]);
        }
//        a[n-1]=a[0];
        for(int e:a){
            System.out.println(e);
        }


    }
}