import java.util.Scanner;

public class akash {
    public static int prime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            if(prime(i)==1){
                System.out.print(i+" ");
            }

        }System.out.println();

    }
}
