import java.util.*;
class main {

 public static void main (String args[]){
int  i;

student[] students = new student[5];

for(i=0;i<5;i++){
    students[i] = new student();
    students[i].getData();
}
students[4].printData();


 }

}
class student{
public String name,fatherName;
public int age,grade,mark10;
void getData(){
Scanner input=new Scanner(System.in);
System.out.println("Enter Name    : ");
name=input.nextLine();
System.out.println("Enter "+name+"\'s father Name    : ");
fatherName=input.next();
System.out.println("Enter "+name+"\'s Age  : ");
age=input.nextInt();
System.out.println("Enter "+name+"\'s grade   : ");
grade=input.nextInt();
System.out.println("Enter "+name+"\'s 10th mark    : ");
mark10=input.nextInt();
}
void printData(){
System.out.println("Name    : "+name+"\n Age     : "+age+"\n Father Name :"+fatherName+"\n Class     : "+grade+"\n 10th Mark   : "+mark10);
}
}
