import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input string
        if (!sc.hasNext()) return;
        String s = sc.next();

        // Use StringBuilder for efficiency during repeated appends
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is the same as the next one
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // Append the character and the final count for that sequence
                compressed.append(s.charAt(i));
                compressed.append(count);
                
                // Reset count for the next sequence of characters
                count = 1;
            }
        }

        String result = compressed.toString();

        // Logic check: If compressed length is less than or EQUAL to original, 
        // print compressed. Otherwise, print original.
        if (result.length() <= s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }

        sc.close();
    }
}