import java.util.Scanner;

public class oddstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of sentence");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" Words :");
        String[] words = new String[n];
        int OddLength = 0;
        String OddWord = "";

        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
            if (words[i].length() % 2 == 1 && words[i].length() > OddLength) {
                OddLength = words[i].length();
                OddWord = words[i];
            }
        }

        if (OddLength == 0) {
            System.out.println("Better luck next time");
        } else {
            System.out.println(OddWord);
        }
    }
}
