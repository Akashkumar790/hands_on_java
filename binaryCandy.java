import java.util.Arrays;
import java.util.Scanner;

public class binaryCandy {
    public static int binary(int []arr,int h){
        int st=0;
        int ed=arr.length-1;
int c=0;
        int mini=Integer.MAX_VALUE;
        while (st<=ed) {
            int mid = (st + ed) / 2;
            int rithour=0;
            for(int i=0;i<arr.length;i++){
               rithour+=arr[i]/mid;
                       if(arr[i]%mid!=0){
                           rithour+=1;
                       }

            }if(rithour>h){
                st=mid+1;
            }else {
                c=mid;
                ed=mid-1;
            }

        }
        return c;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the hour");
        int h= sc.nextInt();
        System.out.println("enter the candy array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int ans=binary(arr,h);
        System.out.println(ans);



    }
}
