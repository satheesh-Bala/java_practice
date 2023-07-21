import java.util.Scanner;
class question2 
{
    public static void main(String[] args) 
    {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        num1 = s.nextInt();
        System.out.print("Enter the second number:");
        num2 = s.nextInt();
        if(num1 == num2)
        {
            System.out.println(num1+" and "+num2+" are equal ");
        }
        else
        {
            System.out.println(num1+" and "+num2+" are not equal ");
        }
    }
}