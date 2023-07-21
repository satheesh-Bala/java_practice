import java.util.*;

public class leader {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int getNum;
        System.out.print("\n Enter the array size : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        System.out.print("\n Enter the "+size+" numbers to insert array : ");
         for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
            }
      System.out.print("\n Ente the number to find greater than that : ");
      getNum=input.nextInt();
      oddEven(arr,size,getNum);

   }
      static void oddEven(int[] arr,int n,int getNum){
             System.out.print("Greater Than Given Numbers are : ");
             for(int i=0;i<n;i++){
               if(getNum<arr[i]){
                    System.out.print(" "+arr[i]);}
              }
          
          }

}