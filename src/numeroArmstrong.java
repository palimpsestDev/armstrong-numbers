import java.util.Scanner;

public class numeroArmstrong {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a positive integer.");
        int number = sc.nextInt();

        while (number < 1) {
            System.out.println("Invalid number. Please enter a positive integer.");
            number = sc.nextInt();
        }

        int totalDigits = Integer.toString(number).length();
        int sum = 0;
        double digit;

        for (int i = 0; i < totalDigits; i++) {
            digit = Double.parseDouble(Character.toString(Integer.toString(number).charAt(i)));
            sum += Math.pow(digit, totalDigits);
        }

        if (sum == number) {
            System.out.print("The number " + number + " is an Armstrong Number because the sum of ");

            for (int i = 0; i < totalDigits; i++) {
                System.out.print(Integer.toString(number).charAt(i) + "^" + totalDigits);

                if (i < totalDigits - 1) {
                    System.out.print(" + ");
                }
            }

            System.out.print(" = " + number);
        } else {
            System.out.println("The number " + number + " is not an Armstrong Number because the sum of ");

            for (int i = 0; i < totalDigits; i++) {
                System.out.print(Integer.toString(number).charAt(i) + "^" + totalDigits);

                if (i < totalDigits - 1) {
                    System.out.print(" + ");
                }
            }

            System.out.print(" != " + number);
        }
        sc.close();
    }
}
