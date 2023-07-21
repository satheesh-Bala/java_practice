import java.util.*;
class permid{
public static void main(String[] args){
    int i,j,n,count,k,count2;
    Scanner input=new Scanner(System.in);
    n=input.nextInt();
    for(i=1;i<=n;i++){
        count=1;
        count2=i;
        for(j=1;j<=n*2-1;j++){
        if(n-i>=j){
            System.out.print(" ");
        }
        else {
            if(j<=n){
            System.out.print(count);
            count++;
            }
            else if(j>n && i!=j-n && n+i>=j)
            {
            count--;
            System.out.print(count-1);

            }
            else
            {
            System.out.print(" ");

            }

            }

    }
    System.out.print("\n");
    }

}
}
