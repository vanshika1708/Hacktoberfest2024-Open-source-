import java.util.Scanner;

public class CarNumberCheck {

    // Method to check if a car can run on Sunday
    public static String canCarRunOnSunday(String carNumber) {
        int evenSum = 0;
        int oddSum = 0;

        // Loop through each digit in the car number
        for (int i = 0; i < carNumber.length(); i++) {
            char digitChar = carNumber.charAt(i);

            // Ensure the character is a digit
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);

                // Check if the digit is even or odd and add to the respective sum
                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }
        }

        // Check the conditions: sum of even digits divisible by 4 OR sum of odd digits divisible by 3
        if (evenSum % 4 == 0 || oddSum % 3 == 0) {
            return "Yes";  // Car is allowed to run on Sunday
        } else {
            return "No";  // Car is not allowed to run on Sunday
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of cars
        int N = sc.nextInt();
        sc.nextLine();  // Consume the newline character

        // Process each car number
        for (int i = 0; i < N; i++) {
            String carNumber = sc.nextLine();
            System.out.println(canCarRunOnSunday(carNumber));
        }

        sc.close();
    }
}
