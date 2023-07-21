
import java.util.*;


class adjoint_inverse{

public static void main(String[] args){

    System.out.print("\n Enter the two array size");
    Scanner input=new Scanner(System.in);
    int size = input.nextInt();
    int[][] arr1 = new int[size][size];
    int temp;

    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            arr1[i][j]=input.nextInt();
            }
    }

    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                    if(i==j){
                        temp=arr1[i][j];
                        arr1[i][j]=arr1[1][1];
                        arr1[1][1]=temp;
                    }
                    else{
                        arr1[i][j]=0-arr1[i][j];
                    }
            }
    }

    for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
            System.out.print(" "+arr1[i][j]);
            }
            System.out.print("\n");
    }
}
}
