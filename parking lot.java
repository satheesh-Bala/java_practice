
import java.util.*;


class parking_lot{

public static void main(String[] args){

    System.out.print("\n Enter the two array size");
    Scanner input=new Scanner(System.in);
    int r = input.nextInt();
    int c = input.nextInt();
    int[][] arr1 = new int[r][c];

    //getting array elements from user
    System.out.print("\n Enter the 0s and 1s for array : ");
    for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            arr1[i][j]=input.nextInt();
            }
    }
    int count=0;
    int preCount=0;
    int row=0;
    for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr1[i][j]==1){
                        count++;
                }
            }
            if(count>preCount){
            preCount=count;
            row=i+1;
            }
            count=0;
    }
System.out.print("\n Maximum parked row is : "+row);
}
}
