import java.util.*;

class ques1{

public static void main(String[] args){
    int size,index,count=1;
    Scanner input=new Scanner(System.in);
    size = input.nextInt();

    int[] arr1 = new int[size];

    for(int i=0;i<size;i++){
            arr1[i]=input.nextInt();
    }

    int temp1=arr1[0],temp2=arr1[1],temp3=arr1[2];
    for(int i=0;i<size-3;i++){
            arr1[i]=arr1[i+3];
    }
    arr1[size-3]=temp1;
    arr1[size-2]=temp2;
    arr1[size-1]=temp3;

    for(int i=0;i<size;i++){
            System.out.print(" "+arr1[i]);
    }

    index=input.nextInt();
    for(int i=0;i<size;i++){
            if(arr1[i]==index){
               System.out.print(i);
               count=0;
            }
    }
    if(count==1){
        System.out.print(-1);
    }
    }
}
