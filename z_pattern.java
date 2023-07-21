import java.util.*;
class equals_increment{
public static void main(String[] args){
    int n,i,j;
    Scanner input=new Scanner(System.in);
    n=input.nextInt();

    for(i=1;i<=7;i++){
        for(j=1;j<=n;j++){
         if(i==j || j+1==n-i){
            System.out.print(j);
         }
         else{
            System.out.print(" ");
         }
        }
        System.out.print("\n");
    }
}
}
