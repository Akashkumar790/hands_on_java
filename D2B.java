public class D2B {
    public static void main(String[] args) {

        int []arr=new int[]{9,8,6};
        int []arr1=new int[]{1,2,9};
        int []arr2=new int[3];

        for(int i=0;i<3;i++){
            int sum= arr[i]-arr1[i];
            arr2[i]=sum;
        }
        for (int i:arr2){
            System.out.println(i);
        }


    }
}
