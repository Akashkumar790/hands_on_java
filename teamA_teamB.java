import java.util.Scanner;


public class teamA_teamB {
    public static  void solve(String s){
        int A=0;
        int B=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                A++;
            }else if(s.charAt(i)=='B'){
                B++;
            }
        }
        if(A>B){
            System.out.println('A');
        }else {
            System.out.println('B');
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        solve(s);

    }
}
