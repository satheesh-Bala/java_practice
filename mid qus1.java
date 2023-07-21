import java.util.*;

class question1{
  public static void main(String[] args){

  int i,j,n;
  Scanner input=new Scanner(System.in);
  n=input.nextInt();

  for(i=1;i<=n*2;i++){
     
    for(j=1;j<=n*2;j++){
        if(j==1 || j==n*2){
        System.out.print("##");
        }
        else if(i!=n && j!=n) {
        System.out.print(" ");
        }
        if(i==n && j<=n-2){
          System.out.print(" $");
        }
        if(i==n && j==n-1){
          System.out.print(" ");
        }
     }
  System.out.print("\n");
  }
 }
}