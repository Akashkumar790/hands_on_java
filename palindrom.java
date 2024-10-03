import java.util.Scanner;


public class palindrom {
    public static int palin(String s){

    int i=0;
    int j=s.length()-1;
    while (i<j){
        if(s.charAt(i)==s.charAt(j)){
            return 1;
        }
        i++;
        j--;
    }
    return 0;

}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        if(palin(s)==1){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
