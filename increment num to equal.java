import java.util.*;
class equals_increment{
public static void main(String[] args){
    int size,i,j,count=1,ite;
    Scanner input=new Scanner(System.in);
    size=input.nextInt();
    int[] arr1 = new int[size];
    ite=0;
    for(i=0;i<size;i++){
            arr1[i]=input.nextInt();
    }
    while(count<=size){
    int temp;
    for(i=0;i<size;i++){
        for(j=i+1;j<size;j++){
         if(arr1[j]<arr1[i]){
            temp=arr1[j];
            arr1[j]=arr1[i];
            arr1[i]=temp;
         }
        }
    }
    for(i=0;i<size-1;i++){
         arr1[i]++;
    }
    count=1;
    for(i=0;i<size;i++){
        if(arr1[0]==arr1[i]){
            count++;
        }
    }
    ite++;
    }
    for(i=0;i<size;i++){
            System.out.print(" "+arr1[i]);
    }
    System.out.print("\n"+ite);
}}
