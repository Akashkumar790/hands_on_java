import java.util.Scanner;

public class decTObinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            if ((n&1)==1) {
                sum += 1;
            }
            n = n >> 1;
        }
        System.out.println(sum);
    }
}

