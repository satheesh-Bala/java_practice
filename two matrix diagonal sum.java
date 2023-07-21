import java.util.*;


class add_matrix{

public static void main(String[] args){

    System.out.print("\n Enter the two array size");
    Scanner input=new Scanner(System.in);
    int size = input.nextInt();
    int[][] arr1 = new int[size][size];
    int[][] arr2 = new int[size][size];
    int[][] arr3 = new int[size][size];


    //getting array elements from user
    System.out.print("\n Enter the "+size+" numbers to insert array 1 :");
    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            arr1[i][j]=input.nextInt();
            }
    }
    System.out.print("\n Enter the "+size+" numbers to insert array 2 :");
    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            arr2[i][j]=input.nextInt();
            }
    }

    //adding diagonal elements
    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];
                }
                else{
                    arr3[i][j]=" ";
                }
            }
    }


    //printing the given array
    System.out.print("\nGiven arrays 1 :\n");
    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            System.out.print(" "+arr1[i][j]);
            }
            System.out.print("\n");
    }
    System.out.print("\nGiven arrays 2 :\n");
    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            System.out.print(" "+arr1[i][j]);
            }
            System.out.print("\n");
    }
    System.out.print("\nAdded arrays 3 :\n");
    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            System.out.print(" "+arr3[i][j]);
            }
            System.out.print("\n");
    }
}
}
