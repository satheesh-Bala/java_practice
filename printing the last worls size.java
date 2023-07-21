public class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--)
           {
            if (s.charAt(i) != ' ')
                 {
                  length++;
                 } 
            else {
                  break;
                 }
           }
        return length;
    }
}
String s1 = "Hello World";
System.out.println(lengthOfLastWord(s1));

String s2 = " fly me to the moon ";
System.out.println(lengthOfLastWord(s2));
