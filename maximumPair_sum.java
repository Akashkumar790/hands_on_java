import java.util.Arrays;
import java.util.Scanner;

public class  maximumPair_sum {
    public static int solve(int []arr,int n,int target){

        Arrays.sort(arr);
      int i=0;
      int j=n-1;
      int maxi=0;
      while (i<=j){
          //int mul=0;
          if(arr[i]+arr[j]<target){
              i++;
          }  if(arr[i]+arr[j]==target) {
              int mul=arr[i]*arr[j];
              maxi=Math.max(maxi,mul);
              i++;
              j--;
          }  if (arr[i]+arr[j]>target){
              j--;
          }
      }return maxi;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new  int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("target");
        int target= sc.nextInt();
        System.out.println("Maximum product of targat sum :-:"+solve(arr,n,target));


    }
}
