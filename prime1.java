import java.util.Scanner;

public class prime1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        if(n<=1){
            System.out.println("not prime nor composite");


        }
        int c=2; int flag=0;
        while (c*c<=n){
            if(n%c==0){
                flag=1;
            }
            c++;
            }
        if(flag==1){
            System.out.println("not prime");

        }if(flag==0)  {
            System.out.println("prime");

        }
    }

}

