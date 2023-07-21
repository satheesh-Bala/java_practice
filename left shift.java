import java.util.*;


class add_matrix{

public static void main(String[] args){

    System.out.print("\n Enter the array size: ");
    Scanner input=new Scanner(System.in);
    int size = input.nextInt();
    int[] arr1 = new int[size];

    //getting array elements from user
    System.out.print("\n Enter the "+size+" numbers to insert array :");
    for(int i=0;i<size;i++){
            arr1[i]=input.nextInt();
    }
    int index=size;
    int temp1=arr1[0],temp2=arr1[1];
    for(int i=0;i<size-2;i++){
            arr1[i]=arr1[i+2];
    }
    arr1[size-2]=temp1;
    arr1[size-1]=temp2;

    //printing arrays
    System.out.print("\n after left shift: ");
    for(int i=0;i<size;i++){
            System.out.print(" "+arr1[i]);
    }

}


}
