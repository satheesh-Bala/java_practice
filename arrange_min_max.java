import java.util.*;

public class reArrange {
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
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
            }
        
        Rearrange(arr, n);
        
    }

    static void Rearrange(int[] arr, int n) {
        Arrays.sort(arr);
        int[] arr1 = new int[n];
        int odd=1;
        if(n%2==0)
        {odd=0; }
        int count=n/2;
        int place=0;
        for (int i = n-1; i >= count; i--) {
             arr1[place]=arr[i];
             place=place+2;
             }
        if(odd==1)
        {count=count+1;}
        place=1;
        for (int i = 0; i < count; i++) {
             arr1[place]=arr[i];
             place=place+2;
             }
         System.out.print(" \n");
         for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
            }
    }
}
