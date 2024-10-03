import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;
public class recorsion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    //        int i=0;
//        long sum=0;
//        while (n>0){
//            long digit=n%10;
//            if(digit==1) {
//                sum+= Math.pow(2, i);
//            }
//                n=n/10;
//                i++;
//
//        }


    }
}


