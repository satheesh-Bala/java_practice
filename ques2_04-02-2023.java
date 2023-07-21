import java.util.*;

class ques1{

public static void main(String[] args){
    int size,count=0;
    Scanner input=new Scanner(System.in);
    size = input.nextInt();

    int[] arr1 = new int[size];
    int[] arr2 = new int[size];

    for(int i=0;i<size;i++){
            arr1[i]=count;
            count++;
    }
    System.out.print("\n");
    int cut_no = input.nextInt();

    for(int i=0;i<cut_no;i++){
            arr2[i] = input.nextInt();

    }
    int price=0;
    for(int i=0;i<cut_no;i++){
            for(int j=0;j<size;j++){
            if(arr2[i]<=arr1[j]){
                price=price+arr1[j];
            }
    }
    System.out.print(" "+price);
    price=0;
    }
}
}
