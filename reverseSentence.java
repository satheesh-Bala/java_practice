
import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        int len=words.length;
        for(int i=len-1;i>=0;i--){
        System.out.print(" "+words[i]);
        }
    }
}
