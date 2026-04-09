import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // TODO: Read the string
        if (!sc.hasNext()) return;
        String s = sc.next();

        // TODO: Iterate through the string to count consecutive characters
        // TODO: Append char and count to a StringBuilder
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            // Check if the current character is the same as the next one
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // If the next character is different, append the current character and its count
                compressed.append(s.charAt(i));
                compressed.append(count);
                // Reset count for the next sequence
                count = 1;
            }
        }

        String result = compressed.toString();

        // TODO: Compare lengths of original vs compressed
        // TODO: Print the shorter one
        // Per the prompt: If compressed is NOT smaller than original, return original.
        if (result.length() < s.length()) {
            System.out.println(result);
        } else {
            System.out.println(s);
        }

        sc.close();
    }
}