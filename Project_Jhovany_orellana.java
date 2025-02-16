import java.util.Scanner;

public class Project_Jhovany_orellana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the Policy Number: ");
        int policyNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter the Provider Name: ");
        String providerName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
        String smokingStatus = scanner.nextLine();

        System.out.print("Please enter the Policyholder’s Height (in inches): ");
        double height = 0;
         while (true) {
            System.out.print("Please enter the Policyholder’s Height (in inches): ");
            String heightInput = scanner.nextLine();
            try {
               height = Double.parseDouble(heightInput);
               break;
          } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number for height.");
            }
         }

        System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
        double Weight = 0;
         while (true) {
    System.out.print("Please enter the Policyholder’s Weight (in inches): ");
    String WeightInput = scanner.nextLine();
    try {
        Weight = Double.parseDouble(WeightInput);
        break;
    } catch (NumberFormatException e) {
        System.out.println("Invalid input. Please enter a valid number for height.");
    }
}
        // Create Policy object
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, Weight);

        // Display Policy Details
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder’s First Name: " + policy.getFirstName());
        System.out.println("Policyholder’s Last Name: " + policy.getLastName());
        System.out.println("Policyholder’s Age: " + policy.getAge());
        System.out.println("Policyholder’s Smoking Status: " + policy.getSmokingStatus());
        System.out.printf("Policyholder’s Height: %.1f inches\n", policy.getHeight());
        System.out.printf("Policyholder’s Weight: %.1f pounds\n", policy.getWeight());
        System.out.printf("Policyholder’s BMI: %.2f\n", policy.getBMI());
        System.out.printf("Policy Price: $%.2f\n", policy.calculatePrice());
    }
}