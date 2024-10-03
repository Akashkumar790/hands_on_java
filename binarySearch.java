import java.util.Scanner;

public class binarySearch {
    public static int binaryS(int []arr,int k,int n){
     int s=0;
     int e=n-1;



while (s<=e) {int mid = (e + s) / 2;
    if (arr[mid] == k) {
        return mid;

    } else if (arr[mid] > k) {
        e = mid - 1;

    } else if(arr[mid]<k){
        s = mid +1;
    }
    //mid = (s + e) / 2;
}
        return -1;
    }

    public static void main(String[] args) {
     int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("enter the value of k");
        int k=sc.nextInt();
        System.out.println("enter the array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=binaryS(arr,k,n);
        System.out.println(ans);
    }
}
