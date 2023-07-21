public class PatternExample {
   public static void main(String[] args) {
      int size = 9; // set the size of the pattern
      int middle = size / 2;
      for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
            if (Math.abs(j - middle) <= Math.abs(i - middle)) {
               System.out.print(".");
            } else {
               System.out.print(" ");
            }
         }
         System.out.println();
      }
   }
}
