import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        words[1] = "_______";

        System.out.println(String.join(" ", words));
        
        System.out.print("a)Love\nb)Hate\nc)Joined\nd)Buy\nEnter your choice: ");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("a")) {
            words[1] = "Love";
            System.out.println(String.join(" ", words));
        }
        else if (choice.equals("b")) {
            words[1] = "Hate";
            System.out.println(String.join(" ", words));
        }
        else if (choice.equals("c")) {
            words[1] = "Joined";
            System.out.println(String.join(" ", words));
        }
        else if (choice.equals("d")) {
            words[1] = "Buy";
            System.out.println(String.join(" ", words));
        }
    }
}
