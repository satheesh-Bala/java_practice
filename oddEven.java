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
      oddEven(arr,size);

   }
      static void oddEven(int[] arr,int n){
          int odd=0,sumOfOdd=0;
          int even=0,sumOfEven=0;
             for(int i=0;i<n;i++){
               if(arr[i]%2==0){even++;sumOfOdd+=arr[i];
                    System.out.print(" "+arr[i]);}
               else{odd++;sumOfEven+=arr[i];}
              }
          System.out.print("\nODD : "+odd+" Sum of add : "+sumOfOdd+"\nEVEN : "+even+" Sum of add : "+sumOfEven);
          for(int i=0;i<n;i++){
               if(arr[i]<0){
                    System.out.print(" "+arr[i]);}
              else{System.out.print(" "+arr[i]);}
              }
                        


          }

}