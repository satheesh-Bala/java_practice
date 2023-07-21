import java.util.*;

public class CountTriplets {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("\n Enter the array size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("\n Enter the "+size+" numbers to insert array : ");
         for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
            }
        int n = arr.length;
        
        int count = countTriplets(arr, n);
        System.out.println("Count of triplets: " + count);
    }

    static int countTriplets(int[] arr, int n) {
        Arrays.sort(arr);
        int count = 0;
        
        for (int i = 0; i < n-1; i++) {
             for(int j=i+1;j<n;j++){
             int sum=arr[i]+arr[j];
             for(int l=j+1;l<n;l++){
              if(sum==arr[l])
               {count++;}
              }
             }
            }
        
        return count;
    }
}
