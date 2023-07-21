import java.util.*;

class question1{
  public static void main(String[] args){

  int i,test,n,count=0;
  str in;
  Scanner input=new Scanner(System.in);
  n=input.nextInt();
  String entry="\r";
  char arr[];
  int count=0;
  int index=0;
  for(i=1;i<=n;i++){
      while(count==0){
      String entry1=input.nextLine();
      if(!entry1.equals(entry)){
         arr[index]=input.nextLine();
         index++;
         }
      else{
      break;
      }
   }  
  }
  System.out.print(arr[0]);
 }
}