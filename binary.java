import java.util.Scanner;
import java.lang.Math;
//import java.lang.Math;
public class binary {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                ;
                c++;

            }
            n = n >> 1;
        }
        System.out.println(c);
        int i=0;
        int sum=0;
        while (i<c){
            sum+=Math.pow(2,i);
            i++;

        }
        System.out.println(sum);
    }
}
