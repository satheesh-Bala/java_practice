import java.util.*;


class add_matrix{

public static void main(String[] args){

    get_array obj=new get_array();

    System.out.print("\n Enter the array size: ");
    Scanner input=new Scanner(System.in);
    int size = input.nextInt();

    obj.get(size);
}
}


class get_array{
    void get(int size){
    Scanner input=new Scanner(System.in);
    int[] arr1 = new int[size];

    //getting array elements from user
    System.out.print("\n Enter the "+size+" numbers to insert array :");
    for(int i=0;i<size;i++){
            arr1[i]=input.nextInt();
    }
    //printing arrays
    System.out.print("\n after reverse: ");
    for(int i=size-1;i>=0;i--){
            System.out.print(" "+arr1[i]);
    }
    }
}
