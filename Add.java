import java.util.Scanner;
import java.lang.*;

class Add {
    public void name(int age,String gender){

    age =+ 10;
    return age;
    };


  public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    int sum = num1 + num2;
    System.out.println("The sum of the two numbers is: " + sum);
  }
}
