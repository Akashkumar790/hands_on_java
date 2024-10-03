import java.util.Scanner;

public class rotateArray {
    public static void rotate(int []arr,int i,int j){

        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }


    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int k= sc.nextInt();
        k=k%n;
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);
        rotate(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }


    }
}
