import java.util.*;

public class leader {
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
            System.out.print(arr[i]+"");
            }
        
        findLeader(arr, n);        
    }

    static void findLeader(int[] arr, int n) {
        int count=0;
System.out.print("\n ");
        for (int i = 0; i <n-1; i++) {
             count=1;
             int check=n-1-i;
            // System.out.print(check+" \n");
             for(int j=i+1;j<n-1;j++){
              if(arr[i]>arr[j])
               {count++;}
              }
            // System.out.print(count+" \n");
             if(count==check)
            {System.out.print(arr[i]+" ");}
             }
            System.out.print(arr[n-1]+" ");
         
    }
}
