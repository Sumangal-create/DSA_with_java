import java.util.Scanner;

public class HammingCode {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Read binary data
        System.out.print("Enter binary data: ");
        String data = sc.next();

        int m = data.length();

        // Step 2: Calculate number of parity bits
        int r = 0;
        while (Math.pow(2, r) < (m + r + 1)) {
            r++;
        }

        // Step 3: Total bits = Data bits + Parity bits
        int totalBits = m + r;

        // Hamming array (index starts from 1)
        int[] hamming = new int[totalBits + 1];

        int j = 0;

        // Step 4: Insert parity placeholders and data bits
        for (int i = 1; i <= totalBits; i++) {

            // Check if i is a power of 2
            if ((i & (i - 1)) == 0) {

                // Parity position
                hamming[i] = 0;

            } else {

                // Insert data bits from right to left
                hamming[i] = data.charAt(m - 1 - j) - '0';
                j++;
            }
        }

        // Step 5: Calculate parity bits
        for (int i = 0; i < r; i++) {

            int parityPos = (int) Math.pow(2, i);

            int parity = 0;

            for (int k = 1; k <= totalBits; k++) {

                if ((k & parityPos) != 0) {

                    parity ^= hamming[k];
                }
            }

            hamming[parityPos] = parity;
        }

        // Step 6: Print Hamming code
        System.out.print("\nGenerated Hamming Code: ");

        for (int i = totalBits; i >= 1; i--) {
            System.out.print(hamming[i]);
        }

        System.out.println();
    }
}