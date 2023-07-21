import java.util.Scanner;
import java.lang.*;

class Add {
    public person name(int age,String gender){
        person person=new person();
        if(gender.equals("male")){
            age += 10;
        }
        else{
            age +=20;
        }
        person.age=age;
        person.gender=gender;
    return person ;
    }


  public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("age and gender ");
    int age = scanner.nextInt();
    scanner.nextLine();
    String gender = scanner.nextLine();

    Add pass=new Add();
    person final1=pass.name(age,gender);
    System.out.println(final1.age+"\n"+ final1.gender);
  }
}

public class person{

    public int age;
    public String gender;
};
