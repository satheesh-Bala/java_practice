import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        System.out.println("choose the word to be blanks");
        int choise=scanner.nextInt();
        words[choise] = "_______";

        System.out.println(String.join(" ", words));
        
        System.out.println("Give The 4 options to answer: ");
        System.out.print("a) ");
        string a=scanner.nextLine();
        System.out.println("b) ");
        string b=scanner.nextLine();
        System.out.println("c) ");
        string c=scanner.nextLine();
        System.out.println("d) ");
        string d=scanner.nextLine();

        System.out.println("Answer The Question: ");
        System.out.println(String.join(" ", words));
        
        System.out.println("a) "+a);
        System.out.println("b) "+b);
        System.out.println("c) "+c);
        System.out.println("d) "+d);
        System.out.println("Enter the Choice: ");

        String choice = scanner.nextLine().toLowerCase();
        if (choice.equals("a")) {
            words[choise] = a;
            System.out.println(String.join(" ", words));
            System.out.println("Answer 100% correct");
        }
        else if (choice.equals("b")) {
            words[choise] = b;
            System.out.println(String.join(" ", words));
            System.out.println("Answer 75% correct");
        }
        else if (choice.equals("c")) {
            words[choise] = c;
            System.out.println(String.join(" ", words));
            System.out.println("Answer 50% correct");
        }
        else if (choice.equals("d")) {
            words[choise] = d;
            System.out.println(String.join(" ", words));
            System.out.println("Answer 25% correct");
        }
    }
}
